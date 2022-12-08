import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Button
{
    Return(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/2;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    int myNewWidth;
    int myNewHeight;
    GreenfootImage myImage = getImage();
    GreenfootImage Original = getImage();
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
            if(Greenfoot.isKeyDown("Space") ||Greenfoot.isKeyDown("Enter") ){
                Greenfoot.setWorld(new Menu());
            }
        }
        else{
            setImage(Original);
        }
    }
}
