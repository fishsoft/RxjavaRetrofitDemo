package com.queen.rxjavaretrofitdemo.dagger.componet;

import com.queen.rxjavaretrofitdemo.activity.MainActivity;
import com.queen.rxjavaretrofitdemo.dagger.module.MovieModule;

import dagger.Component;

/**
 * author：Morse
 * time：2016/9/6 09:52
 * Descripte：
 */
@Component(modules = MovieModule.class)
public interface MovieComponet {
    public void inject(MainActivity activity);
}
