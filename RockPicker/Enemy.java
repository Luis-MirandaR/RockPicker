import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public void act()
    {
        reAppear();
    }
    public void reAppear(){
        int y;
        do{
            y = Greenfoot.getRandomNumber(620);
        }while(y < 230);
        if(this.isTouching(Border2.class)){

           setLocation(1100,150 + y);
        }
        else if(this.isTouching(Border3.class)){

           setLocation(100, 150 + y);
        }
    }
}
