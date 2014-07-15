package com.justinmcbride.turbodog.Objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Justin on 7/15/2014.
 */
public class Ball {
    private Vector2 position;
    private Vector2 velocity;
    private Circle boundingCircle;

    private TextureRegion texture;

    public Ball(float posX, float posY) {
        position = new Vector2(posX, posY);

        boundingCircle = new Circle();
    }

    public void update() {
        position.add(velocity);
    }

    public void render(SpriteBatch spriteBatch) {

    }
}
