import lang.stride.*;
import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Assasin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assassin extends Actor
{
    public Assassin()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 2, img.getHeight() / 2);
    }
    
    /**
     * Act - do whatever the Assasin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        aimWithMouse();
        moveWithWASD();
    }

    public void aimWithMouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null)
        {
            turnTowards(mouse.getX(), mouse.getY());
            setRotation(getRotation() + 290); // change if needed
        }
    }

    public void moveWithWASD()
    {
        int speed = 3;
        int oldX = getX();
        int oldY = getY();

        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + speed, getY());
        }

    }
    
}
