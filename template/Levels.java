import greenfoot.*;

public class Levels extends World
{
    protected long lastFrameTimeMS;
    protected double timeStepDuration;

    public Levels(int width, int height)
    {    
        super(width, height, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60.0;
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }
}