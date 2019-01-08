package aosp.report.mtwtm.fatoh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    private boolean dispatched = false;

    @Override
    protected void onResume() {
        super.onResume();
        if (!dispatched) {
            final Intent intent = new Intent(Activity2.this, Activity1.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_TASK_ON_HOME);
            startActivity(intent);
        }
        dispatched = true;
    }
}
