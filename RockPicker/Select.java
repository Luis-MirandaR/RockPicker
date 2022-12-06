import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends Actor
{
    Select(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/12;
        int myNewWidth = (int)myImage.getWidth()/12;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("s")){
            if(getY() == 113){
                setLocation​(170,160);
                Greenfoot.delay​(10);
            }else if(getY()== 160){
                setLocation​(170,212);
                Greenfoot.delay​(10);
            }else if(getY()== 212){
                setLocation​(230,113);
                Greenfoot.delay​(1);
            }
        }
        if(Greenfoot.isKeyDown("w")){
            if(getY() == 113){
                setLocation​(170,212);
                Greenfoot.delay​(10);
            }else if(getY()== 212){
                setLocation​(170,160);
                Greenfoot.delay​(10);
            }else if(getY()== 160){
                setLocation​(230,113);
                Greenfoot.delay​(1);
            }
        }
    }
}
