public class SongNode {
    public Song song;
    public SongNode nextNode;
    public SongNode previousNode;

    public SongNode(Song song, SongNode next, SongNode previous) {
        this.song = song;
        this.nextNode = next;
        this.previousNode = previous;
    }

    public String toString() {
        return "Node(" + hashCode() + ", " + song +
            ", next=" + nextNode.hashCode() +
            ", previous=" + previousNode.hashCode() + ")";
    }
}
