import greenfoot.*;  

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
        super(800, 500);
        
        showText(" Nicole , Nathan , Anuj , Zaara ", 400, 450);
        SoundManager.playBackgroundMusic();
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
        addObject(startGame, 401, 385);

        VanierLogo vanierLogo = new VanierLogo();
        addObject(vanierLogo, 693, 575);

        VanierLogo vanierLogo2 = new VanierLogo();
        addObject(vanierLogo2, 684, 456);
    }

    public void started()
    {
        SoundManager.playBackgroundMusic();
    }
}
