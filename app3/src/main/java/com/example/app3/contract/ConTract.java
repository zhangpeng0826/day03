package com.example.app3.contract;

import com.example.app3.bean.Bean;
import com.example.app3.callback.TvCallBack;

public class ConTract {
    public interface View{
        void OnOk(Bean bean);
        void OnNo(String error);
    }
     public interface Model{
        <T> void getModel(String url, TvCallBack<T> callBack);
    }
    public interface Presenter{
        void getPresenter();
    }

}
