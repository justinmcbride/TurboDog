package com.justinmcbride.turbodog.Objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Justin on 7/17/2014.
 */
public class Wall {
    private static final float LINE_WIDTH = 4;

    private GridPoint2 start, end, origin;
    private GridPoint2 size;

    private GrowDirection growDirection;
    private int growSpeed;
    private boolean fullyGrown = false;

    public Wall(GridPoint2 start, GridPoint2 end, GrowDirection direction, int growSpeed) {
        this.start = this.origin = new GridPoint2(start);
        this.growDirection = direction;
        this.growSpeed = growSpeed;
        this.end = new GridPoint2(start);
    }

    private void grow(float delta) {
        if (growDirection == GrowDirection.HORIZONTAL) {
            start.x -= (start.x * delta);
            end.x += (end.x * delta);
        } else {

        }
    }

    public void update(float delta) {
        if (this.fullyGrown) return;
        else this.grow(delta);
    }

    public void draw(SpriteBatch spriteBatch, Rectangle field) {

    }

    public static enum GrowDirection {
        HORIZONTAL,
        VERTICAL
    };
}
