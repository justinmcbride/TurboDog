package com.justinmcbride.turbodog.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Helpers.ScreenTimer;
import com.justinmcbride.turbodog.gui.Button;

/**
 * Created by Justin on 7/12/2014.
 */
public class MainMenuScreen implements com.badlogic.gdx.Screen {
    private SpriteBatch spriteBatch;
    private OrthographicCamera camera;
    private float gameWidth, gameHeight;
    private BitmapFont fontReg, fontShadow;
    private Button playButton = null;
    int lineHeight = 0;

    public MainMenuScreen(Object data) {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        gameWidth = 136;
        gameHeight = screenHeight / (screenWidth / gameWidth);
        fontReg = AssetLoader.getFontRegular();
        fontShadow = AssetLoader.getFontShadow();


        lineHeight = Math.round(2.5f * fontReg.getCapHeight());

        spriteBatch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(true, 137, 204);

        playButton = new Button("Play", fontShadow, new ScreenSwitchHandler(Screen.INTRO, null));


    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        fontReg.draw(spriteBatch, "main screen", 100, 100);
        playButton.draw(spriteBatch, camera);
        spriteBatch.end();

    }

    @Override
    public void resize(int width, int height) {
        int centerX = width / 2;
        int centerY = height / 2;
        playButton.setX(centerX - playButton.getWidth() / 2);
        playButton.setY(centerY + lineHeight);
    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
