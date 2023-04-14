public class Game {

  // attributes here
   String title = new String();
   String console = new String();
   String checkedOutBy = new String();
   int numCheckOuts = 0;


  public Game(String title, String console){
    this.title = title;
    this.console = console;
    this.checkedOutBy = null;
  }

  public void checkOut(String userName) {
    if(checkedOutBy == null){
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
    if(checkedOutBy == null){
      return false;
    }
    else{
      return true;
    }
  }
}
