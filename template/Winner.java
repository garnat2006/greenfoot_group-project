import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        addObject(startGame,470,455);
        startGame.setLocation(457,477);
        startGame.setLocation(406,566);
        startGame.setLocation(378,593);
        StartGame startGame2 = new StartGame();
        addObject(startGame2,487,342);
        startGame2.setLocation(395,350);
    }
}
