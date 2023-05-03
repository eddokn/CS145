     public class InfinitePlaylist {
  //attributes
    private String title;
    private int size;
    public SongNode currentNode;

    public InfinitePlaylist(String title) {
      this.title = title;
      this.size = 0;
      this.currentNode = null;
    }

    public String getTitle() {
      return this.title;
    }

    public int size() {
      return this.size;
    }

    public Song play() {
      Song song = this.currentNode.song;
      this.currentNode = this.currentNode.nextNode;
      return song;
    }

    public void add(Song song) {
      SongNode newSong = new SongNode(song, this.currentNode.nextNode, this.currentNode.previousNode);
      if(this.currentNode.song==null){
        this.currentNode.song = song;
        this.currentNode.nextNode = null;
        this.currentNode.nextNode = null;
      } else{
        this.currentNode.previousNode = this.currentNode;
        this.currentNode = this.currentNode.nextNode;
        this.currentNode.song = song;
      }
      this.size +=1;
    }

    public void reset(SongIterator it) {
      // necessary step: cast songiterator as a songiteratorimpl
      SongIteratorImpl itimpl = (SongIteratorImpl) it;
    }

    public SongIterator iterator() {
      SongIterator it = (SongIterator) currentNode;
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
