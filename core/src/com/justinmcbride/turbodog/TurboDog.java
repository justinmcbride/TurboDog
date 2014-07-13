package com.justinmcbride.turbodog;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Screens.MainMenuScreen;
import com.justinmcbride.turbodog.Screens.ScreenManager;

public class TurboDog extends Game {

	@Override
	public void create () {
		System.out.println("Creating the game...");
        AssetLoader.initialLoad();
        ScreenManager.getInstance().initialize(this);
	}

    @Override
    public void dispose() {
        super.dispose();
    }
}
