package com.example.gingeraebi.navercafe.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gingeraebi.navercafe.vo.Content;
import com.example.gingeraebi.navercafe.R;

import java.util.ArrayList;

/**
 * Created by GingerAebi on 2016. 3. 5..
 */
public class CafeBoardAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Content> contentArrayList;

    public CafeBoardAdapter(Context context, ArrayList<Content> contentArrayList) {
        this.context = context;
        this.contentArrayList = contentArrayList;
    }

    @Override
    public int getCount() {
        return contentArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return contentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(R.layout.cafe_board_info,parent, false);
        }

        TextView title = (TextView) row.findViewById(R.id.textView_cafeBoardInfo_title);
        TextView name = (TextView) row.findViewById(R.id.textView_cafeBoardInfo_name);
        TextView time = (TextView) row.findViewById(R.id.textView_cafeInfoBoard_time);
        TextView viewCount = (TextView) row.findViewById(R.id.textView_cafeBoardInfo_viewCount);

        Content content = contentArrayList.get(position);

        title.setText(content.getTitle());
        name.setText(content.getName());
        time.setText(content.getTime());
        viewCount.setText("조회 " + content.getViewCount());

        return row;
    }
}
