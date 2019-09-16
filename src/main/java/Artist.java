import java.util.ArrayList;

public abstract class Artist implements ArtistInterface{
    private String name;
    private ArrayList<Album> releasedAlbums;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Album> getReleasedAlbums() {
        return releasedAlbums;
    }

    public void setReleasedAlbums(ArrayList<Album> releasedAlbums) {
        this.releasedAlbums = releasedAlbums;
    }
}
