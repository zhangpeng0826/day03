package com.example.day03.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.day03.contract.ConTract;
import com.example.day03.presenter.PresenterImp;

public abstract class BaseActivity<T> extends AppCompatActivity {
    private T presenter1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayout());
        presenter1 = getPresenter();
        initView();
        initData();
    }

    protected abstract T getPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayout();
}
