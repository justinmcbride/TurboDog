package com.justinmcbride.turbodog.Screens;

public enum Screen {
	 
    INTRO {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance() {
            return new IntroScreen();
        }
    },
 
    MAIN_MENU {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance() {
             return new MainMenuScreen();
        }
    },
 
    GAME {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance() {
             return new GameScreen();
        }
    };

 
    protected abstract com.badlogic.gdx.Screen getScreenInstance();
 
}
