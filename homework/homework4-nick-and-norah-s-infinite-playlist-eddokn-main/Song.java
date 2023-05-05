
public class Song{
  //attr
  protected String title = new String();
  protected String[] artists;
  protected int durationSeconds = 0;

  //blank constructor
  public Song(){
    this.title = null;
    this.artists = null;
    this.durationSeconds = 0;
  }
  //constructor for Songs
  public Song(String title, String[] artists, int durationSeconds){
    this.title = title;
    this.artists = artists;
    this.durationSeconds = durationSeconds;
  }
  //getters and setters
  public String getTitle(){
    return this.title;
  }
  public String[] getArtists(){
    return this.artists;
  }
  public int getDurationSeconds(){
    return this.durationSeconds;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public void setArtists(String[] artists){
    this.artists = artists;
  }
  public void setDurationSeconds(int durationSeconds){
    this.durationSeconds = durationSeconds;
  }
}
