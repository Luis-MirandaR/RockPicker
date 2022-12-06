import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighScores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScores extends Button
{
    private int myNewWidth;
    private int myNewHeight;
    
    GreenfootImage myImage = getImage();
    public void act()
    {
        MovSelect();
        if(Greenfoot.isKeyDown("Space") ||Greenfoot.isKeyDown("Enter") ){
            Greenfoot.setWorld(new HighScoreScene());
        }
    }
}
