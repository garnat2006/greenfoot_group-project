import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    
    private static final double GRAVITY = 9.8 * 200;
    
    public Bullet()
    {
        position = null;
        velocity = new Vector2D(0.0, 0.0);
        acceleration = new Vector2D(0.0, 0.0);
    }
    
    public void act() 
    {
        updatePhysics();
    }    
    
    public void setVelocity(Vector2D newValue)
    {
        velocity = newValue;

        double angleRadians = Math.atan2(velocity.getY(), velocity.getX());
        double angleDegrees = Math.toDegrees(angleRadians);
    
        setRotation((int) angleDegrees + 190);
    }
    
    public void updatePhysics()
    {
        // Initial position
        
        if (position == null)
        {
            position = new Point2D(getX(), getY());
        }
    
        double dt = 1.0 / 60.0;
    
        if (getWorld() instanceof TrainingFacility)
        {
            TrainingFacility world = (TrainingFacility)getWorld();
            dt = world.getTimeStepDuration();
        }
        else if (getWorld() instanceof Level1)
        {
            Level1 world = (Level1)getWorld();
            dt = world.getTimeStepDuration();
        }
    
        Vector2D velocityVariation = Vector2D.multiply(acceleration, dt);
        velocity = Vector2D.add(velocity, velocityVariation);
    
        Vector2D positionVariation = Vector2D.multiply(velocity, dt);
        position.add(positionVariation);
    
        setLocation((int) position.getX(), (int) position.getY());
        }
    }

