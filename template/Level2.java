import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Levels
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        super();

        GreenfootImage bg = new GreenfootImage("LocalDataOffice.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        prepare();
    }
    
    private void prepare(){
        Assassin assassin = new Assassin();
        addObject(assassin,400,300);
        
        assassin.setLocation(400,300);
        Guard1 guard1 = new Guard1();
        addObject(guard1,90,514);
        Guard2 guard2 = new Guard2();
        addObject(guard2,835,96);
        Guard3 guard3 = new Guard3();
        addObject(guard3,188,105);
    }
    
    public void act()
    {
        checkWin();
    }
    
    public void checkWin()
    {
       if (getObjects(Guard1.class).isEmpty() &&
        getObjects(Guard2.class).isEmpty() &&
        getObjects(Guard3.class).isEmpty())
       {
        Greenfoot.setWorld(new YouWin());
       }
    }
}
