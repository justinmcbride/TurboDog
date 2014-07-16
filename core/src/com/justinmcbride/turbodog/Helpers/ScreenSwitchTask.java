package com.justinmcbride.turbodog.Helpers;

import com.justinmcbride.turbodog.Screens.Screen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

import com.badlogic.gdx.utils.Timer.Task;

public class ScreenSwitchTask extends Task {

    private Screen screen = null;

    public ScreenSwitchTask(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void run() {
		/* easily implemented screen switching thanks to singleton pattern */
        ScreenManager.getInstance().show(screen);
    }

}