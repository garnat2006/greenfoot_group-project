import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Assassin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assassin extends Actor
{
    private final static double BULLET_VELOCITY = 300.0;
    
    public Assassin()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 2, img.getHeight() / 2);
    }
    
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
            Vector2D bulletToMouse = new Vector2D(
                mouse.getX() - getX(),
                mouse.getY() - getY()
            );
            
            alignWithVector(bulletToMouse);
        
            if (Greenfoot.mouseClicked(null))
            {
                bulletToMouse.normalize();
                bulletToMouse = Vector2D.multiply(bulletToMouse, BULLET_VELOCITY);
        
                Bullet ball = new Bullet();
                ball.setVelocity(bulletToMouse);
                getWorld().addObject(ball, getX(), getY());
            
            }
        }
    }
    
    public void alignWithVector(Vector2D v)
    {
        double adjacent = v.getX();
        double opposite = v.getY();
    
        double angleRadians = Math.atan2(opposite, adjacent);
        double angleDegrees = Math.toDegrees(angleRadians);
    
        setRotation((int) angleDegrees + 290);
    }

    public void moveWithWASD()
    {
        int speed = 2;
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