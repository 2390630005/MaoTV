package com.xunlei.downloadlib;

import android.content.Context;

import com.xunlei.downloadlib.parameter.BtIndexSet;
import com.xunlei.downloadlib.parameter.BtSubTaskDetail;
import com.xunlei.downloadlib.parameter.GetFileName;
import com.xunlei.downloadlib.parameter.GetTaskId;
import com.xunlei.downloadlib.parameter.ThunderUrlInfo;
import com.xunlei.downloadlib.parameter.TorrentInfo;
import com.xunlei.downloadlib.parameter.XLTaskInfo;
import com.xunlei.downloadlib.parameter.XLTaskLocalUrl;

class XLLoader {

    public XLLoader() {
        System.loadLibrary("xl_thunder_sdk");
    }

    public native int createBtMagnetTask(String str, String str2, String str3, GetTaskId getTaskId);

    public native int createBtTask(String str, String str2, int i, int i2, int i3, GetTaskId getTaskId);

    public native int createEmuleTask(String str, String str2, String str3, int i, int i2, GetTaskId getTaskId);

    public native int createP2spTask(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, GetTaskId getTaskId);

    public native int deselectBtSubTask(long j, BtIndexSet btIndexSet);

    public native int getBtSubTaskInfo(long j, int i, BtSubTaskDetail btSubTaskDetail);

    public native int getFileNameFromUrl(String str, GetFileName getFileName);

    public native int getLocalUrl(String str, XLTaskLocalUrl xLTaskLocalUrl);

    public native int getTaskInfo(long j, int i, XLTaskInfo xLTaskInfo);

    public native int getTorrentInfo(String str, TorrentInfo torrentInfo);

    public native int init(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2);

    public native int parserThunderUrl(String str, ThunderUrlInfo thunderUrlInfo);

    public native int releaseTask(long j);

    public native int setAccelerateToken(long j, int i, long j2, int i2, String str);

    public native int setDownloadTaskOrigin(long j, String str);

    public native int setOriginUserAgent(long j, String str);

    public native int setSpeedLimit(long j, long j2);

    public native int setTaskLxState(long j, int i, int i2);

    public native int setUserId(String str);

    public native int startTask(long j, boolean z);

    public native int stopTask(long j);

    public native int unInit();
}
