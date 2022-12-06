import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Button
{
   int myNewWidth;
    int myNewHeight;
    GreenfootImage myImage = getImage();
    public void act()
    {
        MovSelect();
        if(Greenfoot.isKeyDown("Space") ||Greenfoot.isKeyDown("Enter") ){
            Greenfoot.setWorld(new ComoJugar());
        }
    }
}
