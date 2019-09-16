import java.util.ArrayList;

public interface UserInterface {
    String getName();
    void setName(String name);
    ArrayList<Song> getFavouriteSongs();
    void setFavouriteSongs(ArrayList<Song> favouriteSongs);
    ArrayList<Song> getFavouriteAlbums();
    void setFavouriteAlbums(ArrayList<Song> favouriteAlbums);
    ArrayList<Song> getListenedSongs();
    void setListenedSongs(ArrayList<Song> listenedSongs);

}
