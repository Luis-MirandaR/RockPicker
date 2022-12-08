import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InGame extends World
{
    private final int blackSpaceUp = 220;
    public InGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    void prepare(){
        Player jugador = new Player();
        Player garra = new Garra();
        Border border1 = new Border();
        Border2 border2 = new Border2();
        Border3 border3 = new Border3();
        
        addObject(border1, 600, 64);
        addObject(border2, 0, 400);
        addObject(border3, 1200, 400);
        addObject(jugador, 600, 150);
        addObject(garra, 600, 180);
        
        GenerarAsteroides(8);
        GenerarEsmeraldas(2);
        GenerarGemas(2);
        GenerarAlien(3);
        GenerarPlier(2);
    }
    
    public void GenerarAsteroides(int num){
        int x;
        for(int i = 0; i < num; i++){
            Enemy a = new Asteroid(Greenfoot.getRandomNumber(2));
            do{
                x = Greenfoot.getRandomNumber(getWidth());
            }while(x < 230);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(a, x, blackSpaceUp + 20 + y);
        }
    }
    public void GenerarEsmeraldas(int num){
        int x;
        for(int i = 0; i < num; i++){
            Points em = new Emerald();
            do{
                x = Greenfoot.getRandomNumber(getWidth());
            }while(x < 230);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(em,x, blackSpaceUp + y);
        }
    }
    public void GenerarGemas(int num){
        int x;
        for(int i = 0; i < num; i++){
            Points gem = new Gem();
            do{
                x = Greenfoot.getRandomNumber(getWidth());
            }while(x < 230);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(gem, x , blackSpaceUp + y);
        }
    }
    public void GenerarAlien(int num){
        int x;
        for(int i = 0; i < num; i++){
            Enemy ali = new Alien();
            do{
                x = Greenfoot.getRandomNumber(getWidth());
            }while(x < 230);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(ali,x, blackSpaceUp + 20 + y);
        }
    }
    
    public void GenerarPlier(int num){
        int x;
        for(int i = 0; i < num; i++){
            Enemy plier = new Plier(Greenfoot.getRandomNumber(2));
            do{
                x = Greenfoot.getRandomNumber(getWidth());
            }while(x < 230);
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(plier,x, blackSpaceUp + y);
        }
    }
}
