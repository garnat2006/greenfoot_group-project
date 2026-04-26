import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouLost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouLost extends Menu
{
    public YouLost()
    {
        super();  // if Menu has a no‑arg constructor

        setBackgroundScaled();
        prepare();
    }

    private void setBackgroundScaled()
    {
        GreenfootImage bg = new GreenfootImage("YouLost.png");

        bg.scale(getWidth(), getHeight());   // fill the whole world
        setBackground(bg);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Replay replay = new Replay();
        addObject(replay,310,491);
        replay.setLocation(346,505);
        replay.setLocation(397,490);
    }
}
