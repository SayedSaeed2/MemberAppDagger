package com.example.android.memberappdagger;

import android.app.Application;

public class App extends Application {

    private static App app;
    private MemberAppComponent memberAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;
        memberAppComponent = DaggerMemberAppComponent.builder()
                .memberDataModule(new MemberDataModule())
                .build();
    }

    public MemberAppComponent getMemberAppComponent() {
        return this.memberAppComponent;
    }

    public static App getApp() {
        return app;
    }
}
