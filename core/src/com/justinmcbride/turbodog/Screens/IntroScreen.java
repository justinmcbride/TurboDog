package com.justinmcbride.turbodog.Screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Helpers.ScreenTimer;

/**
 * Created by justin on 7/12/14.
 */
public class IntroScreen implements com.badlogic.gdx.Screen {
    private SpriteBatch spriteBatch;
    private OrthographicCamera camera;
    private float gameWidth, gameHeight;
    private BitmapFont fontReg, fontShadow;

    public IntroScreen(Object data) {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        gameWidth = 136;
        gameHeight = screenHeight / (screenWidth / gameWidth);

        spriteBatch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 137, 204);

        fontReg = AssetLoader.getFontRegular();
        fontShadow = AssetLoader.getFontShadow();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        fontReg.draw(spriteBatch, "intro screen", 100, 100);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        Timer.schedule(new ScreenTimer(Screen.MAIN_MENU), 2.0f);
    }

    @Override
    public void hide() {
        ScreenManager.getInstance().dispose(Screen.INTRO);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
        fontReg.dispose();
        fontShadow.dispose();
    }
}
