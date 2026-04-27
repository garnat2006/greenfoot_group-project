import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevel extends Button
{
    public NextLevel()
    {
        GreenfootImage img = getImage();
        img.scale(400, 150);
    }
    
     /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level2());
        }
    }
}
