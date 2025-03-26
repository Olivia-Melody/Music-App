import java.util.Scanner;
import java.util.jar.Manifest;

public class MusicLibrary {
    private MusicLibrary library; // Use MusicLibrary instead of storing songs directly

    public MusicStreamingApp() {
        library = new MusicLibrary(); // Initialize music library
    }

    public static void main(String[] args) {
        Main app = new Main();
        Scanner scanner = new Scanner(System.in);

        // Adding sample songs
        app.library.addSong("Song A", "Artist X", 120);
        app.library.addSong("Song B", "Artist Y", 85);
        app.library.addSong("Song C", "Artist Z", 300);
        app.library.addSong("Song D", "Artist X", 150);

        while (true) {
            System.out.println("\nMusic App Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");





    }
    }
}
