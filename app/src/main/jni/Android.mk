LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := helloc
LOCAL_SRC_FILES := HelloC.c
include $(BUILD_SHARED_LIBRARY)