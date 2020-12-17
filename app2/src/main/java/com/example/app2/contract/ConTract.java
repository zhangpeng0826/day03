package com.example.app2.contract;


import com.example.app2.bean.Bean;
import com.example.app2.callback.TvCallBack;

public class ConTract {

    public interface View{
        void OnOk(Bean bean);
        void OnNo(String error);
    }
 public interface Model{
     <T> void getModel(String url, TvCallBack<T> callBack);
    }
 public interface Presenter{
        void getpresenter();
    }

}
