package com.example.app3.callback;

import com.example.app3.bean.Bean;

public interface TvCallBack<T> {
    void OnOk(T bean);
    void OnNo(String error);
}
