package com.samplereact;

import android.os.Bundle;

import com.clevertap.react.CleverTapModule;
import com.facebook.react.ReactActivity;
import com.clevertap.android.sdk.CleverTapAPI;
public class MainActivity extends ReactActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    CleverTapModule.setInitialUri(getIntent().getData());
  }

  /**
   * Returns the name of the main component registered from JavaScript. This is
   * used to schedule rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "samplereact";
  }
}
