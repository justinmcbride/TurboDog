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
        ScreenManager.getInstance().show(Screen.INTRO, null);
	}

    @Override
    public void dispose() {
        super.dispose();
    }
}
