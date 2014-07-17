package com.justinmcbride.turbodog.Objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.GridPoint2;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.justinmcbride.turbodog.Helpers.AssetLoader;
import com.justinmcbride.turbodog.Helpers.Renderable;

/**
 * Created by Justin on 7/17/2014.
 */
public class Wall implements Renderable {
    private static final float LINE_WIDTH = 4;

    private GridPoint2 start, end, origin;
    private Vector2 size;

    private Rectangle field;

    private GrowDirection growDirection;
    private int growSpeed;
    private boolean fullyGrown = false;

    private TextureRegion texture;

    public Wall(Rectangle field, GridPoint2 origin, GrowDirection direction, int growSpeed) {
        texture = AssetLoader.getWall();
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
            // grow the wall in both directions
            start.x -= (growSpeed * delta);
            end.x += (growSpeed * delta);

            // check to see that we haven't hit the sides of the field
            if (start.x < (int)field.x)  {
                // the start of the wall is at the left boundary
                start.x = (int)field.x;
            }
            if (end.x > ((int)field.x + (int)field.width)) {
                // the end of the wall is at the right boundary
                end.x = (int)field.x + (int)field.width;
            }

            // check to see if the wall has grown the full length
            if (start.x == (int)field.x && end.x == ((int)field.x + (int)field.width)) {
                fullyGrown = true;
            }

            // update the size
            size.x = end.x - start.x;

        } else {
            // grow the wall in both directions
            start.y -= (growSpeed * delta);
            end.y += (growSpeed * delta);

            // check to see that we haven't hit the sides of the field
            if (start.y < (int)field.y)  {
                // the start of the wall is at the left boundary
                start.y = (int)field.y;
            }
            if (end.y > ((int)field.y + (int)field.height)) {
                // the end of the wall is at the right boundary
                end.y = (int)field.y + (int)field.height;
            }

            // check to see if the wall has grown the full length
            if (start.y == (int)field.y && end.y == ((int)field.y + (int)field.height)) {
                fullyGrown = true;
            }

            // update the size
            size.y = start.y - end.y;
        }

    }

    public void update(float delta) {
        if (!fullyGrown) grow(delta);
    }

    @Override
    public void onRender(SpriteBatch spriteBatch, float delta) {
        spriteBatch.draw(texture, start.x, start.y, size.x, size.y);
    }

    public static enum GrowDirection {
        HORIZONTAL,
        VERTICAL
    };
}
