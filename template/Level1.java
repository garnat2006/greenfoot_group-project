import greenfoot.*;

public class Level1 extends Levels
{
    private boolean nextButtonSpawned = false;

    public Level1()
    {
        super(900, 600);
        prepare();
        SoundManager.playBackgroundMusic();
    }

    private void prepare()
    {
        Assassin assassin = new Assassin();
        addObject(assassin, 453, 580);

        Guard3 guard3 = new Guard3();
        addObject(guard3, 773, 73);

        Guard2 guard2 = new Guard2();
        addObject(guard2, 170, 146);

        Guard1 guard1 = new Guard1();
        addObject(guard1, 714, 405);

        Guard1 guard12 = new Guard1();
        addObject(guard12, 94, 522);
    }

    public void act()
    {
        super.act();
        SoundManager.playBackgroundMusic();
        checkLevelComplete();
    }

    private void checkLevelComplete()
    {
        if (!nextButtonSpawned && getObjects(Enemy.class).isEmpty())
        {
            Enter button = new Enter();
            addObject(button, getWidth() / 2, getHeight() / 2);
            nextButtonSpawned = true;
        }
    }
}