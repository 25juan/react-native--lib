
package com.lib;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.lib.utils.Device;

public class RNLibModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNLibModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNLib";
  }

  /**
   * 拍照方法
   * @param callback
   */
  @ReactMethod
  public void takePhoto(Callback callback){

  }
  @ReactMethod
  public void getAppInfo(Callback callback){
    WritableMap map = Arguments.createMap();
    map.putInt("versionCode", Device.getVersionCode(reactContext));
    map.putString("versionName", Device.getVersionName(reactContext));
    callback.invoke(map);
  }
}