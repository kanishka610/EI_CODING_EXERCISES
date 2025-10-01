public class SongIterator implements Iterator {
    private SongPlaylist playlist;
    private int index = 0;

    public SongIterator(SongPlaylist playlist) {
        this.playlist = playlist;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getCount();
    }

    @Override
    public String next() {
        return playlist.getSong(index++);
    }
}
