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
public class Event {
    
    private String month;
    private int day;
    private int year;
    private Dj artist;
    private Venue place;
    
    public Event(String month, int day, int year, Dj artist, Venue place){
        
        this.month = month;
        this.day = day;
        this.year = year;
        this.artist = artist;
        this.place = place; 
        
    }
        
    
    @Override
    public String toString(){
        
        String str = ("\nDate: " + month +" "+ day + ", " + year +
                      "\nArtist: " + artist +
                      "\nVenue: " + place);
        
        return str;
    }
}
