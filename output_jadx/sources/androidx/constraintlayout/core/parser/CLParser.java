package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    /* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
    /* loaded from: classes.dex */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i10, TYPE type, boolean z9, char[] cArr) {
        CLElement allocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i10]);
        }
        switch (type.ordinal()) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i10++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i10++;
                break;
            case 3:
                allocate = CLNumber.allocate(cArr);
                break;
            case 4:
                allocate = CLString.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.mLineNumber);
        if (z9) {
            allocate.setStart(i10);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i10, char c, CLElement cLElement, char[] cArr) {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c != '\"' && c != '\'') {
                if (c != '[') {
                    if (c != ']') {
                        if (c != '{') {
                            if (c != '}') {
                                switch (c) {
                                    case '+':
                                    case '-':
                                    case '.':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                    case '2':
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                    case '8':
                                    case '9':
                                        return createElement(cLElement, i10, TYPE.NUMBER, true, cArr);
                                    case ',':
                                    case ':':
                                        break;
                                    case '/':
                                        int i11 = i10 + 1;
                                        if (i11 >= cArr.length || cArr[i11] != '/') {
                                            return cLElement;
                                        }
                                        this.mHasComment = true;
                                        return cLElement;
                                    default:
                                        if ((cLElement instanceof CLContainer) && !(cLElement instanceof CLObject)) {
                                            CLElement createElement = createElement(cLElement, i10, TYPE.TOKEN, true, cArr);
                                            CLToken cLToken = (CLToken) createElement;
                                            if (cLToken.validate(c, i10)) {
                                                return createElement;
                                            }
                                            throw new CLParsingException("incorrect token <" + c + "> at line " + this.mLineNumber, cLToken);
                                        }
                                        return createElement(cLElement, i10, TYPE.KEY, true, cArr);
                                }
                            }
                        } else {
                            return createElement(cLElement, i10, TYPE.OBJECT, true, cArr);
                        }
                    }
                    cLElement.setEnd(i10 - 1);
                    CLElement container = cLElement.getContainer();
                    container.setEnd(i10);
                    return container;
                }
                return createElement(cLElement, i10, TYPE.ARRAY, true, cArr);
            }
            if (cLElement instanceof CLObject) {
                return createElement(cLElement, i10, TYPE.KEY, true, cArr);
            }
            return createElement(cLElement, i10, TYPE.STRING, true, cArr);
        }
        return cLElement;
    }

    public CLObject parse() {
        int i10;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i11 = 1;
        this.mLineNumber = 1;
        boolean z9 = false;
        int i12 = 0;
        while (true) {
            if (i12 < length) {
                char c = charArray[i12];
                if (c == '{') {
                    break;
                }
                if (c == '\n') {
                    this.mLineNumber++;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            CLObject allocate = CLObject.allocate(charArray);
            allocate.setLine(this.mLineNumber);
            allocate.setStart(i12);
            int i13 = i12 + 1;
            CLElement cLElement = allocate;
            while (i13 < length) {
                char c10 = charArray[i13];
                if (c10 == '\n') {
                    this.mLineNumber += i11;
                }
                if (this.mHasComment) {
                    if (c10 == '\n') {
                        this.mHasComment = z9;
                    } else {
                        i10 = i11;
                        i13++;
                        i11 = i10;
                        z9 = false;
                    }
                }
                if (cLElement == null) {
                    break;
                }
                if (cLElement.isDone()) {
                    cLElement = getNextJsonElement(i13, c10, cLElement, charArray);
                } else if (cLElement instanceof CLObject) {
                    if (c10 == '}') {
                        cLElement.setEnd(i13 - 1);
                    } else {
                        cLElement = getNextJsonElement(i13, c10, cLElement, charArray);
                    }
                } else if (cLElement instanceof CLArray) {
                    if (c10 == ']') {
                        cLElement.setEnd(i13 - 1);
                    } else {
                        cLElement = getNextJsonElement(i13, c10, cLElement, charArray);
                    }
                } else {
                    boolean z10 = cLElement instanceof CLString;
                    if (z10) {
                        long j10 = cLElement.mStart;
                        if (charArray[(int) j10] == c10) {
                            cLElement.setStart(j10 + 1);
                            cLElement.setEnd(i13 - 1);
                        }
                    } else {
                        if (cLElement instanceof CLToken) {
                            CLToken cLToken = (CLToken) cLElement;
                            i10 = i11;
                            if (!cLToken.validate(c10, i13)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                            }
                        } else {
                            i10 = i11;
                        }
                        if ((cLElement instanceof CLKey) || z10) {
                            long j11 = cLElement.mStart;
                            char c11 = charArray[(int) j11];
                            if ((c11 == '\'' || c11 == '\"') && c11 == c10) {
                                cLElement.setStart(j11 + 1);
                                cLElement.setEnd(i13 - 1);
                            }
                        }
                        if (!cLElement.isDone() && (c10 == '}' || c10 == ']' || c10 == ',' || c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n' || c10 == ':')) {
                            long j12 = i13 - 1;
                            cLElement.setEnd(j12);
                            if (c10 == '}' || c10 == ']') {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j12);
                                if (cLElement instanceof CLKey) {
                                    cLElement = cLElement.getContainer();
                                    cLElement.setEnd(j12);
                                }
                            }
                        }
                        if (cLElement.isDone() && (!(cLElement instanceof CLKey) || ((CLKey) cLElement).mElements.size() > 0)) {
                            cLElement = cLElement.getContainer();
                        }
                        i13++;
                        i11 = i10;
                        z9 = false;
                    }
                }
                i10 = i11;
                if (cLElement.isDone()) {
                    cLElement = cLElement.getContainer();
                }
                i13++;
                i11 = i10;
                z9 = false;
            }
            while (cLElement != null && !cLElement.isDone()) {
                if (cLElement instanceof CLString) {
                    cLElement.setStart(((int) cLElement.mStart) + 1);
                }
                cLElement.setEnd(length - 1);
                cLElement = cLElement.getContainer();
            }
            if (sDebug) {
                System.out.println("Root: " + allocate.toJSON());
            }
            return allocate;
        }
        throw new CLParsingException("invalid json content", null);
    }

    public static CLObject parse(String str) {
        return new CLParser(str).parse();
    }
}
