package week1.homeassignments;

public class Library {
    public void addBook()
    {
        System.err.println("Book Added succesfully");
    }
    public void issueBook(){
        System.out.println("Book Isssued Succesfully");
    }
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook();
        lib.issueBook();
    }

}
