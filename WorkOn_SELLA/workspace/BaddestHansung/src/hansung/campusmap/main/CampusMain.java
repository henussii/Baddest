package hansung.campusmap.main;

import hansung.campusmap.gonghaka.GonghakA_1;
import hansung.main.main.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CampusMain extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campusmain);
        
        Button bt_GonghakA = (Button)findViewById(R.id.bt_GonghakA);
		bt_GonghakA.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), GonghakA_1.class);
				startActivity(intent);
				
			}
		});
	}
}
