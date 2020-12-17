package com.example.app2.model;

import com.example.app2.callback.TvCallBack;
import com.example.app2.contract.ConTract;
import com.example.app2.urils.RetUtil;

public class ModelImp implements ConTract.Model {
    private ConTract.Presenter presenter;

    public ModelImp(ConTract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getModel(String url, TvCallBack<T> callBack) {
        RetUtil.getRetUtil().getModel(url,callBack);
    }
}
