import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guard3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guard1 extends Enemy
{
    private int health = 10;
    private int moveSpeed = 1;
    private int turnTimer = 0;

    public Guard1()
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 2, img.getHeight() / 2);
    }

    public void act()
    {
        randomMovement();
        checkAssassinTouch();
        checkBulletHit();
    }

    public void randomMovement()
    {
        move(moveSpeed);

        turnTimer--;

        if (turnTimer <= 0)
        {
            turn(Greenfoot.getRandomNumber(91) - 45);
            turnTimer = Greenfoot.getRandomNumber(40) + 20;
        }

        if (isAtEdge())
        {
            turn(180);
        }
    }

    public void checkAssassinTouch()
    {
        if (isTouching(Assassin.class))
        {
            Greenfoot.setWorld(new YouLost());
        }
    }

    public void checkBulletHit()
    {
        if (isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
            health--;

            if (health <= 0)
            {
                getWorld().removeObject(this);
            }
        }
    }
    
    
}
