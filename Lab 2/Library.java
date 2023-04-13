public class Library {

  // attributes here
  String name = new String();
  String[] books = new String[];
  int numBooks = new int();


  public Library(String name, int capacity) {
    this.name = name;
    String[] books = new String[capacity];
    this.capacity = capacity;
  }

  public boolean addBook(Book book) {
    if(numBooks != capacity){
      books.add(book);
      return true;
    }
    System.out.println("The library is full!")
    return false;
  }

  public void removeBook(String title) {
    for(int i=0;i<books.length();i++){
      if(books[i] = title){
        books[i] = null;
      }
    }
  }

  public Book getBook(String title) {
  }

  public boolean checkOutBook(String title, String userName) {
  }

  public boolean checkInBook(String title) {
  }

  public boolean isAvailable(String title) {
  }

  public Book mostPopularBook(){
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
