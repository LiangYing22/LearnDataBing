package com.innup.learndatabing.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.innup.learndatabing.R;
import com.innup.learndatabing.bean.JumpClassBean;
import com.innup.learndatabing.databinding.JumpItemDataBinding;

import java.util.ArrayList;
import java.util.List;

public class MainJumpAdapter extends RecyclerView.Adapter<MainJumpAdapter.MainJumpViewHolder> {

    private List<JumpClassBean> jumpClassBeanList;
    private Activity activity;

    public MainJumpAdapter(Activity activity, List<JumpClassBean> jumpClassBeans){
        this.activity = activity;
        this.jumpClassBeanList = new ArrayList<>();
        jumpClassBeanList.addAll(jumpClassBeans);
    }

    @NonNull
    @Override
    public MainJumpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_jump_class, parent, false);
        return new MainJumpViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainJumpViewHolder holder, int position) {
        JumpClassBean jumpClassBean = jumpClassBeanList.get(position);
        holder.bind(jumpClassBean);
        holder.setJumpListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class cl = null;
                try {
                    cl = Class.forName(jumpClassBean.getClassName());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(activity, cl);
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return jumpClassBeanList.size();
    }

    @BindingAdapter({"android:srcId"})
    public static void setImageResource(ImageView imageView, int resourceId){
        imageView.setImageResource(resourceId);
    }

    public static class MainJumpViewHolder extends RecyclerView.ViewHolder{

        private JumpItemDataBinding jumpItemDataBinding;

        public MainJumpViewHolder(@NonNull View itemView) {
            super(itemView);
            jumpItemDataBinding = DataBindingUtil.bind(itemView);
        }

        public void bind(JumpClassBean jumpClassBean){
            jumpItemDataBinding.setJumpClassBean(jumpClassBean);
        }

        public void setJumpListener(View.OnClickListener onClickListener){
            jumpItemDataBinding.tvJumpClass.setOnClickListener(onClickListener);
        }
    }

}
