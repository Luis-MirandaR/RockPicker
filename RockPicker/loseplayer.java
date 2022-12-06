import greenfoot.*;
public class loseplayer extends Actor
{
    private String direccion = "choqueArriba";
    public void act()
    { 
        move(100);
        setRotation(Greenfoot.getRandomNumber(360));
    }
}
