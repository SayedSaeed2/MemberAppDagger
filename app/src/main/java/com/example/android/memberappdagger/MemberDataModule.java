package com.example.android.memberappdagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MemberDataModule {


    @Provides
    @Singleton
    MemberDataManager provideMemberDataManger() {
        return new MemberDataManager();
    }

}
