package com.innup.learndatabing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.innup.learndatabing.adapter.MainJumpAdapter;
import com.innup.learndatabing.bean.JumpClassBean;
import com.innup.learndatabing.databinding.JumpDataBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private JumpDataBinding dataBinding;

    private MainJumpAdapter mainJumpAdapter;
    private List<JumpClassBean> jumpClassBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initData();
        initView();
    }

    private void initView() {
        dataBinding.rvJumpClassList.setLayoutManager(new LinearLayoutManager(this));
        mainJumpAdapter = new MainJumpAdapter(this, jumpClassBeanList);
        dataBinding.rvJumpClassList.setAdapter(mainJumpAdapter);
    }

    private void initData() {
         jumpClassBeanList= new ArrayList<JumpClassBean>(Arrays.asList(
                new JumpClassBean(R.drawable.ic_launcher_background, "com.innup.learndatabing.activity.BasicsUseActivity", "DadaBinding 最基础使用"),
                new JumpClassBean(R.drawable.ic_launcher_background, "com.innup.learndatabing.activity.ListUseActivity", "DataBinding 在列表中使用")
        ));
    }
}