import java.util.ArrayList;

public abstract class User implements UserInterface{
    private String name;
    private ArrayList<Song> favouriteSongs;
    private ArrayList<Song> favouriteAlbums;
    private ArrayList<Song> listenedSongs;
    private ArrayList<Song> listenedAlbums;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getFavouriteSongs() {
        return favouriteSongs;
    }

    public void setFavouriteSongs(ArrayList<Song> favouriteSongs) {
        this.favouriteSongs = favouriteSongs;
    }

    public ArrayList<Song> getFavouriteAlbums() {
        return favouriteAlbums;
    }

    public void setFavouriteAlbums(ArrayList<Song> favouriteAlbums) {
        this.favouriteAlbums = favouriteAlbums;
    }

    public ArrayList<Song> getListenedSongs() {
        return listenedSongs;
    }

    public void setListenedSongs(ArrayList<Song> listenedSongs) {
        this.listenedSongs = listenedSongs;
    }

    public ArrayList<Song> getListenedAlbums() {
        return listenedAlbums;
    }

    public void setListenedAlbums(ArrayList<Song> listenedAlbums) {
        this.listenedAlbums = listenedAlbums;
    }
}
