package nhnnext.org.gingeraebi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class List2Activity extends AppCompatActivity {

    private ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        listView2 = (ListView) findViewById(R.id.listView_list2);

        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>(2);

        for(int i = 0 ; i < 10; i++){
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("line1",i +"번째의 첫번째 줄");
            hashMap.put("line2",i +"번째의 두번째 줄");
            arrayList.add(hashMap);
        }
        String[] from = {"line1","line2"};
        int[] to = {android.R.id.text1,android.R.id.text2};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,android.R.layout.simple_list_item_2,from,to);
        listView2.setAdapter(simpleAdapter);

    }
}
