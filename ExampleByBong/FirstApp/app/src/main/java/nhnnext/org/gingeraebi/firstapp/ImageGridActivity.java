package nhnnext.org.gingeraebi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ImageGridActivity extends AppCompatActivity {

    private GridView imageGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_grid);

        imageGridView = (GridView) findViewById(R.id.gridView_imageGrid);

        final ArrayList<String> cafeList = new ArrayList<>();
        cafeList.add("logo_cadi");
        cafeList.add("logo_bus");
        cafeList.add("logo_cat");
        cafeList.add("logo_cathouse");
        cafeList.add("logo_dimigo");
        cafeList.add("logo_item");
        cafeList.add("logo_next");
        cafeList.add("logo_test");


        ImageGridViewCustomAdapter cutomAdapter = new ImageGridViewCustomAdapter(this, cafeList);
        imageGridView.setAdapter(cutomAdapter);
        imageGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("CafeName",position);
                startActivity(intent);
            }
        });




    }
}
