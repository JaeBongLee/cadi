package nhnnext.org.gingeraebi.navercafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class CafeMainActivity extends AppCompatActivity {

    private RelativeLayout cadiLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_main);

        cadiLayout = (RelativeLayout)findViewById(R.id.relative_button_cadi);
        cadiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CafeDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
