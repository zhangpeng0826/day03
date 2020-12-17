package com.example.day03.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.day03.contract.ConTract;
import com.example.day03.presenter.PresenterImp;

public abstract class BaseActivity<p extends BasePresenter> extends AppCompatActivity implements BaseView{
    protected T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        presenter = getPresenter();
        initView();
        initData();
    }



    protected abstract T getPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout();
}
