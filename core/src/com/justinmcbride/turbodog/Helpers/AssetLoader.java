package com.justinmcbride.turbodog.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

/**
 * Created by Justin on 7/12/2014.
 */
public class AssetLoader {
    //
    // Variables for all of the assets
    //
    private static BitmapFont fontRegular, fontShadow;

    //
    // Getters for all of the assets
    //

    public static BitmapFont getFontRegular() {
        return fontRegular;
    }

    public static BitmapFont getFontShadow() {
        return fontShadow;
    }

    public static void initialLoad() {
        // Load the fonts
        fontRegular = new BitmapFont(Gdx.files.internal("reg/ubuntuReg-64.fnt"));
        fontShadow = new BitmapFont(Gdx.files.internal("shadow/ubuntuShadow32.fnt"));
    }
}
