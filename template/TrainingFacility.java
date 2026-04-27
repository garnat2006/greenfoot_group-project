import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TraningFacility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainingFacility extends Menu
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    
    /**
     * Constructor for objects of class TraningFacility.
     * 
     */
    public TrainingFacility()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

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
        addObject(assassin,400,200);
        
        StartLevel startLevel = new StartLevel();
        addObject(startLevel, 400, 450);
        
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    
}
