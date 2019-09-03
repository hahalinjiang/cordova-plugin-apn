package com.skyteach.apn;

import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * jianglj
 */

public class SkyApn extends CordovaPlugin {

    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        return super.execute(action, rawArgs, callbackContext);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        return super.execute(action, args, callbackContext);
    }

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext cordovacallbackContext) throws JSONException {
        //showToast 是你在JS中调用的方法名；
        if (action.equals("toSettingApn")){
            Intent intent = new Intent(Settings.ACTION_APN_SETTINGS);
            cordova.getActivity().startActivity(intent);
            return true;
        }
        return false;
    }
}