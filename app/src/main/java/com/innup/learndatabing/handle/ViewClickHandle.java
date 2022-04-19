package com.innup.learndatabing.handle;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.innup.learndatabing.R;
import com.innup.learndatabing.databinding.ActivityBasicsUseBinding;

public class ViewClickHandle {

    private Context context;

    public ViewClickHandle(Context context) {
        this.context = context;
    }

    public void toastClick(View view){
        Toast.makeText(context,  "喜欢" , Toast.LENGTH_SHORT).show();
    }
}
