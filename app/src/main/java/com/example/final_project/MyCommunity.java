//jun 2022.4.9
package com.example.final_project;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MyCommunity extends Fragment {

    private View view;
    Button share_btn;
    private String Tag="jun";


    public static MyCommunity newInstance() {
        MyCommunity fragment = new   MyCommunity();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(view==null)
        {
            view=inflater.inflate(R.layout.fragment_my_community,container,false);

        }
        share_btn=view.findViewById(R.id.share_button1);
        share_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.e(Tag,"点击事件");
                Intent intent = new Intent();
                //getActivity() 用来获取当前Activity
                intent.setClass(getActivity(), my_community_data.class);//输入切换的界面
                startActivity(intent);
            }

        });
        return view;
    }
}