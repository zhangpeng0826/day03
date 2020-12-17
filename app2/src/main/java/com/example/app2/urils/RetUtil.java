package com.example.app2.urils;

import com.example.app2.api.ApiService;
import com.example.app2.callback.TvCallBack;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetUtil implements NetWork{
    private static volatile RetUtil retUtil;
    private final ApiService apiService;

    public RetUtil() {
        apiService = new Retrofit.Builder()
                .baseUrl(URL.Url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiService.class);
    }
    public static RetUtil getRetUtil() {
        if (retUtil==null){
            synchronized (RetUtil.class){
                if (retUtil==null){
                    retUtil = new RetUtil();
                }
            }
        }
        return retUtil;
    }


    @Override
    public <T> void getModel(String url, TvCallBack<T> callBack) {
        apiService.get(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull ResponseBody responseBody) {
                        try {
                            String string = responseBody.string();
                            Type[] genericInterfaces = callBack.getClass().getGenericInterfaces();
                            Type[] actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments();
                            Type t = actualTypeArguments[0];
                            callBack.OnOk(new Gson().fromJson(string,t));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
