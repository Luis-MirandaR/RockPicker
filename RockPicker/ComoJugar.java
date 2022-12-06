import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ComoJugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComoJugar extends World
{
    /**
     * Constructor for objects of class ComoJugar.
     * 
     */
    public ComoJugar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
            prepare();
    }
    public void prepare(){
        Sign h2p = new Sign();
        Button Return = new Return();
        Select Select = new Select();
        Points emerald = new Emerald();
        Points gem = new Gem();
        Enemy alien = new Alien();
        Enemy asteroid = new Asteroid();
        Enemy plier = new Plier();
        Teclas teclas = new Teclas();
        Sign enemies = new Sign();
        Sign points = new Sign();
        
        //Images
        addObject(emerald,151,321);
        addObject(gem, 379, 321);
        addObject(plier, 1128, 333);
        addObject(alien,773, 308);
        addObject(asteroid, 947, 323);
        addObject(teclas, 634, 549);
        
        //Buttons
        addObject(Return,170,50);
        
        //Signs
        h2p.setImage("HowToPlayRP.png");
        addObject(h2p, 600, 50);
        enemies.setImage("EnemiesExp.png");
        addObject(enemies, 940, 193);
        points.setImage("PointsExp.png");
        addObject(points, 261, 194);
        
        //Select
        addObject(Select, 60, 50);
    }
}
