import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashMenu extends Menu
{

    /**
     * Constructor for objects of class SplashMenu.
     * 
     */
    public SplashMenu()
    {
        setBackgroundScaled();
        prepare();
    }

    private void setBackgroundScaled()
    {
        GreenfootImage bg = new GreenfootImage("SplashMenu.png");

        bg.scale(getWidth(), getHeight());   
        setBackground(bg);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartGame startGame = new StartGame();
        addObject(startGame,418,502);
        startGame.setLocation(392,413);
        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo,633,541);
        vanierLogo.setLocation(702,576);
        vanierLogo.setLocation(693,575);
    }
}
