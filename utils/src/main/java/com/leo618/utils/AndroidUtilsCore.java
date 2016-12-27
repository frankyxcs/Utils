package com.leo618.utils;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * function:工具集入口类
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@SuppressLint("StaticFieldLeak")
public final class AndroidUtilsCore {
    private static Context mContext;

    public static void install(Context context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new IllegalArgumentException("you must install AndroidUtilsCore with method install(Context context) first.");
        }
        return mContext;
    }
}