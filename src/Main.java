import java.util.ArrayList;  // Imports an ArrayList class to store a list of songs
import java.util.Iterator;   // Imports Iterator to remove songs from the list
import java.util.List;       // Imports List (superclass of ArrayList)
import java.util.Scanner;    // Imports Scanner class to take user input

public class Main {
    private List<Song> songs; // Create a list to store songs

     // Method to add a new song to the list
     public void addSong(String title, String artist, int playCount) { //void as the method does not return a value
        songs.add(new Song(title, artist, playCount)); // Creates and adds a new Song object
        System.out.println("Song added successfully."); 
     }

    // Method to remove a song by title
    public void removeSong(String title) {
        Iterator<Song> iterator = songs.iterator();  // Creates an iterator for safe removal
    }
}
