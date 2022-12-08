import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plier extends Enemy
{
    private int dir = Greenfoot.getRandomNumber(2);
    private final int speed = 2;
    public void act(){
        move(this.speed);
        reAppear();
    }
    Plier(int dir){
        if(dir == 1){
            turn(180);
            setImage("Plier2.png");
        }
    }
}
