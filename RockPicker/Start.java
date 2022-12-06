import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    int myNewWidth;
    int myNewHeight;
    GreenfootImage myImage = getImage();
    GreenfootImage OriginalImage = getImage();
    int OriginalHeight = (int)myImage.getHeight();
    int OriginalWidth = (int)myImage.getWidth();
    public void act()
    {
        MovSelect();
        if(Greenfoot.isKeyDown("Space") ||Greenfoot.isKeyDown("Enter") ){
            Greenfoot.setWorld(new InGame());
        }
    }
}
