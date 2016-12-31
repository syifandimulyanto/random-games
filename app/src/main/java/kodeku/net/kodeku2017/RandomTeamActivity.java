package kodeku.net.kodeku2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by fanfandi17 on 12/31/16.
 */

public class RandomTeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstance)
    {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_random_team);
        ButterKnife.bind(this);
    }
}
