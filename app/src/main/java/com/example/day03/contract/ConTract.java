package com.example.day03.contract;

import com.example.day03.bean.Bean;
import com.example.day03.callback.TvCallBack;

public class ConTract {
    public interface View{
        void OnOk(Bean bean);
        void OnNo(String error);
    }
      public interface Model{
          <T> void getModel(String url, TvCallBack callBack);
    }
     public interface Persenter{
        void getPersenter();

    }


}
