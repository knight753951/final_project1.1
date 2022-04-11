package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;



public class my_community_data extends AppCompatActivity {
    private View view;
    private Button my_community_share_photo;//添加图片分享按钮
    private Button my_community_share;//确认分享按钮
    private int REQUEST_CODE_CHOOSE;//点下确认选择图片时为1
    ImageView iv_is_back;
    ImageView  iv_head;
    TextView personal_data_name_text;
    private Dialog bottomDialog;
    String Tag="jun";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my_community_data);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view==null)
        {
            view=inflater.inflate(R.layout.fragment_my_community_data,container,false);

        }
        my_community_share_photo=view.findViewById(R.id.share_button1);
        my_community_share_photo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view1) {
                Log.e(Tag,"点击事件1添加照片");


            }

        });

        my_community_share=view.findViewById(R.id.my_community_share);
        my_community_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Log.e(Tag,"点击事件2");
            }
        });
        return view;

    }
}