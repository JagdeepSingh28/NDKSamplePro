//
// Created by Jagdeep.Singh on 08-08-2016.
//

#include "HelloC.h"

#include <jni.h>

jstring Java_com_infogain_jagdeepsingh_ndkapp_HelloAndroid_getMsgFromJni( JNIEnv* env, jobject thiz) {
    return (*env)->NewStringUTF(env, "Hello from C World");
}
