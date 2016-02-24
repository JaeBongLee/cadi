package nhnnext.org.gingeraebi.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JaeWon on 2016-02-20.
 */
public class ImageAdapter extends BaseAdapter {

    private ArrayList<CafeInfo> cafeInfoList;
    private Context context;

    public ImageAdapter (Context context, ArrayList<CafeInfo> cafeInfoList) {
        this.context = context;
        this.cafeInfoList = cafeInfoList;
    }
    @Override
    public int getCount() {
        return cafeInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return cafeInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(R.layout.grid_list_item_1, parent, false);
        }

        TextView cafeName = (TextView)row.findViewById(R.id.textView_cafeName);

        CafeInfo contents = cafeInfoList.get(position);
        cafeName.setText(contents.getCafeName());


        return row;
    }
}
