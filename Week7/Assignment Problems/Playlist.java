class Playlist {
    private String[] songs;
    private int songCount;

    // Constructor
    public Playlist(int maxSongs) {
        songs = new String[maxSongs];
        songCount = 0;
    }

    // Add a song
    public void addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount] = song;
            songCount++;
        }
    }

    // Return a copy of the songs
    public String[] getSongs() {
        String[] copy = new String[songCount];

        for (int i = 0; i < songCount; i++) {
            copy[i] = songs[i];
        }

        return copy;
    }

    // Return number of songs
    public int getSongCount() {
        return songCount;
    }
}

public class Main {
    public static void main(String[] args) {

        Playlist p = new Playlist(10);

        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();

        System.out.println(copy[0]);
        System.out.println(copy[1]);

        // Modify the returned copy
        copy[0] = "Hacked";

        System.out.println("After modifying copy:");
        System.out.println("Playlist first song = " + p.getSongs()[0]);
        System.out.println("Song count = " + p.getSongCount());
    }
}