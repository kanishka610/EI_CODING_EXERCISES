public class SongPlaylist implements Aggregate {
    private String[] songs;
    private int count = 0;

    public SongPlaylist(int size) {
        songs = new String[size];
    }

    public void addSong(String song) {
        if(count < songs.length) {
            songs[count++] = song;
        }
    }

    public String getSong(int index) {
        if(index >= 0 && index < count) return songs[index];
        return null;
    }

    public int getCount() {
        return count;
    }

    @Override
    public Iterator createIterator() {
        return new SongIterator(this);
    }
}
