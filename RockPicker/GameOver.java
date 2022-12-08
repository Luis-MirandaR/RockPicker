import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class GameOver extends World
{
    private int actualScore;
    private String[] actualHighScores;
    private File f = new File("Scores.csv");
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private FileWriter escritor;
    
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        actualScore = score;
        prepare();
        isHighScore();
    }
    public void prepare(){
        Button Return = new Return();
        Select select = new Select();
        loseplayer player = new loseplayer();
        showText("Your score: " + actualScore, 600, 400);
        
        addObject(select, 480, 600);
        addObject(Return, 600, 600);
        addObject(player, 600, 400);
    }
    public void isHighScore(){
        HighScoreScene hs = new HighScoreScene();
        int temporal;
        String tempString;
        
        actualHighScores = hs.getHighScores();
        if(Integer.parseInt(actualHighScores[1]) < actualScore){
            actualHighScores[4] = actualHighScores [2];
            actualHighScores[2] = actualHighScores [0];
            actualHighScores[0] = Greenfoot.ask("Type your name!: ");
            
            actualHighScores[5] = actualHighScores[3];
            actualHighScores[3] = actualHighScores[1];
            actualHighScores[1] = Integer.toString(actualScore);
        }else if(Integer.parseInt(actualHighScores[3]) < actualScore){
            actualHighScores[4] = actualHighScores [2];
            actualHighScores[2] = Greenfoot.ask("Type your name!: ");
            
            actualHighScores[5] = actualHighScores[3];
            actualHighScores[3] = Integer.toString(actualScore);
        }else if(Integer.parseInt(actualHighScores[5]) < actualScore){
            actualHighScores[4] = Greenfoot.ask("Type your name!: ");
            
            actualHighScores[5] = Integer.toString(actualScore);
        }
        writeCSV(actualHighScores);
    }
    public void writeCSV(String[] scores){
        int i = 0;
        try(FileWriter fw = new FileWriter(f);){
            while(i < 6){
                fw.write(actualHighScores[i] + "," + actualHighScores[i+1] + "\n");
                i+=2;
            }
        }catch(Exception e){
            
        }
    }
}
