package com.justinmcbride.turbodog.Helpers;

import com.badlogic.gdx.utils.Timer;
import com.justinmcbride.turbodog.Screens.Screen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

/**
 * Created by justin on 7/15/14.
 */
public class ScreenTimer extends Timer.Task {
    private Screen screen = null;

    public ScreenTimer(Screen screen) {
        this.screen = screen;
    }
    @Override
    public void run() {
        ScreenManager.getInstance().show(screen, null);
    }
}
