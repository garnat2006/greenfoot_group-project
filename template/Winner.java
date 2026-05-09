import greenfoot.*;  

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Menu
{
    /**
     * Constructor for objects of class Winner.
     * 
     */
    public Winner()
    {
        super(800, 450);

        SoundManager.stopBackgroundMusic();
        SoundManager.win();

        GreenfootImage bg = new GreenfootImage("YouWin.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartGame startGame = new StartGame();
        addObject(startGame, 378, 593);

        StartGame startGame2 = new StartGame();
        addObject(startGame2, 395, 350);
    }
}