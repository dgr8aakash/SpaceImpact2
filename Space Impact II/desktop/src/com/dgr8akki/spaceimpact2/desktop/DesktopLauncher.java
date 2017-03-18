package com.dgr8akki.spaceimpact2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dgr8akki.spaceimpact2.SpaceImpact2;
import java.awt.Dimension;
import java.awt.Toolkit;

public class DesktopLauncher {
    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double widthOfScreen = screenSize.getWidth();
        double heightOfScreen = screenSize.getHeight();
        config.title = "Space Impact II";
        config.width = (int) widthOfScreen;
        config.height = (int) heightOfScreen;
        config.fullscreen = true;
        new LwjglApplication(new SpaceImpact2(), config);
    }
}
