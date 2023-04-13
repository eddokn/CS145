public class Book {

  // attributes here
  private String title = new String();
  private String author = new String();
  private String checkedOutBy = new String();
  private int numCheckOuts = new int();


  public Book(String title, String author){
    this.title = title;
    this.author = author;
    checkedOutBy = null;
  }

  public void checkOut(String userName) {
    if(checkedOutBy = null){
      checkedOutBy = userName;
      numCheckOuts ++;
    }
  }

  public void checkIn() {
    if(checkedOutBy != null){
      checkedOutBy = null;
    }
  }

  public boolean isCheckedOut(){
    if(checkedOutBy = null){
      return true;
    }
    else{
      return false;
    }
  }
}
