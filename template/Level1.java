import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        addObject(assassin,400,200);

        assassin.setLocation(453,580);
        Guard1 guard1 = new Guard1();
        addObject(guard1,90,514);
        Guard2 guard2 = new Guard2();
        addObject(guard2,835,96);
        Guard3 guard3 = new Guard3();
        addObject(guard3,188,105);
    }
    
    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
        
        checkWin();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
    
    public void checkWin(){
        if (getObjects(Guard1.class).isEmpty() && getObjects(Guard2.class).isEmpty() && getObjects(Guard3.class).isEmpty()){
            Greenfoot.setWorld(new YouWin());
        }
    }
}
