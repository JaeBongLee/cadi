package nhnnext.org.gingeraebi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomListActivity extends AppCompatActivity {

    private ListView customList;
    private ArrayList<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        customList = (ListView) findViewById(R.id.listView_customList);

        personList = new ArrayList<>();

        personList.add(new Person(22,"판교","이재봉","010-2154-7213"));
        personList.add(new Person(23,"군대","이재원","010-2154-7214"));
        personList.add(new Person(52,"집","어무니","010-2154-4213"));
        personList.add(new Person(25,"안양","아무개","010-2144-7213"));

        CustomAdapter adapter = new CustomAdapter(this,personList);

        customList.setAdapter(adapter);
    }
}
