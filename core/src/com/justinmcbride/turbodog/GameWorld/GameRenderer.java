package com.justinmcbride.turbodog.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.justinmcbride.turbodog.Helpers.AssetLoader;

/**
 * Created by Logan on 7/15/2014.
 */
public class GameRenderer {

    private GameWorld zeeWorld;

    private SpriteBatch spriteBatch;
    private OrthographicCamera camera;

    private BitmapFont fontReg;

    private float gameWidth, gameHeight;

    public GameRenderer(GameWorld world) {
        zeeWorld = world;

        fontReg = AssetLoader.getFontRegular();

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        gameWidth = 136;
        gameHeight = screenHeight / (screenWidth / gameWidth);

        spriteBatch = new SpriteBatch();
    }

    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        fontReg.draw(spriteBatch, Float.toString(1 / delta), 30, 30);
        spriteBatch.end();
    }

    public void dispose() {
        fontReg.dispose();
    }
}