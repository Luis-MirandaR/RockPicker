import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int score;
    public void act()
    {
        move();
        aspect();
        Pause();
    }
    public void Pause(){
        if(Greenfoot.isKeyDown("ESCAPE")){
            PauseMenu pm = new PauseMenu();
            getWorld().addObject(pm,600,400);
            Greenfoot.ask("Pausa");
        }
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
    public void touchingWall()
    {
        Actor wall2 = getOneIntersectingObject(Border2.class);
        Actor wall3 = getOneIntersectingObject(Border3.class);
            if (wall2 != null)
            {
                setLocation (getX() + 10,getY());
            }
            if (wall3 != null)
            {
                setLocation (getX() - 10,getY());
            }
    }
}
