package aosp.report.mtwtm.fatoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {

    private boolean dispatched = false;

    @Override
    protected void onResume() {
        super.onResume();
        if (!dispatched) {
            startActivity(new Intent(this, Activity2.class));
        }
        dispatched = true;
    }
}
