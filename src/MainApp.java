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

        // Adding original set of songs 
        app.library.addoriginalSong("Irreplaceable", "Beyonce", 2567800);
        app.library.addoriginalSong("One Last Time", "Ariana Grande", 2023400);
        app.library.addoriginalSong("Fancy", "Drake", 1890100);
        app.library.addoriginalSong("Love Yourz", "J Cole", 556780);
        app.library.addoriginalSong("Break From Toronto", "Party Next Door", 223450);
        app.library.addoriginalSong("Time Flies", "Drake", 100456);
        app.library.addoriginalSong("Imagine", "Ariana Grande", 50300);
        app.library.addoriginalSong("Be MY Baby", "Ariana Grande", 10250);
        app.library.addoriginalSong("Monopoly", "Victoria Monet", 8123);
        app.library.addoriginalSong("Chicago", "Michael Jackson", 4321);

// Infinite loop to display a menu until it is used
        while (true) { //menu options:
            System.out.println("\nMusic App Menu:");
            System.out.println("1. Add a new song");
            System.out.println("2. Remove a song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs with  a certain play count");
            System.out.println("5. Print songs from a certain Artist ");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

             // Reading user choice
             int choice = scanner.nextInt(); // Read user input as an integer
             scanner.nextLine(); // read the the newline left by nextInt()
 
 // Chose to use if statements to handle different menu choices
            if (choice == 1) {
                // Add a new song
                    System.out.print("Enter song title: ");// Read song title
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");// Read artist name
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");// Read play count
                    int playCount = scanner.nextInt();
                    scanner.nextLine();  
                    app.library.addSong(title, artist, playCount);// Add the song to the library 
            }
                    // Remove a song
                else if (choice == 2) {
                    System.out.print("Enter song title to remove: ");// Read the title of the song 
                    String removeTitle = scanner.nextLine();
                    app.library.removeSong(removeTitle); // Remove the song from the library
            }
                else if (choice ==3)  {
                     // Print all songs in the library
                    app.library.printAllSongs(); 
            }
                    // Print songs with plays over a certain count
                else if (choice == 4)  {
                    System.out.print("Enter minimum play count: "); 
                    int minPlays = scanner.nextInt();// Read the minimum play count
                    scanner.nextLine();
                    app.library.PlayCount(minPlays); // Print songs with count filter
            }
                // print a specified artists songs
                else if (choice == 5) {
                    System.out.print("Enter artists name : "); // Read the artist name
                    String artist = scanner.nextLine();//taking user input
                    app.library.PrintByArtist(artist); //calling method
                }
                     // Exit the application
                else if (choice == 6)  {
                    System.out.println("Exiting application.");
                    scanner.close();// Exit the while loop terminating the program
                }
                else {// Handling invalid inputs
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        
    }}




    
    