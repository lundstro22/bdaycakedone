package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CakeView newCake;
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.activity_main);
        newCake= findViewById(R.id.cakeview);
        CakeController control = new CakeController(newCake);
        Button malia= findViewById(R.id.malia);
        Switch switch1= findViewById(R.id.switch1);
        malia.setOnClickListener(control);
        switch1.setOnCheckedChangeListener(control);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(control);
    }
    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }
}
