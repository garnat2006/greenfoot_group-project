import greenfoot.*;  

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Levels
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    private boolean nextButtonSpawned = false;
    
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {
        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60.0;
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Assassin assassin = new Assassin();
        addObject(assassin, 453, 580);
        Guard3 guard3 = new Guard3();
        addObject(guard3,837,67);
        Guard2 guard2 = new Guard2();
        addObject(guard2,223,152);
        guard2.setLocation(170,146);
        guard3.setLocation(830,72);
        guard3.setLocation(772,77);
        guard3.setLocation(773,73);
        Guard1 guard1 = new Guard1();
        addObject(guard1,714,405);
        Guard1 guard12 = new Guard1();
        addObject(guard12,85,521);
        guard12.setLocation(94,522);
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();

        checkLevelComplete();
    }

    public void checkLevelComplete()
    {
        if (!nextButtonSpawned && getObjects(Enemy.class).isEmpty())
        {
            Enter button = new Enter();
            addObject(button, getWidth() / 4, getHeight() / 4);
            nextButtonSpawned = true;
        }
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
}