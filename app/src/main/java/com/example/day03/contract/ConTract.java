package com.example.day03.contract;

import com.example.day03.bean.Bean;

public class ConTract {
    public interface View{
        void OnOk(Bean bean);
        void OnNo(String error);
    }
      public interface Model{
        void getModel();
    }
     public interface Persenter{
        void getPersenter();
         void OnOk(Bean bean);
         void OnNo(String error);
    }


}
