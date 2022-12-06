import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private int myNewWidth;
    private int myNewHeight;
    
    GreenfootImage myImage = getImage();
    public void act()
    {
        MovSelect();
    }
    public void MovSelect(){
        Select select = (Select) getOneIntersectingObject(Select.class);
        int i;
        if (select != null) {
            for(i = 0; i < 5; i++){
                myNewHeight = (int)myImage.getHeight()-5;
                myNewWidth = (int)myImage.getWidth()-5;
                myImage.scale(myNewWidth, myNewHeight);
                Greenfoot.delay​(3);
            }
            Greenfoot.delay​(10);
            for(i = 0; i < 5; i++){
                myNewHeight = (int)myImage.getHeight()+5;
                myNewWidth = (int)myImage.getWidth()+5;
                myImage.scale(myNewWidth, myNewHeight);
                Greenfoot.delay​(3);
            }
        }
    }
}
