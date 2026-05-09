import greenfoot.*;   // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends Enemy
{
    private int health = 30;
    private int moveSpeed = 1;
    private int turnTimer = 0;

    private int spawnTimer = 0;
    private int spawnIntervalMin = 180;  
    private int spawnIntervalMax = 360;  

    private boolean fovActive = false;

    public FinalBoss()
    {
        
        setImage("boss.png");
        GreenfootImage img = getImage();
        img.scale(img.getWidth() / 2, img.getHeight() / 2);
        setImage(img);

        resetSpawnTimer();
    }

    public void act()
    {
        randomMovement();     
        maybeSpawnGuard();    
        maybeSwitchToFOV();
        checkBulletHit();
    }

    
    private void randomMovement()
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

    private void maybeSpawnGuard()
    {
        spawnTimer--;

        if (spawnTimer <= 0 && getWorld() != null)
        {
            Guard1 g = new Guard1();

            
            int sx = getX() + Greenfoot.getRandomNumber(81) - 40;
            int sy = getY() + Greenfoot.getRandomNumber(81) - 40;

            sx = Math.max(0, Math.min(getWorld().getWidth()  - 1, sx));
            sy = Math.max(0, Math.min(getWorld().getHeight() - 1, sy));

            getWorld().addObject(g, sx, sy);

            resetSpawnTimer();
        }
    }

    private void resetSpawnTimer()
    {
        spawnTimer = Greenfoot.getRandomNumber(
                         spawnIntervalMax - spawnIntervalMin + 1
                     ) + spawnIntervalMin;
    }

    
    private void maybeSwitchToFOV()
    {
        
        if (!fovActive && health <= 40)
        {
            setImage("FinalBossFOV.png");

            fovActive = true;
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
