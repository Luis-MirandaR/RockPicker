import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    public Menu()
    {    
        super(600, 400, 2);
        prepare();
    }
    public void prepare(){
        Button StartButton = new Start();
        Button HowToPlayButton = new HowToPlay();
        Button HighScoresButton = new HighScores();
        Select Select = new Select();
        Text Teclas = new Teclas();
        
        addObject(StartButton, 311, 113);
        addObject(HighScoresButton, 300, 160);
        addObject(HowToPlayButton, 302, 212);
        addObject(Select, 230, 113);
        addObject(Teclas, 520, 350);
    }
}
