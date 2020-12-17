package com.example.day03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.day03.bean.Bean;
import com.example.day03.contract.ConTract;
import com.example.day03.presenter.PresenterImp;

public class MainActivity extends AppCompatActivity implements ConTract.View {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        PresenterImp presenterImp = new PresenterImp(this);
        presenterImp.getPersenter();
    }

    private void initView() {
        tv = findViewById(R.id.tv);
    }

    @Override
    public void OnOk(Bean bean) {
        for (int i = 0; i < bean.getData().size(); i++) {
            tv.setText(bean.getData().get(i).getTitle());
        }
    }

    @Override
    public void OnNo(String error) {

    }
}