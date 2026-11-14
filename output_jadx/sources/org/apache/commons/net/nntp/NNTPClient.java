package org.apache.commons.net.nntp;

import ai.onnxruntime.a;
import ai.onnxruntime.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.io.DotTerminatedMessageReader;
import org.apache.commons.net.io.DotTerminatedMessageWriter;
import org.apache.commons.net.util.NetConstants;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class NNTPClient extends NNTP {
    private void ai2ap(ArticleInfo articleInfo, ArticlePointer articlePointer) {
        if (articlePointer != null) {
            articlePointer.articleId = articleInfo.articleId;
            articlePointer.articleNumber = (int) articleInfo.articleNumber;
        }
    }

    private ArticleInfo ap2ai(ArticlePointer articlePointer) {
        if (articlePointer == null) {
            return null;
        }
        return new ArticleInfo();
    }

    public static Article parseArticleEntry(String str) {
        Article article = new Article();
        article.setSubject(str);
        String[] split = str.split("\t");
        if (split.length > 6) {
            try {
                article.setArticleNumber(Long.parseLong(split[0]));
                article.setSubject(split[1]);
                article.setFrom(split[2]);
                article.setDate(split[3]);
                article.setArticleId(split[4]);
                article.addReference(split[5]);
            } catch (NumberFormatException unused) {
            }
        }
        return article;
    }

    private void parseArticlePointer(String str, ArticleInfo articleInfo) {
        String[] split = str.split(" ");
        if (split.length >= 3) {
            try {
                articleInfo.articleNumber = Long.parseLong(split[1]);
                articleInfo.articleId = split[2];
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse article pointer.\nServer reply: ".concat(str));
    }

    private static void parseGroupReply(String str, NewsgroupInfo newsgroupInfo) {
        String[] split = str.split(" ");
        if (split.length >= 5) {
            try {
                newsgroupInfo.setArticleCount(Long.parseLong(split[1]));
                newsgroupInfo.setFirstArticle(Long.parseLong(split[2]));
                newsgroupInfo.setLastArticle(Long.parseLong(split[3]));
                newsgroupInfo.setNewsgroup(split[4]);
                newsgroupInfo.setPostingPermission(0);
                return;
            } catch (NumberFormatException unused) {
            }
        }
        throw new MalformedServerReplyException("Could not parse newsgroup info.\nServer reply: ".concat(str));
    }

    public static NewsgroupInfo parseNewsgroupListEntry(String str) {
        String[] split = str.split(" ");
        if (split.length >= 4) {
            NewsgroupInfo newsgroupInfo = new NewsgroupInfo();
            newsgroupInfo.setNewsgroup(split[0]);
            try {
                long parseLong = Long.parseLong(split[1]);
                long parseLong2 = Long.parseLong(split[2]);
                newsgroupInfo.setFirstArticle(parseLong2);
                newsgroupInfo.setLastArticle(parseLong);
                if (parseLong2 == 0 && parseLong == 0) {
                    newsgroupInfo.setArticleCount(0L);
                } else {
                    newsgroupInfo.setArticleCount((parseLong - parseLong2) + 1);
                }
                char charAt = split[3].charAt(0);
                if (charAt != 'M') {
                    if (charAt != 'N') {
                        if (charAt != 'Y' && charAt != 'y') {
                            if (charAt != 'm') {
                                if (charAt != 'n') {
                                    newsgroupInfo.setPostingPermission(0);
                                    return newsgroupInfo;
                                }
                            }
                        } else {
                            newsgroupInfo.setPostingPermission(2);
                            return newsgroupInfo;
                        }
                    }
                    newsgroupInfo.setPostingPermission(3);
                    return newsgroupInfo;
                }
                newsgroupInfo.setPostingPermission(1);
                return newsgroupInfo;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        throw new org.apache.commons.net.MalformedServerReplyException(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.apache.commons.net.nntp.NewsgroupInfo[] readNewsgroupListing() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2048(0x800, float:2.87E-42)
            r0.<init>(r1)
            org.apache.commons.net.io.DotTerminatedMessageReader r1 = new org.apache.commons.net.io.DotTerminatedMessageReader
            java.io.BufferedReader r2 = r4._reader_
            r1.<init>(r2)
        Le:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L26
            org.apache.commons.net.nntp.NewsgroupInfo r3 = parseNewsgroupListEntry(r2)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            r0.add(r3)     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L3c
        L20:
            org.apache.commons.net.MalformedServerReplyException r0 = new org.apache.commons.net.MalformedServerReplyException     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L26:
            r1.close()
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L33
            org.apache.commons.net.nntp.NewsgroupInfo[] r0 = org.apache.commons.net.nntp.NewsgroupInfo.EMPTY_ARRAY
            return r0
        L33:
            org.apache.commons.net.nntp.NewsgroupInfo[] r1 = org.apache.commons.net.nntp.NewsgroupInfo.EMPTY_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.net.nntp.NewsgroupInfo[] r0 = (org.apache.commons.net.nntp.NewsgroupInfo[]) r0
            return r0
        L3c:
            r1.close()     // Catch: java.lang.Throwable -> L40
            goto L44
        L40:
            r1 = move-exception
            r0.addSuppressed(r1)
        L44:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.nntp.NNTPClient.readNewsgroupListing():org.apache.commons.net.nntp.NewsgroupInfo[]");
    }

    private BufferedReader retrieve(int i10, String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(sendCommand(i10, str))) {
                return null;
            }
        } else if (!NNTPReply.isPositiveCompletion(sendCommand(i10))) {
            return null;
        }
        if (articleInfo != null) {
            parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public boolean authenticate(String str, String str2) {
        if (authinfoUser(str) == 381 && authinfoPass(str2) == 281) {
            this._isAllowedToPost = true;
            return true;
        }
        return false;
    }

    public boolean completePendingCommand() {
        return NNTPReply.isPositiveCompletion(getReply());
    }

    public Writer forwardArticle(String str) {
        if (!NNTPReply.isPositiveIntermediate(ihave(str))) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    public Iterable<Article> iterateArticleInfo(long j10, long j11) {
        BufferedReader retrieveArticleInfo = retrieveArticleInfo(j10, j11);
        if (retrieveArticleInfo != null) {
            return new ArticleIterator(new ReplyIterator(retrieveArticleInfo, false));
        }
        b.w(getReplyString(), "XOVER command failed: ");
        return null;
    }

    public Iterable<String> iterateNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        b.w(getReplyString(), "NEWNEWS command failed: ");
        return null;
    }

    public Iterable<String> iterateNewNewsgroupListing(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return new ReplyIterator(this._reader_);
        }
        b.w(getReplyString(), "NEWGROUPS command failed: ");
        return null;
    }

    public Iterable<NewsgroupInfo> iterateNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        return new NewsgroupIterator(iterateNewNewsgroupListing(newGroupsOrNewsQuery));
    }

    public Iterable<String> iterateNewsgroupListing(String str) {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return new ReplyIterator(this._reader_);
        }
        StringBuilder x9 = a.x("LIST ACTIVE ", str, " command failed: ");
        x9.append(getReplyString());
        throw new IOException(x9.toString());
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups() {
        return new NewsgroupIterator(iterateNewsgroupListing());
    }

    public String listHelp() {
        if (!NNTPReply.isInformational(help())) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
            try {
                IOUtils.copyLarge(dotTerminatedMessageReader, stringWriter);
                String stringWriter2 = stringWriter.toString();
                dotTerminatedMessageReader.close();
                stringWriter.close();
                return stringWriter2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                stringWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String[] listNewNews(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newnews(newGroupsOrNewsQuery.getNewsgroups(), newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        new ArrayList();
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        try {
            List<String> readLines = IOUtils.readLines(dotTerminatedMessageReader);
            dotTerminatedMessageReader.close();
            return (String[]) readLines.toArray(NetConstants.EMPTY_STRING_ARRAY);
        } finally {
        }
    }

    public NewsgroupInfo[] listNewNewsgroups(NewGroupsOrNewsQuery newGroupsOrNewsQuery) {
        if (!NNTPReply.isPositiveCompletion(newgroups(newGroupsOrNewsQuery.getDate(), newGroupsOrNewsQuery.getTime(), newGroupsOrNewsQuery.isGMT(), newGroupsOrNewsQuery.getDistributions()))) {
            return null;
        }
        return readNewsgroupListing();
    }

    public NewsgroupInfo[] listNewsgroups() {
        if (!NNTPReply.isPositiveCompletion(list())) {
            return null;
        }
        return readNewsgroupListing();
    }

    public String[] listOverviewFmt() {
        if (!NNTPReply.isPositiveCompletion(sendCommand("LIST", "OVERVIEW.FMT"))) {
            return null;
        }
        DotTerminatedMessageReader dotTerminatedMessageReader = new DotTerminatedMessageReader(this._reader_);
        try {
            String[] strArr = (String[]) IOUtils.readLines(dotTerminatedMessageReader).toArray(NetConstants.EMPTY_STRING_ARRAY);
            dotTerminatedMessageReader.close();
            return strArr;
        } catch (Throwable th) {
            try {
                dotTerminatedMessageReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean logout() {
        return NNTPReply.isPositiveCompletion(quit());
    }

    public Writer postArticle() {
        if (!NNTPReply.isPositiveIntermediate(post())) {
            return null;
        }
        return new DotTerminatedMessageWriter(this._writer_);
    }

    @Deprecated
    public Reader retrieveArticle(int i10, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle(i10, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticleBody(int i10, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody(i10, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i10, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader(i10, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    public BufferedReader retrieveArticleInfo(long j10, long j11) {
        return retrieveArticleInfo(j10 + "-" + j11);
    }

    public BufferedReader retrieveHeader(String str, long j10, long j11) {
        return retrieveHeader(str, j10 + "-" + j11);
    }

    public boolean selectArticle(String str, ArticleInfo articleInfo) {
        if (str != null) {
            if (!NNTPReply.isPositiveCompletion(stat(str))) {
                return false;
            }
        } else if (!NNTPReply.isPositiveCompletion(stat())) {
            return false;
        }
        if (articleInfo != null) {
            parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectNewsgroup(String str, NewsgroupInfo newsgroupInfo) {
        if (!NNTPReply.isPositiveCompletion(group(str))) {
            return false;
        }
        if (newsgroupInfo != null) {
            parseGroupReply(getReplyString(), newsgroupInfo);
            return true;
        }
        return true;
    }

    public boolean selectNextArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(next())) {
            return false;
        }
        if (articleInfo != null) {
            parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public boolean selectPreviousArticle(ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(last())) {
            return false;
        }
        if (articleInfo != null) {
            parseArticlePointer(getReplyString(), articleInfo);
            return true;
        }
        return true;
    }

    public Iterable<NewsgroupInfo> iterateNewsgroups(String str) {
        return new NewsgroupIterator(iterateNewsgroupListing(str));
    }

    @Deprecated
    public Reader retrieveArticle(int i10) {
        return retrieveArticle(i10);
    }

    @Deprecated
    public Reader retrieveArticleBody(int i10) {
        return retrieveArticleBody(i10);
    }

    @Deprecated
    public Reader retrieveArticleHeader(int i10) {
        return retrieveArticleHeader(i10);
    }

    public Reader retrieveArticle() {
        return retrieveArticle((String) null);
    }

    public Reader retrieveArticleBody() {
        return retrieveArticleBody((String) null);
    }

    public Reader retrieveArticleHeader() {
        return retrieveArticleHeader((String) null);
    }

    public BufferedReader retrieveArticle(long j10) {
        return retrieveArticle(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleBody(long j10) {
        return retrieveArticleBody(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticleHeader(long j10) {
        return retrieveArticleHeader(j10, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticle(long j10, ArticleInfo articleInfo) {
        return retrieve(0, j10, articleInfo);
    }

    public BufferedReader retrieveArticleBody(long j10, ArticleInfo articleInfo) {
        return retrieve(1, j10, articleInfo);
    }

    public BufferedReader retrieveArticleHeader(long j10, ArticleInfo articleInfo) {
        return retrieve(3, j10, articleInfo);
    }

    public NewsgroupInfo[] listNewsgroups(String str) {
        if (NNTPReply.isPositiveCompletion(listActive(str))) {
            return readNewsgroupListing();
        }
        return null;
    }

    public Reader retrieveArticle(String str) {
        return retrieveArticle(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleBody(String str) {
        return retrieveArticleBody(str, (ArticleInfo) null);
    }

    public Reader retrieveArticleHeader(String str) {
        return retrieveArticleHeader(str, (ArticleInfo) null);
    }

    public BufferedReader retrieveArticle(String str, ArticleInfo articleInfo) {
        return retrieve(0, str, articleInfo);
    }

    public BufferedReader retrieveArticleBody(String str, ArticleInfo articleInfo) {
        return retrieve(1, str, articleInfo);
    }

    public BufferedReader retrieveArticleHeader(String str, ArticleInfo articleInfo) {
        return retrieve(3, str, articleInfo);
    }

    @Deprecated
    public Reader retrieveArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticle = retrieveArticle(str, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticle;
    }

    @Deprecated
    public Reader retrieveArticleBody(String str, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticleBody = retrieveArticleBody(str, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticleBody;
    }

    @Deprecated
    public Reader retrieveArticleHeader(String str, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        BufferedReader retrieveArticleHeader = retrieveArticleHeader(str, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return retrieveArticleHeader;
    }

    public boolean selectNewsgroup(String str) {
        return selectNewsgroup(str, null);
    }

    public boolean selectNextArticle() {
        return selectNextArticle((ArticleInfo) null);
    }

    public boolean selectPreviousArticle() {
        return selectPreviousArticle((ArticleInfo) null);
    }

    @Deprecated
    public boolean selectNextArticle(ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        boolean selectNextArticle = selectNextArticle(ap2ai);
        ai2ap(ap2ai, articlePointer);
        return selectNextArticle;
    }

    @Deprecated
    public boolean selectPreviousArticle(ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        boolean selectPreviousArticle = selectPreviousArticle(ap2ai);
        ai2ap(ap2ai, articlePointer);
        return selectPreviousArticle;
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i10, int i11) {
        return retrieveArticleInfo(i10, i11);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i10, int i11) {
        return retrieveHeader(str, i10, i11);
    }

    public BufferedReader retrieveArticleInfo(long j10) {
        return retrieveArticleInfo(Long.toString(j10));
    }

    public BufferedReader retrieveHeader(String str, long j10) {
        return retrieveHeader(str, Long.toString(j10));
    }

    @Deprecated
    public Reader retrieveArticleInfo(int i10) {
        return retrieveArticleInfo(i10);
    }

    @Deprecated
    public Reader retrieveHeader(String str, int i10) {
        return retrieveHeader(str, i10);
    }

    private BufferedReader retrieveArticleInfo(String str) {
        if (NNTPReply.isPositiveCompletion(xover(str))) {
            return new DotTerminatedMessageReader(this._reader_);
        }
        return null;
    }

    private BufferedReader retrieveHeader(String str, String str2) {
        if (NNTPReply.isPositiveCompletion(xhdr(str, str2))) {
            return new DotTerminatedMessageReader(this._reader_);
        }
        return null;
    }

    @Deprecated
    public boolean selectArticle(ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        boolean selectArticle = selectArticle(ap2ai);
        ai2ap(ap2ai, articlePointer);
        return selectArticle;
    }

    @Deprecated
    public boolean selectArticle(int i10) {
        return selectArticle(i10);
    }

    @Deprecated
    public boolean selectArticle(int i10, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        boolean selectArticle = selectArticle(i10, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return selectArticle;
    }

    private BufferedReader retrieve(int i10, long j10, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(sendCommand(i10, Long.toString(j10)))) {
            return null;
        }
        if (articleInfo != null) {
            parseArticlePointer(getReplyString(), articleInfo);
        }
        return new DotTerminatedMessageReader(this._reader_);
    }

    public Iterable<String> iterateNewsgroupListing() {
        if (NNTPReply.isPositiveCompletion(list())) {
            return new ReplyIterator(this._reader_);
        }
        b.w(getReplyString(), "LIST command failed: ");
        return null;
    }

    public boolean selectArticle(long j10) {
        return selectArticle(j10, (ArticleInfo) null);
    }

    public boolean selectArticle(long j10, ArticleInfo articleInfo) {
        if (!NNTPReply.isPositiveCompletion(stat(j10))) {
            return false;
        }
        if (articleInfo == null) {
            return true;
        }
        parseArticlePointer(getReplyString(), articleInfo);
        return true;
    }

    public boolean selectArticle(String str) {
        return selectArticle(str, (ArticleInfo) null);
    }

    public boolean selectArticle(ArticleInfo articleInfo) {
        return selectArticle((String) null, articleInfo);
    }

    @Deprecated
    public boolean selectArticle(String str, ArticlePointer articlePointer) {
        ArticleInfo ap2ai = ap2ai(articlePointer);
        boolean selectArticle = selectArticle(str, ap2ai);
        ai2ap(ap2ai, articlePointer);
        return selectArticle;
    }
}
