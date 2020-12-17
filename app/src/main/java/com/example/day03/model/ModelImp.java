package com.example.day03.model;

import com.example.day03.api.ApiService;
import com.example.day03.bean.Bean;
import com.example.day03.callback.TvCallBack;
import com.example.day03.contract.ConTract;
import com.example.day03.utils.RetUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ModelImp implements ConTract.Model {

    private ConTract.Persenter persenter;

    public ModelImp(ConTract.Persenter persenter) {
        this.persenter = persenter;
    }


    @Override
    public <T> void getModel(String url, TvCallBack<T> callBack) {
        RetUtil.getRetUtil().get(url,callBack);
    }
}
