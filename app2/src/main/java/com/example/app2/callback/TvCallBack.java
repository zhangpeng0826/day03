package com.example.app2.callback;

public interface TvCallBack<T> {
    void OnOk(T bean);
    void OnNo(String error);
}
