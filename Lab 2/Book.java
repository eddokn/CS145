public class Book {

  // attributes here
  String title = new String();
  String author = new String();
  String checkedOutBy = new String();
  int numCheckOuts = new int();


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
