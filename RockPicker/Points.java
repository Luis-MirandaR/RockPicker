import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    private final int xLimit = 10;
    private final int yLimit = 10;
    private final int blackSpaceUp = 220;
    
    public void act()
    {
        getTouched();
    }
    public void getTouched(){
        if(isTouching(Garra.class)){
            setLocation(xLimit + Greenfoot.getRandomNumber(1180), blackSpaceUp + Greenfoot.getRandomNumber(570));
        }
    }
}
