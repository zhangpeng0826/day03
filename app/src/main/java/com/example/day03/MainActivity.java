package com.example.day03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day03.base.BaseActivity;
import com.example.day03.bean.Bean;
import com.example.day03.contract.ConTract;
import com.example.day03.presenter.PresenterImp;

public class MainActivity extends BaseActivity<PresenterImp> implements ConTract.View {

    private TextView tv;


    @Override
    protected PresenterImp getPresenter() {
        return new PresenterImp();
    }

    public void initData() {
        presenter.getPersenter();
    }

    public void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void OnOk(Bean bean) {
            tv.setText(bean.getData().get(1).getTitle());
    }

    @Override
    public void OnNo(String error) {

    }
}