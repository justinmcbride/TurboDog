package com.justinmcbride.turbodog.Objects;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Justin on 7/17/2014.
 */
public class Wall {
    private static final float LINE_WIDTH = 4;

    private Vector2 start, end;
    private Vector2 size;

    public Wall(Vector2 start, Vector2 end) {
        this.start = start;
        this.end = end;
        if (start.x == end.x) {
            // If the line is vertical
            size.x = LINE_WIDTH;
            size.y = end.y - start.y;
            if (size.y < 0) size.y *= -1; // in case the line is backwards
        }
        else {
            // the line is horizontal
            size.x = end.x - start.x;
            size.y = LINE_WIDTH;
            if (size.y < 0) size.y *= -1; // in case the line is backwards
        }
    }
}
