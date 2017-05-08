package com.example.zhaopeng.broadcasttest;

import android.app.Activity;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaopeng on 2017/5/8.
 */

public class ActivityManager {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(@NonNull Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(@NonNull Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
