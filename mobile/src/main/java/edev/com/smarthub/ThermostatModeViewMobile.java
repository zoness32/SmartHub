package edev.com.smarthub;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

import edev.com.smarthub.R;

public class ThermostatModeViewMobile extends ConstraintLayout {
    public ThermostatModeViewMobile(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.thermostat_mode, this);
    }
}