package com.innup.learndatabing.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.innup.learndatabing.R;
import com.innup.learndatabing.bean.Idol;
import com.innup.learndatabing.databinding.ActivityBasicsUseBinding;
import com.innup.learndatabing.handle.ViewClickHandle;

public class BasicsUseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicsUseBinding activityBasicsUseBinding = DataBindingUtil.setContentView(this, R.layout.activity_basics_use);
        Idol idol = new Idol("斯嘉丽.约翰逊", 5);
        idol.setNetImgUrl("https://nimg.ws.126.net/?url=http%3A%2F%2Fdingyue.ws.126.net%2F2022%2F0419%2F4cd64f91j00ral7u70014c000hs00mdg.jpg&thumbnail=660x2147483647&quality=80&type=jpg");
        idol.setLocalImgId(R.drawable.sijialiyuehanxun);
        activityBasicsUseBinding.setIdol(idol);
        activityBasicsUseBinding.setViewClickHandle(new ViewClickHandle(this));

    }
}