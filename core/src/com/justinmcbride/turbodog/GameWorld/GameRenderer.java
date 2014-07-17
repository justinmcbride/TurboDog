package com.justinmcbride.turbodog.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Helpers.Renderable;

/**
 * Created by Logan on 7/15/2014.
 */
public class GameRenderer {

    private GameWorld zeeWorld;

    private SpriteBatch spriteBatch;


    private OrthographicCamera camera;

    private BitmapFont fontReg;

    private float gameWidth, gameHeight;

    public GameRenderer(GameWorld world, float gameWidth, float gameHeight) {
        zeeWorld = world;

        fontReg = AssetLoader.getFontRegular();

        this.gameWidth = gameWidth;
        this.gameHeight = gameHeight;

        camera = new OrthographicCamera(gameWidth, gameHeight);
        camera.setToOrtho(false);

        spriteBatch = new SpriteBatch();
        spriteBatch.setProjectionMatrix(camera.combined);
    }

    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        for (Renderable item : zeeWorld.renderList) item.onRender(spriteBatch, delta);
        //fontReg.draw(spriteBatch, Float.toString(1 / delta), 30, 30);
        spriteBatch.end();
    }


    public OrthographicCamera getCamera() {
        return camera;
    }

    public void dispose() {
        fontReg.dispose();
    }
}