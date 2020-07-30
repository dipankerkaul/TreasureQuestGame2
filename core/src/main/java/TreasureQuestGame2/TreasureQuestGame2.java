package TreasureQuestGame2;

public class TreasureQuestGame2 extends BaseGame
{
    public void create() 
    {        
        super.create();
        setActiveScreen( new LevelScreen() );
    }
}