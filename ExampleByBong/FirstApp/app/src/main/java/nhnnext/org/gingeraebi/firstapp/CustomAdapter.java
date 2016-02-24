package nhnnext.org.gingeraebi.firstapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    private ArrayList<Person> personList;
    private Context context;

    public CustomAdapter(Context context, ArrayList<Person> personList){
        this.personList = personList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if(row == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(R.layout.custom_list_item_1, parent,false);
        }

        TextView name = (TextView) row.findViewById(R.id.textView_customList_name);
        TextView address = (TextView) row.findViewById(R.id.textView_customList_address);
        TextView age = (TextView) row.findViewById(R.id.textView_customList_age);
        TextView phoneNum = (TextView) row.findViewById(R.id.textView_customList_phoneNum);

        Person person = personList.get(position);
        name.setText(person.getName());
        address.setText(person.getAddress());
        age.setText("" +person.getAge());
        phoneNum.setText(person.getPhoneNum());

        return row;
    }
}
