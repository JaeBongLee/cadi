package nhnnext.org.gingeraebi.navercafe.CafeHome;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import nhnnext.org.gingeraebi.navercafe.R;

/**
 * Created by JaeBong on 16. 2. 22..
 */
public class CafeHomeAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<CafeInfo> cafeInfoArrayList;

    public CafeHomeAdapter(Context context, ArrayList<CafeInfo> cafeInfoArrayList) {
        this.context = context;
        this.cafeInfoArrayList = cafeInfoArrayList;
    }

    @Override
    public int getCount() {
        return cafeInfoArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return cafeInfoArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(R.layout.item_cafehome, parent,false);
        }
        TextView cafeName = (TextView) row.findViewById(R.id.textView_cafeHome_cafeName);
        CafeInfo cafeInfo = cafeInfoArrayList.get(position);

        cafeName.setText(cafeInfo.getCafeName());

        return row;
    }
}
