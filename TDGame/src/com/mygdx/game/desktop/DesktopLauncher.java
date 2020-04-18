package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.ShooterGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.width = ShooterGame.WINDOW_WIDTH;
		config.height = ShooterGame.WINDOW_HEIGHT;
		config.resizable = false;
		new LwjglApplication(new ShooterGame(), config);
	}
}
