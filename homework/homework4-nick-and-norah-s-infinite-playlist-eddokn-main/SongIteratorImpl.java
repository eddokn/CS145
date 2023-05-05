public class SongIteratorImpl implements SongIterator {
    public SongNode currentNode;

    public SongIteratorImpl(SongNode node) {
      this.currentNode = node;
    }

    public Song current() {
      return this.currentNode.song;
    }

    public void next() {
      this.currentNode = this.currentNode.nextNode;
    }

    public void previous() {
      this.currentNode = this.currentNode.previousNode;
    }
}
