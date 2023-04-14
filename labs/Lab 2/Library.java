public class Library {

  // attributes here
  private String name = new String();
  private int numBooks = 0;
  private int numGames = 0;
  private Book[] books;
  private Game[] games;

  public Library(String name, int capacity) {
    this.name = name;
    books = new Book[capacity];
  }

  public boolean addBook(Book book) {
    if(numBooks != books.length){
      books[numBooks] = book;
      numBooks++;
      return true;
    }
    return false;
  }

  public void removeBook(String title) {
    for(int i=0;i<books.length;i++){
      if(books[i].title.equals(title)){
        books[i] = null;
      }
    }
  }

  public Book getBook(String title) {
    String booktitle = null;
    for(int i=0;i<books.length;i++){
     if(books[i] != null){
      booktitle = books[i].title;
      if(booktitle.equals(title)){
        return books[i];
      }
   }
  }
  return null;
}

public boolean isAvailable(String title) {
  Book book = getBook(title);
  if(book.isCheckedOut()){
    return false;
  }
  else{
    return true;
  }
}

  public boolean checkOutBook(String title, String userName) {
    Book book = getBook(title);
    if(isAvailable(title)){
      book.checkOut(userName);
      return true;
    }
    else{
      return false;
    }
  }

  public boolean checkInBook(String title) {
    Book book = getBook(title);
    if(isAvailable(title) == false){
      book.checkIn();
      return true;
    }
    else{
      return false;
    }
  }

  public Book mostPopularBook(){
    Book most_popular = books[0];
    for(int x=0;x<books.length; x++){
      if(books[x] != null){
      if(books[x].numCheckOuts>most_popular.numCheckOuts){
         most_popular = books[x];
      }
    }
  }
    return most_popular;
  }
  public boolean addGame(Game game) {
    if(numGames != games.length){
      games[numGames] = game;
      numGames++;
      return true;
    }
    return false;
  }

  public void removeGame(String title) {
    for(int i=0;i<games.length;i++){
      if(games[i].title.equals(title)){
        games[i] = null;
      }
    }
  }

  public Game getGame(String title) {
    String gametitle = null;
    for(int i=0;i<games.length;i++){
     if(games[i] != null){
      gametitle = games[i].title;
      if(gametitle.equals(title)){
        return games[i];
      }
   }
  }
  return null;
  }

  public boolean isGameAvailable(String title) {
  Game game = getGame(title);
  if(game.isCheckedOut()){
    return false;
  }
  else{
    return true;
  }
  }

  public boolean checkOutGame(String title, String userName) {
    Game game = getGame(title);
    if(isGameAvailable(title)){
      game.checkOut(userName);
      return true;
    }
    else{
      return false;
    }
  }

  public boolean checkInGame(String title) {
    Game game = getGame(title);
    if(isGameAvailable(title) == false){
      game.checkIn();
      return true;
    }
    else{
      return false;
    }
  }

  public Game mostPopularGame(){
    Game most_popular = games[0];
    for(int x=0;x<games.length; x++){
      if(games[x] != null){
      if(games[x].numCheckOuts>most_popular.numCheckOuts){
         most_popular = games[x];
      }
    }
  }
    return most_popular;
  }
  public static void main(String[] args){
    Library BPL = new Library("Bellingham Public Library", 3);

    Book mockingbird = new Book("To Kill a Mockingbird", "Harper Lee");
    Book n84 = new Book("1984", "George Orwell");
    Book gatsby = new Book("The Great Gatsby", "F. Scott Fitzgerald");
    Book b4 = new Book("b4", "b4");

    BPL.addBook(gatsby);
    BPL.addBook(mockingbird);
    BPL.addBook(n84);
    if(BPL.addBook(b4)){ System.out.println("Fail: max capacity check"); }
    BPL.checkOutBook("The Great Gatsby", "vimcent101");
    if(BPL.checkOutBook("The Great Gatsby", "fern92")){ System.out.println("Fail: tried to check out a book already checked out"); }
    if(!BPL.checkInBook("The Great Gatsby")){ System.out.println("Fail: checkin"); }
    if(!BPL.checkOutBook("The Great Gatsby", "greenday707")){ System.out.println("Fail: book was checked in but couldn't check it out again afterwards"); }

    BPL.checkOutBook("To Kill a Mockingbird", "jensenq");
    BPL.checkOutBook("1984", "jensenq");

    Book most_popular = BPL.mostPopularBook();
    if(most_popular != gatsby){ System.out.println("Fail: most popular book should be gatsby. check that you're properly returning the Book object, and calculating most popular correctly."); }

    // if you run Library and it prints nothing out, you passed all tests
    // in future labs, you will be expected to start writing your own test cases to ensure your program works as intended
  }

}
