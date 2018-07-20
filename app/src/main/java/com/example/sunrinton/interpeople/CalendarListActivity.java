package com.example.sunrinton.interpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CalendarListActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_list);

        list = findViewById(R.id.calender_list);

        ArrayList data = new ArrayList<CalendarData>();

        data.add(new CalendarData("2018년 07월 20일", "13:00 ~ 16:00 102동 엘리베이터 점검"));
        data.add(new CalendarData("2018년 08월 02일", "18:00 ~ 19:00 모든 동 단수"));
        data.add(new CalendarData("2018년 08월 13일", "17:00 방역 / 창문을 닫아주세요"));

        CalendarCustomAdapter adapter = new CalendarCustomAdapter(data, this);
        list.setAdapter(adapter);
    }
}