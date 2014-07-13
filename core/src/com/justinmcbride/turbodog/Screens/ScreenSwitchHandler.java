package com.justinmcbride.turbodog.Screens;

import com.justinmcbride.turbodog.gui.Button.ButtonHandler;
import com.justinmcbride.turbodog.Screens.Screen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

public class ScreenSwitchHandler implements ButtonHandler {
	
	private Screen screen = null;
    private Object data = null;
	
	public ScreenSwitchHandler(Screen screen, Object data) {
		this.screen = screen;
        this.data = data;
	}

	@Override
	public void onClick() {
		/* easily implemented screen switching thanks to singleton pattern */
		ScreenManager.getInstance().show(screen, data);
	}

}
