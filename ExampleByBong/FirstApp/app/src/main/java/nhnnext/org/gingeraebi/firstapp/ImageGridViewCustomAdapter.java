package nhnnext.org.gingeraebi.firstapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by JaeBong on 16. 2. 24..
 */
public class ImageGridViewCustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> imageList;

    public ImageGridViewCustomAdapter(Context context, ArrayList<String> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;

        if (item == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            item = inflater.inflate(R.layout.custom_grid_item_1,parent,false);
        }

        ImageView image = (ImageView) item.findViewById(R.id.imageView_gridItem);
        String resourceName = "@drawable/" + imageList.get(position);
        String packageName = context.getPackageName();
        int resourceId = context.getResources().getIdentifier(resourceName,"drawable",packageName);

        image.setImageResource(resourceId);

        return item;
    }
}
