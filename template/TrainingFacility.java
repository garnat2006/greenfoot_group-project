import greenfoot.*; 

/**
 * Write a description of class TrainingFacility here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainingFacility extends Menu
{
    private long lastFrameTimeMS;
    private double timeStepDuration;
    
    /**
     * Constructor for objects of class TrainingFacility.
     * 
     */
    public TrainingFacility()
    {    
        super(800, 600);

        SoundManager.playBackgroundMusic();
    
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
        addObject(assassin, 400, 200);
        
        StartLevel startLevel = new StartLevel();
        addObject(startLevel, 400, 450);
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
        SoundManager.playBackgroundMusic();
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