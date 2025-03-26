import java.util.Scanner;// Importing Scanner for user input

//main application class
    public class Main {
        private Main library;// Instance variable to store the music library
    
    public  Main() { // Creating a new instance of Main
         library = new Main(); // Initialize music library
    }

    public static void main(String[] args) {
        Main app = new Main(); // Creating an instance of Main to access MusicLibrary
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

             // Reading user choice
             int choice = scanner.nextInt(); // Read user input as an integer
             scanner.nextLine(); // Consume the newline character
 

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");
                    int playCount = scanner.nextInt();
                    scanner.nextLine();
                    app.library.addSong(title, artist, playCount);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    app.library.removeSong(removeTitle);
                    break;
                case 3:
                    app.library.printAllSongs();
                    break;
                case 4:
                    System.out.print("Enter minimum play count: ");
                    int minPlays = scanner.nextInt();
                    scanner.nextLine();
                    app.library.printSongsOverPlayCount(minPlays);
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        
        }
    }




    
    