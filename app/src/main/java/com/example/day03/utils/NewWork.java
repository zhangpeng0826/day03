package com.example.day03.utils;

import com.example.day03.callback.TvCallBack;

public interface NewWork {
    <T> void get(String url, TvCallBack callBack);
}
