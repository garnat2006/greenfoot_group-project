import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SoundManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundManager
{
    private static GreenfootSound backgroundMusic = new GreenfootSound("backgroundmusic.mp3");
    
      public static void playBackgroundMusic(){
        
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
        stopBackgroundMusic();
        Greenfoot.playSound("winsound.mp3");
    }
    
    public static void lose()
    {
        stopBackgroundMusic();
        Greenfoot.playSound("losing.mp3");
    }
}
