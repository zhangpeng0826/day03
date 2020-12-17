package com.example.day03.model;

import com.example.day03.api.ApiService;
import com.example.day03.bean.Bean;
import com.example.day03.contract.ConTract;

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
    public void getModel() {
        new Retrofit.Builder()
                .baseUrl(ApiService.baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class).get()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Bean bean) {
                            persenter.OnOk(bean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                            persenter.OnNo(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
