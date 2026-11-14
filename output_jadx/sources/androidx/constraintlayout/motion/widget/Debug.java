package androidx.constraintlayout.motion.widget;

import ai.onnxruntime.a;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import org.apache.commons.io.FilenameUtils;

/* compiled from: r8-map-id-94e2637d1b30c6542972a7fc4ced35aa6da258c4e6702fc7c9cbf0ebc32bec75 */
/* loaded from: classes.dex */
public class Debug {
    public static void dumpLayoutParams(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            PrintStream printStream = System.out;
            StringBuilder w = a.w(str2, "     ");
            w.append(getName(childAt));
            printStream.println(w.toString());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            for (Field field : layoutParams.getClass().getFields()) {
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + "       " + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void dumpPoc(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        PrintStream printStream = System.out;
        StringBuilder w = a.w(str, "------------- ");
        w.append(cls.getName());
        w.append(" --------------------");
        printStream.println(w.toString());
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        PrintStream printStream2 = System.out;
        StringBuilder w9 = a.w(str, "------------- ");
        w9.append(cls.getSimpleName());
        w9.append(" --------------------");
        printStream2.println(w9.toString());
    }

    public static String getActionType(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getCallFrom(int i10) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i10 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLoc() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String getLocation() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getLocation2() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String getName(Context context, int[] iArr) {
        String str;
        String str2;
        try {
            String str3 = iArr.length + "[";
            for (int i10 = 0; i10 < iArr.length; i10++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                if (i10 != 0) {
                    str = " ";
                } else {
                    str = "";
                }
                sb.append(str);
                String sb2 = sb.toString();
                try {
                    str2 = context.getResources().getResourceEntryName(iArr[i10]);
                } catch (Resources.NotFoundException unused) {
                    str2 = "? " + iArr[i10] + " ";
                }
                str3 = sb2 + str2;
            }
            return str3 + "]";
        } catch (Exception e) {
            Log.v("DEBUG", e.toString());
            return "UNKNOWN";
        }
    }

    public static String getState(MotionLayout motionLayout, int i10, int i11) {
        int length;
        if (i10 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i10);
        if (i11 != -1) {
            if (resourceEntryName.length() > i11) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i11 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i11) / length).toString().replace((char) 0, FilenameUtils.EXTENSION_SEPARATOR) + "_", "_");
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }

    public static void logStack(String str, String str2, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i10, stackTrace.length - 1);
        String str3 = " ";
        for (int i11 = 1; i11 <= min; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str4 = ".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") " + stackTrace[i11].getMethodName();
            str3 = str3.concat(" ");
            Log.v(str, str2 + str3 + str4 + str3);
        }
    }

    public static void printStack(String str, int i10) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i10, stackTrace.length - 1);
        String str2 = " ";
        for (int i11 = 1; i11 <= min; i11++) {
            StackTraceElement stackTraceElement = stackTrace[i11];
            String str3 = ".(" + stackTrace[i11].getFileName() + ":" + stackTrace[i11].getLineNumber() + ") ";
            str2 = str2.concat(" ");
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static String getState(MotionLayout motionLayout, int i10) {
        return getState(motionLayout, i10, -1);
    }

    public static String getName(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                return a.e(i10, "?");
            }
        }
        return "UNKNOWN";
    }

    public static String getName(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        PrintStream printStream = System.out;
        StringBuilder x9 = a.x(" >>>>>>>>>>>>>>>>>>. dump ", str2, "  ");
        x9.append(layoutParams.getClass().getName());
        printStream.println(x9.toString());
        for (Field field : layoutParams.getClass().getFields()) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + "       " + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump ".concat(str2));
    }
}
