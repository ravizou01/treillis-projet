/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.avizou.s2;

import java.util.List;
import java.util.Map;
import javafx.application.HostServices;
import javafx.application.Preloader;
import javafx.stage.Stage;


/**
 *
 * @author romainavizou
 */
public interface Application {
   

public abstract class Application1 {

    public static abstract class Parameters {

        public Parameters() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: return
             *  */
            // </editor-fold>
        }

        public abstract List<String> getRaw();

        public abstract List<String> getUnnamed();

        public abstract Map<String, String> getNamed();
    }
    public static final String STYLESHEET_CASPIAN = "CASPIAN";
    public static final String STYLESHEET_MODENA = "MODENA";
    private HostServices hostServices;
    private static String userAgentStylesheet;

    public static void launch(Class<? extends Application> type, String[] strings) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #1                  // Method com/sun/javafx/application/LauncherImpl.launchApplication:(Ljava/lang/Class;[Ljava/lang/String;)V
         * 5: return
         *  */
        // </editor-fold>
    }

    public static void launch(String[] strings) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #7                  // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 3: invokevirtual #13                 // Method java/lang/Thread.getStackTrace:()[Ljava/lang/StackTraceElement;
         * 6: astore_1
         * 7: iconst_0
         * 8: istore_2
         * 9: aconst_null
         * 10: astore_3
         * 11: aload_1
         * 12: astore        4
         * 14: aload         4
         * 16: arraylength
         * 17: istore        5
         * 19: iconst_0
         * 20: istore        6
         * 22: iload         6
         * 24: iload         5
         * 26: if_icmpge     91
         * 29: aload         4
         * 31: iload         6
         * 33: aaload
         * 34: astore        7
         * 36: aload         7
         * 38: invokevirtual #17                 // Method java/lang/StackTraceElement.getClassName:()Ljava/lang/String;
         * 41: astore        8
         * 43: aload         7
         * 45: invokevirtual #23                 // Method java/lang/StackTraceElement.getMethodName:()Ljava/lang/String;
         * 48: astore        9
         * 50: iload_2
         * 51: ifeq          60
         * 54: aload         8
         * 56: astore_3
         * 57: goto          91
         * 60: ldc           #26                 // class javafx/application/Application
         * 62: invokevirtual #28                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 65: aload         8
         * 67: invokevirtual #33                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 70: ifeq          85
         * 73: ldc           #39                 // String launch
         * 75: aload         9
         * 77: invokevirtual #33                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
         * 80: ifeq          85
         * 83: iconst_1
         * 84: istore_2
         * 85: iinc          6, 1
         * 88: goto          22
         * 91: aload_3
         * 92: ifnonnull     105
         * 95: new           #41                 // class java/lang/RuntimeException
         * 98: dup
         * 99: ldc           #43                 // String Error: unable to determine Application class
         * 101: invokespecial #45                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
         * 104: athrow
         * 105: aload_3
         * 106: iconst_0
         * 107: invokestatic  #7                  // Method java/lang/Thread.currentThread:()Ljava/lang/Thread;
         * 110: invokevirtual #49                 // Method java/lang/Thread.getContextClassLoader:()Ljava/lang/ClassLoader;
         * 113: invokestatic  #53                 // Method java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
         * 116: astore        4
         * 118: ldc           #26                 // class javafx/application/Application
         * 120: aload         4
         * 122: invokevirtual #57                 // Method java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
         * 125: ifeq          141
         * 128: aload         4
         * 130: astore        5
         * 132: aload         5
         * 134: aload_0
         * 135: invokestatic  #1                  // Method com/sun/javafx/application/LauncherImpl.launchApplication:(Ljava/lang/Class;[Ljava/lang/String;)V
         * 138: goto          156
         * 141: new           #41                 // class java/lang/RuntimeException
         * 144: dup
         * 145: aload         4
         * 147: invokedynamic #61,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/Class;)Ljava/lang/String;
         * 152: invokespecial #45                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
         * 155: athrow
         * 156: goto          176
         * 159: astore        4
         * 161: aload         4
         * 163: athrow
         * 164: astore        4
         * 166: new           #41                 // class java/lang/RuntimeException
         * 169: dup
         * 170: aload         4
         * 172: invokespecial #67                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
         * 175: athrow
         * 176: return
         * Exception table:
         * from    to  target type
         * 105   156   159   Class java/lang/RuntimeException
         * 105   156   164   Class java/lang/Exception
         *  */
        // </editor-fold>
    }

    public Application1() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #70                 // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: aconst_null
         * 6: putfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 9: return
         *  */
        // </editor-fold>
    }

    public void init() throws Exception {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    public abstract void start(Stage stage) throws Exception;

    public void stop() throws Exception {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: return
         *  */
        // </editor-fold>
    }

    public final HostServices getHostServices() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_1
         * 3: monitorenter
         * 4: aload_0
         * 5: getfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 8: ifnonnull     23
         * 11: aload_0
         * 12: new           #79                 // class javafx/application/HostServices
         * 15: dup
         * 16: aload_0
         * 17: invokespecial #81                 // Method javafx/application/HostServices."<init>":(Ljavafx/application/Application;)V
         * 20: putfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 23: aload_0
         * 24: getfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 27: aload_1
         * 28: monitorexit
         * 29: areturn
         * 30: astore_2
         * 31: aload_1
         * 32: monitorexit
         * 33: aload_2
         * 34: athrow
         * Exception table:
         * from    to  target type
         * 4    29    30   any
         * 30    33    30   any
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: dup
         * 2: astore_1
         * 3: monitorenter
         * 4: aload_0
         * 5: getfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 8: ifnonnull     23
         * 11: aload_0
         * 12: new           #79                 // class javafx/application/HostServices
         * 15: dup
         * 16: aload_0
         * 17: invokespecial #81                 // Method javafx/application/HostServices."<init>":(Ljavafx/application/Application;)V
         * 20: putfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 23: aload_0
         * 24: getfield      #75                 // Field hostServices:Ljavafx/application/HostServices;
         * 27: aload_1
         * 28: monitorexit
         * 29: areturn
         * 30: astore_2
         * 31: aload_1
         * 32: monitorexit
         * 33: aload_2
         * 34: athrow
         * Exception table:
         * from    to  target type
         * 4    29    30   any
         * 30    33    30   any
         *  */
        // </editor-fold>
    }

    public final Parameters getParameters() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #84                 // Method com/sun/javafx/application/ParametersImpl.getParameters:(Ljavafx/application/Application;)Ljavafx/application/Application$Parameters;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokestatic  #84                 // Method com/sun/javafx/application/ParametersImpl.getParameters:(Ljavafx/application/Application;)Ljavafx/application/Application$Parameters;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    public final void notifyPreloader(Preloader.PreloaderNotification pn) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokestatic  #90                 // Method com/sun/javafx/application/LauncherImpl.notifyPreloader:(Ljavafx/application/Application;Ljavafx/application/Preloader$PreloaderNotification;)V
         * 5: return
         *  */
        // </editor-fold>
    }

    public static String getUserAgentStylesheet() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #94                 // Field userAgentStylesheet:Ljava/lang/String;
         * 3: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #94                 // Field userAgentStylesheet:Ljava/lang/String;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static void setUserAgentStylesheet(String string) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: putstatic     #94                 // Field userAgentStylesheet:Ljava/lang/String;
         * 4: aload_0
         * 5: ifnonnull     14
         * 8: invokestatic  #98                 // Method com/sun/javafx/application/PlatformImpl.setDefaultPlatformUserAgentStylesheet:()V
         * 11: goto          18
         * 14: aload_0
         * 15: invokestatic  #103                // Method com/sun/javafx/application/PlatformImpl.setPlatformUserAgentStylesheet:(Ljava/lang/String;)V
         * 18: return
         *  */
        // </editor-fold>
    }
}
}
