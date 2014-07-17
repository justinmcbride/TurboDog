package com.justinmcbride.turbodog.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.justinmcbride.turbodog.GameWorld.GameRenderer;
import com.justinmcbride.turbodog.GameWorld.GameWorld;

/**
 * Created by Justin on 7/12/2014.
 */
public class GameScreen implements Screen {
    private float gameWidth, gameHeight;

    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        gameWidth = 136;
        gameHeight = screenHeight / (screenWidth / gameWidth);

        world = new GameWorld(gameWidth, gameHeight);
        renderer = new GameRenderer(world, gameWidth, gameHeight);
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("GameScreen - resizing");
    }

    @Override
    public void show() {
        System.out.println("GameScreen - show called");
    }

    @Override
    public void hide() {
        System.out.println("GameScreen - hide called");
    }

    @Override
    public void pause() {
        System.out.println("GameScreen - pause called");
    }

    @Override
    public void resume() {
        System.out.println("GameScreen - resume called");
    }

    @Override
    public void dispose() {

    }
}
