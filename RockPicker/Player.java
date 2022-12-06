import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int score;
    public void act()
    {
        move();
        showStatus();
        getPoints();
        aspect();
        gameover();
        touchingWall();
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
    public void move(){
        if(Greenfoot.isKeyDown("W")){
            mueveteArriba();
        }
        if(Greenfoot.isKeyDown("S")){
            mueveteAbajo();
        }
    }
    public void mueveteArriba()
    {
        this.setLocation(this.getX(), this.getY() - 5);
    }
    public void mueveteAbajo()
    {
        this.setLocation(this.getX(), this.getY() + 5);
    }
    public void aspect(){
        if(score > 10 && score < 50){
            setImage("Nave1.png");
        }
        if(score > 50 && score < 150){
            setImage("Nave2.png");
        }
        if(score > 150){
            setImage("Nave3.png");
        }
    }
    public void gameover(){
        if(isTouching(Enemy.class))
            Greenfoot.setWorld(new GameOver(score));
    }
    public void touchingWall()
    {
        Actor wall = getOneIntersectingObject(Border.class);
            if (wall != null)
            {
                setLocation (getX(),getY()+10);
            }
    }
}
