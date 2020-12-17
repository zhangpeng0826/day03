package com.example.app2.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<p> extends AppCompatActivity {
    protected p presenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getLayout());
        presenter = getpresenter();
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract p getpresenter();

    protected abstract int getLayout();
}
