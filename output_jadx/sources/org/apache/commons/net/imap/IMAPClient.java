package org.apache.commons.net.imap;

import ai.onnxruntime.a;
import j1.i;
import org.apache.commons.net.imap.IMAP;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes2.dex */
public class IMAPClient extends IMAP {
    private static final char DQUOTE = '\"';
    private static final String DQUOTE_S = "\"";

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum FETCH_ITEM_NAMES {
        ALL,
        FAST,
        FULL,
        BODY,
        BODYSTRUCTURE,
        ENVELOPE,
        FLAGS,
        INTERNALDATE,
        RFC822,
        UID
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum SEARCH_CRITERIA {
        ALL,
        ANSWERED,
        BCC,
        BEFORE,
        BODY,
        CC,
        DELETED,
        DRAFT,
        FLAGGED,
        FROM,
        HEADER,
        KEYWORD,
        LARGER,
        NEW,
        NOT,
        OLD,
        ON,
        OR,
        RECENT,
        SEEN,
        SENTBEFORE,
        SENTON,
        SENTSINCE,
        SINCE,
        SMALLER,
        SUBJECT,
        TEXT,
        TO,
        UID,
        UNANSWERED,
        UNDELETED,
        UNDRAFT,
        UNFLAGGED,
        UNKEYWORD,
        UNSEEN
    }

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes2.dex */
    public enum STATUS_DATA_ITEMS {
        MESSAGES,
        RECENT,
        UIDNEXT,
        UIDVALIDITY,
        UNSEEN
    }

    public boolean append(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(IMAP.quoteMailboxName(str));
        if (str2 != null) {
            sb.append(" ");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(" ");
            if (str3.charAt(0) == '\"') {
                sb.append(str3);
            } else {
                sb.append('\"');
                sb.append(str3);
                sb.append('\"');
            }
        }
        sb.append(" ");
        if (str4.startsWith(DQUOTE_S) && str4.endsWith(DQUOTE_S)) {
            sb.append(str4);
            return doCommand(IMAPCommand.APPEND, sb.toString());
        }
        sb.append('{');
        sb.append(str4.getBytes(IMAP.__DEFAULT_ENCODING).length);
        sb.append('}');
        if (!IMAPReply.isContinuation(sendCommand(IMAPCommand.APPEND, sb.toString())) || !IMAPReply.isSuccess(sendData(str4))) {
            return false;
        }
        return true;
    }

    public boolean capability() {
        return doCommand(IMAPCommand.CAPABILITY);
    }

    public boolean check() {
        return doCommand(IMAPCommand.CHECK);
    }

    public boolean close() {
        return doCommand(IMAPCommand.CLOSE);
    }

    public boolean copy(String str, String str2) {
        IMAPCommand iMAPCommand = IMAPCommand.COPY;
        StringBuilder w = a.w(str, " ");
        w.append(IMAP.quoteMailboxName(str2));
        return doCommand(iMAPCommand, w.toString());
    }

    public boolean create(String str) {
        return doCommand(IMAPCommand.CREATE, IMAP.quoteMailboxName(str));
    }

    public boolean delete(String str) {
        return doCommand(IMAPCommand.DELETE, IMAP.quoteMailboxName(str));
    }

    public boolean examine(String str) {
        return doCommand(IMAPCommand.EXAMINE, IMAP.quoteMailboxName(str));
    }

    public boolean expunge() {
        return doCommand(IMAPCommand.EXPUNGE);
    }

    public boolean fetch(String str, String str2) {
        return doCommand(IMAPCommand.FETCH, str + " " + str2);
    }

    public boolean list(String str, String str2) {
        return doCommand(IMAPCommand.LIST, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean login(String str, String str2) {
        if (getState() == IMAP.IMAPState.NOT_AUTH_STATE) {
            if (doCommand(IMAPCommand.LOGIN, str + " " + str2)) {
                setState(IMAP.IMAPState.AUTH_STATE);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean logout() {
        return doCommand(IMAPCommand.LOGOUT);
    }

    public boolean lsub(String str, String str2) {
        return doCommand(IMAPCommand.LSUB, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean noop() {
        return doCommand(IMAPCommand.NOOP);
    }

    public boolean rename(String str, String str2) {
        return doCommand(IMAPCommand.RENAME, IMAP.quoteMailboxName(str) + " " + IMAP.quoteMailboxName(str2));
    }

    public boolean search(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("CHARSET ");
            sb.append(str);
        }
        sb.append(str2);
        return doCommand(IMAPCommand.SEARCH, sb.toString());
    }

    public boolean select(String str) {
        return doCommand(IMAPCommand.SELECT, IMAP.quoteMailboxName(str));
    }

    public boolean status(String str, String[] strArr) {
        if (strArr != null && strArr.length >= 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(IMAP.quoteMailboxName(str));
            sb.append(" (");
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    sb.append(" ");
                }
                sb.append(strArr[i10]);
            }
            sb.append(")");
            return doCommand(IMAPCommand.STATUS, sb.toString());
        }
        i.k("STATUS command requires at least one data item name");
        return false;
    }

    public boolean store(String str, String str2, String str3) {
        return doCommand(IMAPCommand.STORE, str + " " + str2 + " " + str3);
    }

    public boolean subscribe(String str) {
        return doCommand(IMAPCommand.SUBSCRIBE, IMAP.quoteMailboxName(str));
    }

    public boolean uid(String str, String str2) {
        return doCommand(IMAPCommand.UID, str + " " + str2);
    }

    public boolean unsubscribe(String str) {
        return doCommand(IMAPCommand.UNSUBSCRIBE, IMAP.quoteMailboxName(str));
    }

    public boolean search(String str) {
        return search(null, str);
    }

    @Deprecated
    public boolean append(String str) {
        return append(str, null, null);
    }

    @Deprecated
    public boolean append(String str, String str2, String str3) {
        StringBuilder u8 = a.u(str);
        if (str2 != null) {
            u8.append(" ");
            u8.append(str2);
        }
        if (str3 != null) {
            if (str3.charAt(0) == '{') {
                u8.append(" ");
                u8.append(str3);
            } else {
                u8.append(" {");
                u8.append(str3);
                u8.append("}");
            }
        }
        return doCommand(IMAPCommand.APPEND, u8.toString());
    }
}
