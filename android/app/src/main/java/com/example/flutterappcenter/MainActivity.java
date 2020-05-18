package com.example.flutterappcenter;

import io.flutter.embedding.android.FlutterActivity;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends FlutterActivity {
    @java.lang.Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.start(getApplication(), "7ea0042c-108a-49ef-9f93-c82b43b993b6",
                Analytics.class, Crashes.class);
    }
}
