package com.example.seoulalarm;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class FragmentAlarm extends Fragment {

    View view;

    TextView tvEdit;
    TextView tvAlarm;
    TextView tvPlus;
    TextView tvCancle;

    ListView listAlarm;

    AlarmAdapter adapter;

    ImageView ivAlarmEdit;

    ToggleButton toggleButton;
    ToggleButton tbAlarmDeleteCheck;

    String noon;
    int hour;
    int minute;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_alarm, container, false);

        tvEdit = (TextView) getView().findViewById(R.id.tvEdit);
        tvAlarm = (TextView) getView().findViewById(R.id.tvAlarm);
        tvPlus = (TextView) getView().findViewById(R.id.tvPlus);
        tvCancle = (TextView) getView().findViewById(R.id.tvCancle);
        listAlarm = (ListView) getView().findViewById(R.id.listAlarm);

        toggleButton = (ToggleButton) getView().findViewById(R.id.toggleButton);
        tbAlarmDeleteCheck = (ToggleButton) getView().findViewById(R.id.tbAlarmDeleteCheck);

        adapter = new AlarmAdapter();

        listAlarm.setAdapter(adapter);

        /* 리스트 자체 클릭 기능은 없다
        listAlarm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AlarmItem item = (AlarmItem) adapter.getItem(position);

                /*
                이건 나중에 받을 때 쓸거
                noon = item.getNoon();
                hour = item.getHour();
                minute = item.getMinute();
                item.setNoon(noon);
                item.setHour(hour);
                item.setMinute(minute);

                Intent intent = new Intent(parent.getContext(), null); //알림편집으로 넘어가야함
                intent.putExtra("Noon", item.getNoon());
                intent.putExtra("Hour", item.getHour());
                intent.putExtra("Minute", item.getMinute());
                startActivity(intent);
                */
/*
                folder_name = tvMemoName.getText().toString();
                memo_title = memoNameItem.getTitle();

                Intent intent = new Intent(getApplicationContext(), MemoWriteActivity.class);
                intent.putExtra("folder_name", folder_name);
                intent.putExtra("memo_title", memo_title);
                intent.putExtra("click", "item");
                startActivity(intent);

            }
        });
*/

        tvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvEdit.setVisibility(View.GONE);
                tvCancle.setVisibility(View.VISIBLE);

                tbAlarmDeleteCheck.setVisibility(View.VISIBLE);
                toggleButton.setVisibility(View.GONE);
                ivAlarmEdit.setVisibility(View.VISIBLE);

            }
        });

        tvCancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvEdit.setVisibility(View.VISIBLE);
                tvCancle.setVisibility(View.GONE);

                tbAlarmDeleteCheck.setVisibility(View.GONE);
                toggleButton.setVisibility(View.VISIBLE);
                ivAlarmEdit.setVisibility(View.GONE);
            }
        });

        tbAlarmDeleteCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = toggleButton.isChecked();
                if(state == true)
                {
                    toggleButton.setChecked(false);
                }
                else if(state == false)
                {
                    toggleButton.setChecked(true);
                }
            }
        });

        tbAlarmDeleteCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state = tbAlarmDeleteCheck.isChecked();
                if(state == true)
                {
                    tbAlarmDeleteCheck.setChecked(false);
                }
                else if(state == false)
                {
                    tbAlarmDeleteCheck.setChecked(true);
                }
            }
        });

        ivAlarmEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }




}


