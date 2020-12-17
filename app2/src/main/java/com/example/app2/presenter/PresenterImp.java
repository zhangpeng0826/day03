package com.example.app2.presenter;

import com.example.app2.MainActivity;
import com.example.app2.base.BaseActivity;
import com.example.app2.base.BasePresenter;
import com.example.app2.bean.Bean;
import com.example.app2.callback.TvCallBack;
import com.example.app2.contract.ConTract;
import com.example.app2.model.ModelImp;
import com.example.app2.urils.URL;

public class PresenterImp extends BasePresenter<MainActivity> implements ConTract.Presenter {
    private ModelImp modelImp;
    public PresenterImp() {
        modelImp = new ModelImp(this);
    }

    @Override
    public void getpresenter() {
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
