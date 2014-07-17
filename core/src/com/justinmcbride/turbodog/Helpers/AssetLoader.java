package com.justinmcbride.turbodog.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Justin on 7/12/2014.
 */
public class AssetLoader {
    //
    // Variables for all of the assets
    //
    private static BitmapFont fontRegular, fontShadow;
    private static Texture baseTexture;
    private static TextureRegion wall;

    //
    // Getters for all of the assets
    //

    public static BitmapFont getFontRegular() {
        return fontRegular;
    }

    public static BitmapFont getFontShadow() {
        return fontShadow;
    }

    public static TextureRegion getWall() {
        return wall;
    }

    //
    // The function to load everything into memory
    //

    public static void initialLoad() {
        // Load the fonts
        fontRegular = new BitmapFont(Gdx.files.internal("reg/ubuntuReg18.fnt"));
        fontShadow = new BitmapFont(Gdx.files.internal("shadow/ubuntuShadow32.fnt"));

        // Load the textures
        baseTexture = new Texture(Gdx.files.internal("texture.png"));
        baseTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        wall = new TextureRegion(baseTexture, 136, 16, 22, 3);
    }
}
