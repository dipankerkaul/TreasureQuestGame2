package TreasureQuestGame2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import TreasureQuestGame2.TreasureQuestGame2;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher
{
	public static void main (String[] args)
	{
		TreasureQuestGame2 myGame = new TreasureQuestGame2();
		LwjglApplication launcher = new LwjglApplication( myGame, "Game Title", 800, 600 );
	}
}