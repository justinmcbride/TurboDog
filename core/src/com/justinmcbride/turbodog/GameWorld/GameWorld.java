package com.justinmcbride.turbodog.GameWorld;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Rectangle;
import com.justinmcbride.turbodog.Helpers.Renderable;
import com.justinmcbride.turbodog.Objects.Ball;
import com.justinmcbride.turbodog.Objects.Wall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Logan on 7/15/2014.
 */
public class GameWorld {

    List<Ball> balls;
    List<Wall> walls;
    Rectangle field;

    List<Renderable> renderList;

    public GameWorld(float screenWidth, float screenHeight) {
        field = new Rectangle(0, 0, screenWidth, screenHeight);
        walls = new ArrayList<Wall>();
        balls = new ArrayList<Ball>();

        renderList = new ArrayList<Renderable>();

    }

    public void update(float delta) {
        for (Wall wall : walls) {
            wall.update(delta);
        }
    }

    public void createWall(int x, int y) {
        System.out.println("In createWall() of gameWorld");
        Wall wall = new Wall(field, new GridPoint2(x, y), Wall.GrowDirection.HORIZONTAL, 5);
        walls.add(wall);
        renderList.add(wall);
    }
}
