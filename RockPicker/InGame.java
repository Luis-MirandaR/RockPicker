import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InGame extends World
{
    public InGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    void prepare(){
        Player jugador = new Player();
        Points emerald = new Emerald();
        Points gem = new Gem();
        Enemy enemy = new Alien();
        Border border = new Border();
        
        addObject(border, 600, 64);
        addObject(enemy, 600, 500);
        addObject(jugador, 600, 150);
        addObject(gem, 600, 550);
        addObject(emerald, 600, 300);
    }
}
