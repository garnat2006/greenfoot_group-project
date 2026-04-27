import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends Menu
{
    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin()
    {
        setBackgroundScaled();
        prepare();
    }

    private void setBackgroundScaled(){
        GreenfootImage bg = new GreenfootImage("YouWin.png");
        
        bg.scale(getWidth(), getHeight()); 
        setBackground(bg);
    }
    
    private void prepare(){
        
    }
}
