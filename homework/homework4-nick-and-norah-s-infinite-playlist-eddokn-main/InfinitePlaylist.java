public class InfinitePlaylist {
    private String title;
    private int size;
    public SongNode currentNode;

    public InfinitePlaylist(String title) {
      this.title = title;
      this.head = null;
      this.tail = null;
      this.size = 0;
    }

    public String getTitle() {
      return this.title;
    }

    public int size() {
      return this.size;
    }

    public Song play() {
      currentNode = currentNode.setNext();
      return currentNode.setPrevious();
    }

    public void add(Song song) {
      currentNode.setNext(song);
      this.size +=1;
    }

    public void reset(SongIterator it) {
      // necessary step: cast songiterator as a songiteratorimpl
      SongIteratorImpl itimpl = (SongIteratorImpl) it;
      return itimpl;
    }

    public SongIterator iterator() {
      SongIterator it = currentNode;
      return it;
    }

    public void insert(SongIterator it) {
      SongIteratorImpl itimpl = (SongIteratorImpl) it;

    }

    public void remove(SongIterator it) {
      // necessary step: cast songiterator as a songiteratorimpl
      SongIteratorImpl itimpl = (SongIteratorImpl) it;
      //
    }
}
