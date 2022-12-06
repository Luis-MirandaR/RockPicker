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
        int temporal = actualScore;
        int temporal2;
        int flag = 0;
        String temporalString = null;
        String temporalString2 = null;
        
        actualHighScores = hs.getHighScores();
        for(int i = 0; i < 6; i+=2){
            if(temporal > Integer.parseInt(actualHighScores[i+1])){
                if(flag==0){
                    temporalString = actualHighScores[i];
                    actualHighScores[i] = Greenfoot.ask("Type your name: ");
                    
                    temporal = Integer.parseInt(actualHighScores[i+1]);
                    actualHighScores[i+1] = Integer.toString(actualScore);
                    flag = 1;
                }else{
                    temporalString2 = actualHighScores[i];
                    actualHighScores[i] = temporalString;
                    
                    temporal2 = Integer.parseInt(actualHighScores[i+1]);
                    actualHighScores[i+1] = Integer.toString(temporal);
                    temporal = temporal2;
                }
            }
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
