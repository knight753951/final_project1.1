package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.SQLOutput;

public class personal_data extends AppCompatActivity implements View.OnClickListener {
    ImageView iv_is_back;
    ImageView  iv_head;
    TextView personal_data_name_text;
    private Dialog bottomDialog;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);
        initView();
    }
    private void initView(){

        iv_is_back=findViewById(R.id.iv_is_back);
        iv_head=findViewById(R.id.personal_picture);
        iv_head.setOnClickListener(this);
        personal_data_name_text=findViewById(R.id. personal_data_name_text);
        iv_is_back.setOnClickListener(this);
        personal_data_name_text.setOnClickListener(this);
        iv_is_back.setSelected(false);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_is_back://返回
                iv_is_back.setSelected(true);
                finish();
                break;
            case R.id.personal_picture://设置名字
                //选择对话框
                bottomDialog = new Dialog(this, R.style.BottomDialog);
                View contentView = LayoutInflater.from(this).inflate(R.layout.picture_select_layout, null);
                //获取Dialog的监听
                TextView tv_camera = (TextView) contentView.findViewById(R.id.tv_camera);
                TextView tv_chose = (TextView) contentView.findViewById(R.id.tv_chose);
                TextView tv_cancle = (TextView) contentView.findViewById(R.id.tv_cancle);
                tv_camera.setOnClickListener(this);
                tv_chose.setOnClickListener(this);
                tv_cancle.setOnClickListener(this);

                bottomDialog.setContentView(contentView);
                ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
                layoutParams.width = getResources().getDisplayMetrics().widthPixels;
                contentView.setLayoutParams(layoutParams);
                bottomDialog.getWindow().setGravity(Gravity.BOTTOM);//弹窗位置
                bottomDialog.getWindow().setWindowAnimations(R.style.BottomDialog_Animation);//弹窗样式
                bottomDialog.show();//显示弹窗
                break;







        }

    }
}