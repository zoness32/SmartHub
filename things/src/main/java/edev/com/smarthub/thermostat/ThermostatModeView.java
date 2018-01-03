package edev.com.smarthub.thermostat;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import edev.com.smarthub.R;

public class ThermostatModeView extends ConstraintLayout {
    public ThermostatModeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.thermostat_mode, this);
    }
}
