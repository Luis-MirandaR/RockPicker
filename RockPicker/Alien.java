import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Enemy
{
    private int dir = Greenfoot.getRandomNumber(2);
    private int speed = 3;
    public void act(){
        move(this.speed);
        reAppear();
    }
    Alien(){
        if(dir == 1){
            turn(180);
            setImage("Alien2.png");
        }
    }
}
