/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfootballsetup;

/**
 *
 * @author dougl
 */
public class Forward extends Player{
    
    int numGoalScored;
    
    public Forward(int numGoalScored, String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalScored = numGoalScored;
    }
    
     public Forward(String fname, String lname, String country, int age, String position) {
        super(fname, lname, country, age, position);
        this.numGoalScored = 0;
    }
    
}
