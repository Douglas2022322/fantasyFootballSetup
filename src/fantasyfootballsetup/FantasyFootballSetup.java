/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfootballsetup;

import ioutils.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author dougl
 */
public class FantasyFootballSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //Objects
        IOUtils userInput = new IOUtils();//Create a object to get the user input
        IntroMessages introMessages = new IntroMessages();
        ReadFileData readFileData = new ReadFileData();

        introMessages.printMenuMessages();

        int option = userInput.getUserInt("Enter one of the option:", 1, 2);//Get the user input

        if (option == 1) {
            ArrayList values = readFileData.readFileData();
           // for (int qty = 0; values.length >= qty; qty++) {
                System.out.println(values);
            //}
        }
    }
}
