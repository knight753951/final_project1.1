package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewPager2 viewpager;
    private LinearLayout llhomepage,llcourse,llcommunity,llshopping,llmyself;
    private ImageView ihomepage,icourse,icommunity,ishopping,imyself,ivcurrent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化主页面
        iniPager();
        //初始化工作栏
        iniTableview();
    }
    //初始化Fragment
    private void iniPager(){

        viewpager=findViewById(R.id.id_view1);
        viewpager.setUserInputEnabled(false);
        ArrayList<Fragment> frags=new ArrayList<>();
        frags.add(BlankFragment.newInstance("聊天"));//添加fragment
        frags.add(BlankFragment.newInstance("通讯录"));
        frags.add(MyCommunity.newInstance());//社区的fragment
        frags.add(BlankFragment.newInstance("发现"));
        frags.add(Personal_manager.newInstance());
        //实现滑动效果
        MyFragmentAdapter fragmentAdapter1=new MyFragmentAdapter(getSupportFragmentManager(),getLifecycle(),frags);
        viewpager.setAdapter(fragmentAdapter1);//viewpager设置适配器
        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            //当前页面开始滑动时
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
            // 当页面被选中时
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                changeTab(position);
            }

            //当前页面滑动状态变动时
            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
    private void changeTab(int position) {
        ivcurrent.setSelected(false);
        switch (position)
        {
            case R.id.tab_ll_homepage:viewpager.setCurrentItem(0);
            case 0: ihomepage.setSelected(true);
                ivcurrent=ihomepage;
                break;
            case R.id.tab_ll_course:viewpager.setCurrentItem(1);
            case 1: icourse.setSelected(true);
                ivcurrent=icourse;
                break;
            case R.id.tab_ll_community:viewpager.setCurrentItem(2);
            case 2: icommunity.setSelected(true);
                ivcurrent=icommunity;
                break;
            case R.id.tab_ll_shopping:viewpager.setCurrentItem(3);
            case 3: ishopping.setSelected(true);
                ivcurrent=ishopping;
                break;
            case R.id.tab_ll_myself:viewpager.setCurrentItem(4);
            case 4: imyself.setSelected(true);
                ivcurrent=imyself;
                break;

        }
    }

    private void iniTableview(){

        llhomepage = findViewById(R.id.tab_ll_homepage);
        llhomepage.setOnClickListener(this);
        llcourse = findViewById(R.id.tab_ll_course);
        llcourse.setOnClickListener(this);
        llcommunity = findViewById(R.id.tab_ll_community);
        llcommunity.setOnClickListener(this);
        llshopping= findViewById(R.id.tab_ll_shopping);
        llshopping.setOnClickListener(this);
        llmyself= findViewById(R.id.tab_ll_myself);
        llmyself.setOnClickListener(this);


        ihomepage=findViewById(R.id.tab_homepage_view);
        icourse=findViewById(R.id.tab_course_view);
        icommunity=findViewById(R.id.tab_community_view);
        ishopping=findViewById(R.id.tab_shopping_view);
        imyself=findViewById(R.id.tab_myself_view);
        ihomepage.setSelected(true);
        ivcurrent=ihomepage;



    }

    //点击事件
    @Override
    public void onClick(View view) {
        changeTab(view.getId());
    }
}