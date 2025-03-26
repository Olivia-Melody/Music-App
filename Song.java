public class Song { // private fields to store the details of the song 
    private String title;    // Stores the song title
    private String artist;   // Stores the name of the artist
    private int playCount;   // Stores the number of times the song has been played


public Song(String title, String artist, int playCount) { //adds song properties when a song is added
    this.title = title;      // Assigns title from parameter to instance variable
    this.artist = artist;    // Assigns artist name from parameter to instance variable
    this.playCount = playCount; // Assigns play count from parameter to instance variable
}
//getter methods to provide access to the song detail fields
public String getTitle() {
    return title;   // Returns song title
}

public String getArtist() {
    return artist;  // Returns artist name
}

public int getPlayCount() {
    return playCount;   // Returns number of times song has been played
}
   // Method to return a string  of the song details
public String toString() {
    return "Title: " + title + ", Artist: " + artist + ", Plays: " + playCount;
}

}
