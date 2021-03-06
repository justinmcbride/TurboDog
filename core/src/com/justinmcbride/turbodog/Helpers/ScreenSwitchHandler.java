package com.justinmcbride.turbodog.Helpers;

import com.justinmcbride.turbodog.gui.Button.ButtonHandler;
import com.justinmcbride.turbodog.Screens.Screen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

public class ScreenSwitchHandler implements ButtonHandler {

    private Screen screen = null;

    public ScreenSwitchHandler(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void onClick() {
		/* easily implemented screen switching thanks to singleton pattern */
        ScreenManager.getInstance().show(screen);
    }
}