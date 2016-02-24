package nhnnext.org.gingeraebi.navercafe.CafeMain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import nhnnext.org.gingeraebi.navercafe.R;

public class CafeMainActivity extends AppCompatActivity {

    private ListView contentsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafemain);

        contentsListView = (ListView) findViewById(R.id.listView_cafeDetail);

        ArrayList<Contents> contentList = new ArrayList<>();
        contentList.add(new Contents("[서울]3주차 개인미션","4기 민지연A","12 : 23", 0));
        contentList.add(new Contents("두번째 글입니다.","4기 이승주","03 : 23", 100));
        contentList.add(new Contents("하 귀찮은 데이터 작성", "4기 이재봉", "13 : 19", -20));
        contentList.add(new Contents("민지연씨 죄송합니다.", "4기 죄송해요", "14 : 54", 18));
        contentList.add(new Contents("가나다라마바사 블라블라", "세종대왕", "축시", 12));

        ContentsBoardAdapter contentBoardAdapter = new ContentsBoardAdapter(this, contentList);
        contentsListView.setAdapter(contentBoardAdapter);
    }
}
