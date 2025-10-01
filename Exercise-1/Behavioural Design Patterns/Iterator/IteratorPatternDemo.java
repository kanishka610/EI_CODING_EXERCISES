public class IteratorPatternDemo {
    public static void main(String[] args) {
        SongPlaylist playlist = new SongPlaylist(5);
        playlist.addSong("Song A");
        playlist.addSong("Song B");
        playlist.addSong("Song C");

        Iterator iterator = playlist.createIterator();

        System.out.println("Playing songs from playlist:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
