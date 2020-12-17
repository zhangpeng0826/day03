package com.example.app2.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<p extends BasePresenter> extends AppCompatActivity implements BaseView{
    protected p presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        presenter = getpresenter();
        presenter.attachView(this);
        initView();
        initData();
    }


    protected abstract void initData();

    protected abstract void initView();

    protected abstract p getpresenter();

    protected abstract int getLayout();
}
