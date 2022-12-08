import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garra extends Player
{
    private int score;
    Garra(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/8;
        int myNewWidth = (int)myImage.getWidth()/8;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        move();
        gameover();
        getPoints();
        showStatus();
    }
    public void move(){
        if(Greenfoot.isKeyDown("A")){
            mueveteIzquierda();
        }
        if(Greenfoot.isKeyDown("D")){
            mueveteDerecha();
        }
    }
    public void mueveteIzquierda()
    {
        this.setLocation(this.getX()-5, this.getY());
    }
    public void mueveteDerecha()
    {
        this.setLocation(this.getX() +5, this.getY());
    }
    
    public void gameover(){
        if(isTouching(Enemy.class))
            Greenfoot.setWorld(new GameOver(score));
    }
    
        public void getPoints()
    {
        if(isTouching(Points.class)){
            int points = 0;
            if(isTouching(Gem.class)){
                points = 10;
            }
            if(isTouching(Emerald.class)){
                points = 5;
            }
            
            removeTouching(Points.class);
            increaseScore(points);
        }
    }
        public void increaseScore(int points)
    {
        score+=points;
        showStatus();
        move();
    }
    
        public void showStatus()
    {
        getWorld().showText("Score : " + score, 1100, 50);
    }
}
