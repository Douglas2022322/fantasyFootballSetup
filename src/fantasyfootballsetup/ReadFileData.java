/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Douglas V Dierings
 */
public class ReadFileData {

    public ArrayList readFileData() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv"));
        ArrayList<String> playersInfo = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            
            String[] playerData = line.split(",");
            if(playerData[4].equals("foward")){
                Forward player = new Forward(0,playerData[0], playerData[1], playerData[2], Integer.parseInt(playerData[3]), playerData[4]);
            }
            playersInfo.add(line);
        }
        br.close();
        return playersInfo;
    }

}
