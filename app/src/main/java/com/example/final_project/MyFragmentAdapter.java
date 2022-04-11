package com.example.final_project;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyFragmentAdapter extends FragmentStateAdapter {
   List<Fragment> fraglists=new ArrayList<>();



   //构造函数,初始化页面列表，存放所有片段
   public MyFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle,List<Fragment> fragments) {
      super(fragmentManager, lifecycle);
      fraglists=fragments;


   }

   //创建
   @NonNull
   @Override
   public Fragment createFragment(int position) {
      return fraglists.get(position);
   }

   //页面数量
   @Override
   public int getItemCount() {
      return fraglists.size();
   }
}
