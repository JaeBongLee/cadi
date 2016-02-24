package nhnnext.org.gingeraebi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView1 = (ListView) findViewById(R.id.listView_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        arrayAdapter.add("이재봉");
        arrayAdapter.add("카디");
        arrayAdapter.add("지금 오전2시");

        listView1.setAdapter(arrayAdapter);




    }
}
