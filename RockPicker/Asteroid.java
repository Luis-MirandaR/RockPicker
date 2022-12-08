import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Enemy
{
    private int dir = Greenfoot.getRandomNumber(2);
    private int speed = 1;
    public void act(){
        move(this.speed);
        reAppear();
    }
    Asteroid(int tipo){
        if(tipo == 1){
            GreenfootImage myImage = getImage();
            int myNewHeight = (int)myImage.getHeight()/2;
            int myNewWidth = (int)myImage.getWidth()/2;
            myImage.scale(myNewWidth, myNewHeight);
        }
        if(dir == 1){
            turn(180);
        }
    }
}
