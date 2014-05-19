/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class de_fh_zwickau_asmplugin_WinApi */

#ifndef _Included_de_fh_zwickau_asmplugin_WinApi
#define _Included_de_fh_zwickau_asmplugin_WinApi
#ifdef __cplusplus
extern "C" {
#endif
#undef de_fh_zwickau_asmplugin_WinApi_SW_HIDE
#define de_fh_zwickau_asmplugin_WinApi_SW_HIDE 0i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_MAXIMIZE
#define de_fh_zwickau_asmplugin_WinApi_SW_MAXIMIZE 3i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_MINIMIZE
#define de_fh_zwickau_asmplugin_WinApi_SW_MINIMIZE 6i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOW
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOW 5i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWDEFAULT
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWDEFAULT 10i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWMAXIMIZED
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWMAXIMIZED 3i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWMINIMIZED
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWMINIMIZED 2i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWMINNOACTIVE
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWMINNOACTIVE 7i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWNA
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWNA 8i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWNOACTIVATE
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWNOACTIVATE 4i64
#undef de_fh_zwickau_asmplugin_WinApi_SW_SHOWNORMAL
#define de_fh_zwickau_asmplugin_WinApi_SW_SHOWNORMAL 1i64
/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    getShortName
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_getShortName
  (JNIEnv *, jclass, jstring);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    shExecute
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
 */
JNIEXPORT void JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_shExecute
  (JNIEnv *, jclass, jstring, jstring, jstring, jlong);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    isWinNT
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_isWinNT
  (JNIEnv *, jclass);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    isWin32Exe
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_isWin32Exe
  (JNIEnv *, jclass, jstring);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    isWinConsole
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_isWinConsole
  (JNIEnv *, jclass, jstring);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    getWindowsDirectoryAPI
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_getWindowsDirectoryAPI
  (JNIEnv *, jclass);

/*
 * Class:     de_fh_zwickau_asmplugin_WinApi
 * Method:    getWindowsSystemDirectoryAPI
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_de_fh_1zwickau_asmplugin_WinApi_getWindowsSystemDirectoryAPI
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif