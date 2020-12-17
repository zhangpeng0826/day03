package com.example.day03.presenter;

import com.example.day03.bean.Bean;
import com.example.day03.callback.TvCallBack;
import com.example.day03.contract.ConTract;
import com.example.day03.model.ModelImp;
import com.example.day03.utils.URL;

public class PresenterImp implements ConTract.Persenter {
    private ConTract.View view;
    private  ConTract.Model modelImp;

    public PresenterImp(ConTract.View view) {
        this.view = view;
        modelImp = new ModelImp(this);
    }


    @Override
    public void getPersenter() {
        modelImp.getModel(URL.FoodUrl, new TvCallBack<Bean>() {
            @Override
            public void OnOk(Bean bean) {
                view.OnOk(bean);
            }

            @Override
            public void OnNo(String error) {
                view.OnNo(error);
            }
        });
    }
}
