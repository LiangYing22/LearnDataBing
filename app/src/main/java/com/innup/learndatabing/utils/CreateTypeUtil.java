package com.innup.learndatabing.utils;

import android.text.TextUtils;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class CreateTypeUtil {
    @BindingAdapter(value = {"networkImg", "localImg"}, requireAll = false)
    public static void setImg(ImageView imageView, String netImgUrl, int localImgId){
        if(imageView == null){
            return;
        }
        if(!TextUtils.isEmpty(netImgUrl)){
            Glide.with(imageView.getContext()).load(netImgUrl).listener(new RequestListener<String, GlideDrawable>() {
                @Override
                public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                    return false;
                }

                @Override
                public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                    return false;
                }
            }).into(imageView);
        }else{
            imageView.setImageResource(localImgId);
        }
    }
}
