package com.example.day03.base;

public class BasePresenter<V extends BaseView>  {
    protected V iView;
    public void attachView(V v){
        iView = v;
    }
}
