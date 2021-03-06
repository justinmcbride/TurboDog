package com.justinmcbride.turbodog;

import com.badlogic.gdx.Game;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Screens.Screen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

public class TurboDog extends Game {

	@Override
	public void create () {
		System.out.println("Creating the game...");
        AssetLoader.initialLoad();
        ScreenManager.getInstance().initialize(this);
        //ScreenManager.getInstance().show(Screen.INTRO);
        // Switch back to the above in production
        ScreenManager.getInstance().show(Screen.MAIN_MENU);
	}

    @Override
    public void dispose() {
        super.dispose();
        ScreenManager.getInstance().dispose();
    }
}
