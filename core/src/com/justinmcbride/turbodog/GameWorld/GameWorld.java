package com.justinmcbride.turbodog.GameWorld;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Rectangle;
import com.justinmcbride.turbodog.Helpers.Renderable;
import com.justinmcbride.turbodog.Objects.Ball;
import com.justinmcbride.turbodog.Objects.Wall;

import java.util.List;

/**
 * Created by Logan on 7/15/2014.
 */
public class GameWorld implements InputProcessor {

    List<Ball> balls;
    List<Wall> walls;
    Rectangle field;

    List<Renderable> renderList;

    public GameWorld(float screenWidth, float screenHeight) {
        field = new Rectangle(0, 0, screenWidth, screenHeight);

    }

    public void update(float delta) {
        // Update Shit here
    }

    private void createWall(int x, int y) {
        Wall wall = new Wall(field, new GridPoint2(x, y), Wall.GrowDirection.HORIZONTAL, 5);
        walls.add(wall);
        renderList.add(wall);
    }

    //
    // Input methods
    //

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        createWall(screenX, screenY);
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
