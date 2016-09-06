package com.queen.rxjavaretrofitdemo.dagger.module;

import com.queen.rxjavaretrofitdemo.subscribers.SubscriberOnNextListener;

import dagger.Module;
import dagger.Provides;

/**
 * author：Morse
 * time：2016/9/6 09:50
 * Descripte：
 */
@Module
public class MovieModule {
    private SubscriberOnNextListener subscriberOnNextListener;

    public MovieModule(SubscriberOnNextListener subscriberOnNextListener) {
        this.subscriberOnNextListener = subscriberOnNextListener;
    }

    @Provides
    SubscriberOnNextListener provideSubscriberOnNextListener() {
        return subscriberOnNextListener;
    }
}
