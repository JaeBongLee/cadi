package nhnnext.org.gingeraebi.navercafe.CafeHome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import nhnnext.org.gingeraebi.navercafe.CafeMain.CafeMainActivity;
import nhnnext.org.gingeraebi.navercafe.R;

public class CafeHomeActivity extends AppCompatActivity {

    private GridView cafesGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafehome);

        cafesGridView = (GridView) findViewById(R.id.gridView_cafeHome);

        ArrayList<CafeInfo> cafeList = new ArrayList<>();
        cafeList.add(new CafeInfo("logo_cadi","CADI"));
        cafeList.add(new CafeInfo("logo_cat","고양이라서\n 다행이야"));
        cafeList.add(new CafeInfo("logo_bus","버스타세요"));
        cafeList.add(new CafeInfo("logo_cathouse","냥이네"));
        cafeList.add(new CafeInfo("logo_item","중고나라"));
        cafeList.add(new CafeInfo("logo_next","넥스트 짱"));
        cafeList.add(new CafeInfo("logo_dimigo","디미고"));
        cafeList.add(new CafeInfo("logo_test","수능"));

        CafeHomeAdapter cafeHomeAdapter = new CafeHomeAdapter(this,cafeList);
        cafesGridView.setAdapter(cafeHomeAdapter);


    }
}
