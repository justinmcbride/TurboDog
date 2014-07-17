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
    private Vector2 size;

    private Rectangle field;

    private GrowDirection growDirection;
    private int growSpeed;
    private boolean fullyGrown = false;

    public Wall(Rectangle field, GridPoint2 origin, GrowDirection direction, int growSpeed) {
        this.start = this.end = this.origin = new GridPoint2(origin);
        this.growDirection = direction;
        this.growSpeed = growSpeed;
        this.end = new GridPoint2(start);

        if (growDirection == GrowDirection.HORIZONTAL) this.size = new Vector2(0, LINE_WIDTH);
        else this.size = new Vector2(LINE_WIDTH, 0);

        this.field = field;
    }

    private void grow(float delta) {
        if (growDirection == GrowDirection.HORIZONTAL) {
            start.x -= (growSpeed * delta);
            end.x += (growSpeed * delta);

            size.x = end.x - start.x;

        } else {
            start.y -= (growSpeed * delta);
            end.y += (growSpeed * delta);

            size.y = start.y - end.y;
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
