package packagee;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistManager {
    private LinkedList<String> playlist;

    public PlaylistManager() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void moveSong(String song, int newPosition) {
        if (playlist.remove(song)) {
            if (newPosition < 0 || newPosition > playlist.size()) {
                System.out.println("Invalid position.");
                playlist.addLast(song); // Re-add song if position is invalid
                return;
            }
            playlist.add(newPosition, song);
            System.out.println("Moved song to position " + (newPosition + 1));
        } else {
            System.out.println("Song not found: " + song);
        }
    }

    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist:");
            int index = 1;
            for (String song : playlist) {
                System.out.println(index++ + ". " + song);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlaylistManager manager = new PlaylistManager();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Show Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String newSong = scanner.nextLine();
                    manager.addSong(newSong);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    manager.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter song name to move: ");
                    String songToMove = scanner.nextLine();
                    System.out.print("Enter new position (0-based index): ");
                    int position = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    manager.moveSong(songToMove, position);
                    break;
                case 4:
                    manager.displayPlaylist();
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
