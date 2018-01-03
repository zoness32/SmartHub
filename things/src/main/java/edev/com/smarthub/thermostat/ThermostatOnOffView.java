package edev.com.smarthub.thermostat;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import edev.com.smarthub.R;


public class ThermostatOnOffView extends ConstraintLayout{
    public ThermostatOnOffView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.thermostat_on_off_view, this);

        Switch powerSwitch = findViewById(R.id.thermostatOnOffSwitch);
        powerSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getContext(), "Thermostat on", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Thermostat off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
