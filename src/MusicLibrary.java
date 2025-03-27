import java.util.ArrayList;  // Imports an ArrayList class to store a list of songs
import java.util.Iterator;   // Imports Iterator to remove songs from the list
import java.util.List;       // Imports List (superclass of ArrayList)

// the music library class, which holds a list of songs
public class MusicLibrary {
    private List<Song> songs; // Create an arraylist to store songs

    public MusicLibrary() { // Initializes an empty list of songs (music library)
        songs = new ArrayList<>();  // Create a new empty list of songs
    }

     // Method to add a new song to the list(user addition)
     public void addSong(String title, String artist, int playCount) { //void as the method does not return a value
        songs.add(new Song(title, artist, playCount)); // // Add new song to the list
        System.out.println("Song added successfully."); 
     }

     // Method to add to the original set of songs to the list
     public void addoriginalSong(String title, String artist, int playCount) { //void as the method does not return a value
        songs.add(new Song(title, artist, playCount)); // // Add new song to the list 
     }

    // Method to remove a song by title
    public void removeSong(String title) {
        Iterator<Song> iterator = songs.iterator();  // Creates an iterator for songs removal
        while (iterator.hasNext()) {
            Song song = iterator.next();// Get the next song
            if (song.getTitle().equalsIgnoreCase(title)) { // If titles match - made case-insensitive
                iterator.remove();// Remove the song from the list
                System.out.println("Song removed successfully.");
                return;//exit method
            }
        }
        System.out.println("Song not found.");
    }

    // Method to print all songs in the library
    public void printAllSongs() {
        if (songs.isEmpty()) { // Check if the list is empty
            System.out.println("No songs in the list.");
            return;
        }
        for (Song song : songs) { // Iterate over all songs in the list
            System.out.println(song); // Print each song's information
        }
        }

    // Method to print songs that have been played more than the certain amount
    public void PlayCount(int playCount) {
        boolean found = false; // Flag to track if any song matches the criteria
        for (Song song : songs) { // Iterate over all songs
            if (song.getPlayCount() > playCount) { // Check if play count exceeds value user
                System.out.println(song); // Print the song/songs
                found = true; 
            }
        }
        if (!found) { // If no songs were found with the specified criteria
            System.out.println("No songs found with more than " + playCount + " plays.");
        }
    }
}


