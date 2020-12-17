package com.example.day03.callback;

import com.example.day03.bean.Bean;

public interface TvCallBack<T> {
    void OnOk(T bean);
    void OnNo(String error);
}
