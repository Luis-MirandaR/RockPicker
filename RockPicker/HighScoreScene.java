import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HighScoreScene extends World
{
    private String[] Scores = new String[6];
    private File f = new File("Scores.csv");
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;
    private FileWriter escritor;
    
    public HighScoreScene()
    {    
        super(1200, 800, 1);
        readCSV();
        prepare();
    }
    void prepare(){
        Button Return = new Return();
        Select Select = new Select();
        Plates gold = new Gold();
        Plates silver = new Silver();
        Plates bronze = new Bronze();
        
        addObject(Return,170,50);
        addObject(Select, 50, 50);
        addObject(gold, 605, 165);
        showText(Scores[0] + ": " + Scores[1], 605, 165);
        addObject(silver, 605, 315);
        showText(Scores[2] + ": " + Scores [3], 605, 315);
        addObject(bronze, 605, 465);
        showText(Scores[4]  + ": " + Scores [5], 605, 465);
    }
    public String[] getHighScores(){
        readCSV();
        return Scores;
    }
    public void setHighScores(String[] scores){
        writeCSV(scores);
    }
    public void readCSV(){
        int i = 0;
        try{
            lector = new BufferedReader(new FileReader("Scores.csv"));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                Scores[i] = partes[0];
                Scores [i+1] = partes[1];
                i+=2;
            }
            lector.close();
            linea = null;
            partes = null;
        }catch(Exception e){
            
        }
    }
    public void writeCSV(String[] scores){
        int i = 0;
        try(FileWriter fw = new FileWriter(f);){
            while(i < 6){
                fw.write(Scores[i] + "," + Scores[i+1] + "\n");
                i+=2;
            }
        }catch(Exception e){
            
        }
    }
}
