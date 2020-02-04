package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import cs301.birthdaycake.CakeView;
import cs301.birthdaycake.CakeView;


public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeV;
    private CakeModel cakeM;

    public CakeController(CakeView cakeRef){
        this.cakeV= cakeRef;
        this.cakeM = cakeRef.getCakeM();
    }
    @Override
    public void onClick(View v) {
        Log.d("hello", "hey");
        cakeM.candleLit= false;
        cakeV.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton b, boolean state) {
        Log.d("hello", "hey");
        cakeM.ifCakeCandles= state;
        cakeV.invalidate();

    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeM.candleCount = progress;
        cakeV.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
