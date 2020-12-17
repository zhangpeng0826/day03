package com.example.day03.presenter;

import com.example.day03.MainActivity;
import com.example.day03.base.BasePresenter;
import com.example.day03.bean.Bean;
import com.example.day03.callback.TvCallBack;
import com.example.day03.contract.ConTract;
import com.example.day03.model.ModelImp;
import com.example.day03.utils.URL;

public class PresenterImp extends BasePresenter<MainActivity> implements ConTract.Persenter {
    private  ConTract.Model modelImp;

    public PresenterImp() {
        modelImp = new ModelImp(this);
    }


    @Override
    public void getPersenter() {
        modelImp.getModel(URL.FoodUrl, new TvCallBack<Bean>() {
            @Override
            public void OnOk(Bean bean) {
                iView.OnOk(bean);
            }

            @Override
            public void OnNo(String error) {
                iView.OnNo(error);
            }
        });
    }
}
