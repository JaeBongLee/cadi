package nhnnext.org.gingeraebi.navercafe.CafeMain;

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
public class ContentsBoardAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Contents> contentList;

    public ContentsBoardAdapter(Context context, ArrayList<Contents> contentList) {
        this.context = context;
        this.contentList = contentList;
    }

    @Override
    public int getCount() {
        return contentList.size();
    }

    @Override
    public Object getItem(int position) {
        return contentList.get(position);
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
            row = layoutInflater.inflate(R.layout.item_contentboard, parent,false);
        }

        TextView title = (TextView) row.findViewById(R.id.textView_contentBoard_title);
        TextView name = (TextView) row.findViewById(R.id.textView_contentBoard_name);
        TextView time = (TextView) row.findViewById(R.id.textView_contentBoard_time);
        TextView viewCount = (TextView) row.findViewById(R.id.textView_contentBoard_viewCount);

        Contents nowContents = contentList.get(position);

        title.setText(nowContents.getTitle());
        name.setText(nowContents.getName());
        time.setText(nowContents.getTime());
        viewCount.setText("조회 " + nowContents.getViewCount());

        return row;
    }
}
