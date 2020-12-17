package com.example.app2.urils;

import com.example.app2.callback.TvCallBack;

public interface NetWork {
    <T> void getModel(String url, TvCallBack<T> callBack);
}
