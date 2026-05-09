import greenfoot.*;  

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
        super(800, 450); 

        SoundManager.stopBackgroundMusic();
        SoundManager.lose();   // use this only if you made a lose sound method

        setBackgroundScaled();
        prepare();
    }

    private void setBackgroundScaled()
    {
        GreenfootImage bg = new GreenfootImage("YouLost.png");
        bg.scale(getWidth(), getHeight());   
        setBackground(bg);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Replay replay = new Replay();
        addObject(replay, 397, 490);

        Replay replay2 = new Replay();
        addObject(replay2, 439, 352);
    }
}