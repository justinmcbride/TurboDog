package com.justinmcbride.turbodog.Screens;

public enum Screen {
	 
    INTRO {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance(Object data) {
            return new IntroScreen(data);
        }
    },
 
    MAIN_MENU {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance(Object data) {
             return new MainMenuScreen(data);
        }
    },
 
    GAME {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance(Object data) {
             return new GameScreen(data);
        }
    };

 
    protected abstract com.badlogic.gdx.Screen getScreenInstance(Object data);
 
}
