/**
 * The interface exports three methods for iterating through an
 * infinite playlist.
 */
public interface SongIterator {
    public Song current();
    public void next();
    public void previous();
}
