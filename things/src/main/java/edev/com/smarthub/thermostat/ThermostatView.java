package edev.com.smarthub.thermostat;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import edev.com.smarthub.R;

public class ThermostatView extends ConstraintLayout {
    private TextView setTempText;
    public ThermostatView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.thermostat_view, this);
        setTempText = findViewById(R.id.mainTempLabel);
        final Button downButton = findViewById(R.id.tempDownButton);
        downButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = setTempText.getText();
                int temp = Integer.parseInt(text.toString());
                temp -= 1;
                text = Integer.toString(temp);
                setTempText.setText(text);
            }
        });

        final Button upButton = findViewById(R.id.tempUpButton);
        upButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = setTempText.getText();
                int temp = Integer.parseInt(text.toString());
                temp += 1;
                text = Integer.toString(temp);
                setTempText.setText(text);
            }
        });
    }
}
