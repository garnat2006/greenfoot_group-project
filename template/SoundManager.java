import greenfoot.*;

public class SoundManager
{
    private static GreenfootSound backgroundMusic = new GreenfootSound("backgroundmusic.mp3");
    
    public static void playBackgroundMusic()
    {
        if (!backgroundMusic.isPlaying())
        {
            backgroundMusic.playLoop();
        }
    }

    public static void stopBackgroundMusic()
    {
        backgroundMusic.stop();
    }

    public static void shoot()
    {
        Greenfoot.playSound("gunshot.mp3");
    }
    
    public static void win()
    {
        Greenfoot.playSound("winsound.mp3");
    }
    
    public static void lose()
    {
        Greenfoot.playSound("losing.mp3");
    }
}