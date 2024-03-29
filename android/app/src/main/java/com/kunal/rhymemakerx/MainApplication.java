package com.kunal.rhymemakerx;

import android.app.Application;
import android.util.Log;
import android.content.Intent;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.facebook.react.bridge.*;

import java.util.Arrays;
import java.util.List;

import com.wmjmc.reactspeech.VoicePackage;
import me.neo.react.StatusBarPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import com.sbugert.rnadmob.RNAdMobPackage;

public class MainApplication extends Application implements ReactApplication {


  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new StatusBarPackage(),
          new VoicePackage(),
          new LinearGradientPackage(),
          new RNAdMobPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
