package com.queen.rxjavaretrofitdemo.presenter;

import android.content.Context;

import com.queen.rxjavaretrofitdemo.http.HttpMethods;
import com.queen.rxjavaretrofitdemo.subscribers.ProgressSubscriber;
import com.queen.rxjavaretrofitdemo.subscribers.SubscriberOnNextListener;

import javax.inject.Inject;

/**
 * author：Morse
 * time：2016/9/6 09:53
 * Descripte：
 */
public class MoviePresenter {
    private SubscriberOnNextListener subscriberOnNextListener;

    @Inject
    public MoviePresenter(SubscriberOnNextListener subscriberOnNextListener){
        this.subscriberOnNextListener=subscriberOnNextListener;
    }

    public void getMovie(Context context){
        ProgressSubscriber progressSubscriber = new ProgressSubscriber(context);
        progressSubscriber.setSubscriberOnNextListener(subscriberOnNextListener);
        progressSubscriber.setContent("数据加载中...");
        HttpMethods.getInstance().getTopMovie(progressSubscriber, 0, 10);
    }
}
