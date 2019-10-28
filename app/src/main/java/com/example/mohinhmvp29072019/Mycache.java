package com.example.mohinhmvp29072019;

import android.content.Context;
import android.content.SharedPreferences;

public class Mycache {
    private Mycache(Context context) {
//        sharedPreferences = context.getSharedPreferences("CacheApp", Context.MODE_PRIVATE);
    }

    private static SharedPreferences sharedPreferences = null;

    private static Context context;

    public static SharedPreferences getInstaceCache(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = (SharedPreferences) new Mycache(context);

        }
        return sharedPreferences;
    }

}
