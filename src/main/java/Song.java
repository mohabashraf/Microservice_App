public abstract class Song implements SongInterface{
    private String name;
    private Artist singer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getSinger() {
        return singer;
    }

    public void setSinger(Artist singer) {
        this.singer = singer;
    }
}
