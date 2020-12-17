package com.example.app2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app2.base.BaseActivity;
import com.example.app2.base.BaseView;
import com.example.app2.bean.Bean;
import com.example.app2.contract.ConTract;
import com.example.app2.presenter.PresenterImp;

public class MainActivity extends BaseActivity<PresenterImp> implements ConTract.View {

    private TextView tv;

    public void initData() {
        getpresenter().getpresenter();
    }

    public void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    protected PresenterImp getpresenter() {
        return new PresenterImp();
    }


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }



    @Override
    public void OnOk(Bean bean) {
        tv.setText(bean.getData().get(0).getTitle());
    }

    @Override
    public void OnNo(String error) {

    }
}