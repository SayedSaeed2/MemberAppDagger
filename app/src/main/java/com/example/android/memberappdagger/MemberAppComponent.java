package com.example.android.memberappdagger;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = MemberDataModule.class)
public interface MemberAppComponent {

    void inject(MainActivity mainActivity);

}
