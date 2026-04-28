import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBossLevel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBossLevel2 extends Levels
{
    private boolean winTriggered = false;
    
    /**
     * Constructor for objects of class FinalBossLevel2.
     * 
     */
    public FinalBossLevel2()
    {
        super(900, 500);  
        prepare();
    }

    private void prepare()
    {
        Assassin assassin = new Assassin();
        addObject(assassin, 200, 200);

        FinalBoss finalBoss = new FinalBoss();
        addObject(finalBoss, 714, 258);
    }

    public void act()
    {
        super.act();       // keep timing logic from Levels
        checkLevelComplete();
    }
    
    private void checkLevelComplete()
    {
        if (!winTriggered && getObjects(FinalBoss.class).isEmpty())
        {
            winTriggered = true;
            Greenfoot.setWorld(new Winner());
        }
    }
}
