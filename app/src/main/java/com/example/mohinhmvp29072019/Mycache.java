package com.example.mohinhmvp29072019;

import android.content.Context;
import android.content.SharedPreferences;

//public class Mycache {
//    private Mycache(Context context) {
////        sharedPreferences = context.getSharedPreferences("CacheApp", Context.MODE_PRIVATE);
//    }
//
//    private static SharedPreferences sharedPreferences = null;
//
//    private static Context context;
//
//    public static SharedPreferences getInstaceCache(Context context) {
//        if (sharedPreferences == null) {
//            sharedPreferences = (SharedPreferences) new Mycache(context);
//
//        }
//        return sharedPreferences;
//    }
//
//}
public class Mycache {
    private static SharedPreferences sharedPreferences = null;
    private static SharedPreferences.Editor editor = null;
    private static Mycache mycache = null;

    private Mycache(Context context) {
        sharedPreferences = context.getSharedPreferences("CacheApp", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static Mycache getInstanceCache(Context context) {
        if (sharedPreferences == null) {
            mycache = new Mycache(context);
        }
        return mycache;
    }

    public <T extends Object> void saveValue(String key, T objects) {
        if (objects instanceof String) {
            editor.putString(key, (String) objects);
        }
        if (objects instanceof Boolean) {
            editor.putBoolean(key, (Boolean) objects);
        }

        editor.commit();
    }
    public void removeValue(String key) {
        editor.remove(key);
        editor.commit();
    }

    public <T extends Object> Object getValue(String key, T defaultparam) {
        Object value = null;
        if (defaultparam instanceof String) {
            value = sharedPreferences.getString(key, (String) defaultparam);
        }
        if (defaultparam instanceof Boolean) {
            value = sharedPreferences.getBoolean(key, (Boolean) defaultparam);
        }
        return value;
    }
}