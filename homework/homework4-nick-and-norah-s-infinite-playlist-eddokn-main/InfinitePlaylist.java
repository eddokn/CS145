     public class InfinitePlaylist {
  //attributes
    private String title;
    private int size;
    public SongNode currentNode;

    public InfinitePlaylist(String title) {
      this.title = title;
      this.size = 0;
      this.currentNode = new SongNode(null,null,null);
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
      if(this.currentNode.song == null){
        this.currentNode.song = song;
        this.currentNode.nextNode = this.currentNode;
        this.currentNode.previousNode = this.currentNode;
      } else{
        SongNode songNode = new SongNode(song, this.currentNode.nextNode, this.currentNode);
        this.currentNode.nextNode.previousNode = songNode;
        this.currentNode.nextNode = songNode;
      }
      this.size +=1;
    }

    public void reset(SongIterator it) {
      // necessary step: cast songiterator as a songiteratorimpl
      SongIteratorImpl itimpl = (SongIteratorImpl) it;
      this.currentNode = itimpl.currentNode;
    }

    public SongIterator iterator() {
      SongIteratorImpl it = new SongIteratorImpl(this.currentNode);
      return (SongIterator) it;
    }

    public void insert(SongIterator it) {
    }

    public void remove(SongIterator it) {
      // necessary step: cast songiterator as a songiteratorimpl
      SongIteratorImpl itimpl = (SongIteratorImpl) it;
      if(this.currentNode == this.currentNode.nextNode){
        this.currentNode.song = null;
      }
      if(this.currentNode==itimpl.currentNode){
        this.currentNode = this.currentNode.nextNode;
      }
      SongNode deletenote = itimpl.currentNode;
      deletenote.previousNode.nextNode = deletenote.nextNode;
      deletenote.nextNode.previousNode = deletenote.previousNode;
      itimpl.currentNode = deletenote.nextNode;
    }
}
