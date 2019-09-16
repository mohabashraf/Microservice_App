import java.util.ArrayList;

public interface ArtistInterface {
    public String getName();
    public void setName(String name);
    ArrayList<Album> getReleasedAlbums();
    void setReleasedAlbums(ArrayList<Album> releasedAlbums);
}
