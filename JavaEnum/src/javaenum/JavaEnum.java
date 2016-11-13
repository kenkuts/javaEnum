/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaenum;

/**
 *
 * @author Kenneth R. Kutschera
 */
public class JavaEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("This program shows an example of enum data type");
        
        Dj artist = Dj.KASKADE;
        Venue place = Venue.TERMINAL_5;
        
        Event now = new Event("January", 2, 2017, artist, place);
        
        System.out.println(now);
    }
    
}
