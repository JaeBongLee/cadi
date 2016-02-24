package nhnnext.org.gingeraebi.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridList;
    private ArrayList<CafeInfo> cafeInfoList;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        ImageView imageView = (ImageView)findViewById(R.id.imageButton3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
*/
        gridList = (GridView)findViewById(R.id.gridView);
        cafeInfoList = new ArrayList<>();

        cafeInfoList.add(new CafeInfo("CADI"));
        cafeInfoList.add(new CafeInfo("고양이라서\n 다행이야"));
        cafeInfoList.add(new CafeInfo("버스타세요"));
        cafeInfoList.add(new CafeInfo("냥이네"));
        cafeInfoList.add(new CafeInfo("중고나라"));
        cafeInfoList.add(new CafeInfo("넥스트 짱"));
        cafeInfoList.add(new CafeInfo("디미고"));
        cafeInfoList.add(new CafeInfo("수능"));

        gridList = (GridView)findViewById(R.id.gridView);
        gridList.setAdapter(new ImageAdapter(this, cafeInfoList));

        gridList.setOnItemClickListener(gridClickListener);
        /*
        ArrayList<Contents> contentList = new ArrayList<>();
        contentList.add(new Contents("[서울]3주차 개인미션","4기 민지연A","12 : 23", 0));
        contentList.add(new Contents("두번째 글입니다.","4기 이승주","03 : 23", 100));
        contentList.add(new Contents("하 귀찮은 데이터 작성","4기 이재봉","13 : 19", -20));
        contentList.add(new Contents("민지연씨 죄송합니다.","4기 죄송해요","14 : 54", 18));
        contentList.add(new Contents("가나다라마바사 블라블라","세종대왕","축시", 12));
        */


    }
    private AdapterView.OnItemClickListener listener= new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = null;
            switch(position) {
                default:
                    intent = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

}
