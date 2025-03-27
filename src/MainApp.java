import java.util.Scanner;//  Scanner for user inputs

//main application class
    public class MainApp {
        private MusicLibrary library;// Referencing to the MusicLibrary class
    
    public  MainApp() { // Creating a new instance of Main app
         library = new MusicLibrary(); // Initialize music library
    }
     // Main method to run the application
    public static void main(String[] args) {
        MainApp app = new MainApp(); // Creating an instance of the app 
        Scanner scanner = new Scanner(System.in); // Scanner to a read users input

        // Adding sample songs (to be updated)
        app.library.addSong("Song A", "Artist X", 120);
        app.library.addSong("Song B", "Artist Y", 85);
        app.library.addSong("Song C", "Artist Z", 300);
        app.library.addSong("Song D", "Artist X", 150);
        app.library.addSong("Song E", "Artist X", 120);
        app.library.addSong("Song F", "Artist Y", 85);
        app.library.addSong("Song G", "Artist Z", 300);
        app.library.addSong("Song H", "Artist X", 150);
        app.library.addSong("Song I", "Artist X", 120);
        app.library.addSong("Song J", "Artist Y", 85);

// Infinite loop to display a menu until it is used
        while (true) { //menu options:
            System.out.println("\nMusic App Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs with  a certain play count");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

             // Reading user choice
             int choice = scanner.nextInt(); // Read user input as an integer
             scanner.nextLine(); // read the the newline left by nextInt()
 
 // Chose to use a switch statement to handle different menu choices
            switch (choice) {
                // Add a new song
                case 1: 
                    System.out.print("Enter song title: ");// Read song title
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");// Read artist name
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");// Read play count
                    int playCount = scanner.nextInt();
                    scanner.nextLine();  
                    app.library.addSong(title, artist, playCount);// Add the song to the library
                    break;
                    // Remove a song
                case 2:
                    System.out.print("Enter song title to remove: ");// Read the title of the song 
                    String removeTitle = scanner.nextLine();
                    app.library.removeSong(removeTitle); // Remove the song from the library
                    break;
                case 3:
                     // Print all songs in the library
                    app.library.printAllSongs(); 
                    break;
                    // Print songs with plays over a certain count
                case 4:
                    System.out.print("Enter minimum play count: "); // Read the minimum play count
                    int minPlays = scanner.nextInt();
                    scanner.nextLine();
                    app.library.PlayCount(minPlays); // Print songs with count filter
                    break;
                     // Exit the application
                case 5:
                    System.out.println("Exiting application.");
                    scanner.close();// Exit the while loop terminating the program
                    return;
                default: // Handling invalid inputs
                    System.out.println("Invalid choice. Please try again.");
            }
        
        }
    }}




    
    