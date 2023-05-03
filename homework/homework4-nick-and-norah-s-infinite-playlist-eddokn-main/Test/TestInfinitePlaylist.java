import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class TestInfinitePlaylist {
    private Song createSong1() {
        String title = "Shallow";
        String[] artists = new String[] { "Lady Gaga", "Bradley Coooper" };
        int duration = 207;
        return new Song(title, artists, duration);
    }

    private Song createSong2() {
        String title = "Istanbul";
        String[] artists = new String[] { "They Might Be Giants" };
        int duration = 304;
        return new Song(title, artists, duration);
    }

    private Song createSong3() {
        String title = "Rocketman";
        String[] artists = new String[] { "Gobbledy" };
        int duration = 427;
        return new Song(title, artists, duration);
    }

    @Test
    public void testSong() {
        String title = "Shallow";
        String[] artists = new String[] { "Lady Gaga", "Bradley Coooper" };
        int duration = 207;
        Song song = new Song(title, artists, duration);

        assertEquals(title, song.getTitle());
        assertEquals(artists.length, song.getArtists().length);
        for (int i = 0; i < artists.length; i++) {
            assertTrue(song.getArtists()[i].equals(artists[i]));
        }
    }

    @Test
    public void testCreatePlaylist() {
        String title = "Nick and Norah's Infinite Playlist";
        InfinitePlaylist ip = new InfinitePlaylist(title);
        assertTrue(ip.getTitle().equals(title));
        assertEquals(0, ip.size());
    }

    private void songEquals(Song s1, Song s2) {
        assertEquals(s1.getTitle(), s2.getTitle());
        assertEquals(s1.getArtists(), s2.getArtists());
        assertEquals(s1.getDurationSeconds(), s2.getDurationSeconds());
    }

    @Test
    public void testAddSong() {
        Song song = createSong1();
        InfinitePlaylist ip = new InfinitePlaylist("test add song");
        ip.add(song);
        assertEquals(1, ip.size());

        Song current = ip.play();
        songEquals(song, current);
    }

    @Test
    public void testAdvance() {
        Song song = createSong1();
        InfinitePlaylist ip = new InfinitePlaylist("test add song");
        ip.add(song);
        assertEquals(1, ip.size());

        Song current = ip.play();
        songEquals(song, current);
        Song newcurrent = ip.play();
        songEquals(song, newcurrent);
    }

    @Test
    public void testMultiAdd() {
        Song song1 = createSong1();
        Song song2 = createSong2();
        Song song3 = createSong3();

        InfinitePlaylist ip = new InfinitePlaylist("test multi add song");

        ip.add(song1);
        assertEquals(1, ip.size());

        ip.add(song2);
        assertEquals(2, ip.size());

        ip.add(song3);
        assertEquals(3, ip.size());

        // order should be: song1, song3, song2

        Song current = ip.play();
        songEquals(song1, current);

        Song current2 = ip.play();
        songEquals(song3, current2);

        Song current3 = ip.play();
        songEquals(song2, current3);

        Song current4 = ip.play();
        songEquals(song1, current4);
    }

    @Test
    public void testIteratorMovement() {
        Song song1 = createSong1();
        Song song2 = createSong2();
        Song song3 = createSong3();

        InfinitePlaylist ip = new InfinitePlaylist("test multi add song");

        ip.add(song1);
        ip.add(song2);
        ip.add(song3);

        // order should be: song1, song3, song2
        SongIterator it = ip.iterator();
        songEquals(song1, it.current());

        it.previous();
        songEquals(song2, it.current());

        it.previous();
        songEquals(song3, it.current());

        it.previous();
        songEquals(song1, it.current());

        it.next();
        songEquals(song3, it.current());
    }

    @Test
    public void testReset() {
        Song song1 = createSong1();
        Song song2 = createSong2();
        Song song3 = createSong3();

        InfinitePlaylist ip = new InfinitePlaylist("test multi add song");

        ip.add(song1);
        ip.add(song2);
        ip.add(song3);

        // order should be: song1, song3, song2
        SongIterator it = ip.iterator();
        songEquals(song1, it.current());

        it.previous();
        assertEquals(song2, it.current());

        ip.reset(it);
        Song resetSong = ip.play();
        songEquals(song2, resetSong);
    }

    @Test
    public void testRemove() {
        Song song1 = createSong1();
        Song song2 = createSong2();
        Song song3 = createSong3();

        InfinitePlaylist ip = new InfinitePlaylist("test multi add song");

        ip.add(song1);
        ip.add(song2);
        ip.add(song3);

        // order should be: song1, song3, song2
        SongIterator it = ip.iterator();
        songEquals(song1, it.current());

        ip.remove(it);
        Song song = ip.play();
        songEquals(song3, song);
    }

    @Test
    public void testRemoveSingle() {
        Song song1 = createSong1();
        Song song2 = createSong2();
        Song song3 = createSong3();

        InfinitePlaylist ip = new InfinitePlaylist("test multi add song");

        ip.add(song1);

        // order should be: song1, song3, song2
        SongIterator it = ip.iterator();
        songEquals(song1, it.current());

        ip.remove(it);
        Song song = ip.play();
        assertEquals(null, song);
    }
}
