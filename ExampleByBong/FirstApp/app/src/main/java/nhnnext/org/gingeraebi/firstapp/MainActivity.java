package nhnnext.org.gingeraebi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button relatvieButton;
    private Button listView1Button;
    private Button listView2Button;
    private Button cutomListVIew;
    private Button cutomGridVIew;


    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relatvieButton = (Button) findViewById(R.id.button_relatvie);
        relatvieButton.setOnClickListener(this);

        listView1Button = (Button) findViewById(R.id.button_listView1);
        listView1Button.setOnClickListener(this);

        listView2Button = (Button) findViewById(R.id.button_listView2);
        listView2Button.setOnClickListener(this);

        cutomListVIew = (Button) findViewById(R.id.button_customListView);
        cutomListVIew.setOnClickListener(this);

        cutomGridVIew = (Button) findViewById(R.id.button_main_imageGrid);
        cutomGridVIew.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_relatvie :
            {
                Log.i("MainActivity", "Relative Button Clicked");
                Intent intent = new Intent(getApplicationContext(),RelativeActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.button_listView1 :
            {
                Log.i("MainActivity", "ListView Button Clicked");
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.button_listView2 :
            {
                Log.i("MainActivity", "ListView2 Button Clicked");
                Intent intent = new Intent(getApplicationContext(),List2Activity.class);
                startActivity(intent);
                break;
            }

            case R.id.button_customListView :
            {
                Log.i("MainActivity", "CustomListView Button Clicked");
                Intent intent = new Intent(getApplicationContext(),CustomListActivity.class);
                startActivity(intent);
                break;
            }

            case R.id.button_main_imageGrid :
            {
                Log.i("MainActivity", "ImageGridView Button Clicked");
                Intent intent = new Intent(getApplicationContext(), ImageGridActivity.class);
                startActivity(intent);
                break;
            }
        }
    }




}
