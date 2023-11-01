package Library;
import java.util.Scanner;
import java.util.ArrayList;


public class libraryDriver {

    public static ArrayList<Student> studentList = new ArrayList<Student>();
    public static ArrayList<Faculty> FacultyList = new ArrayList<Faculty>();
    public static ArrayList<Book> bookList = new ArrayList<Book>();
    public static ArrayList<Book> borrowList = new ArrayList<Book>();

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        boolean reapeat = true;
        while (reapeat) {
            System.out.println("------------------------------------------------------");
            System.out.println("-------WELCOME TO OUR LIBRARY MANAGEMENT SYSTEM-------");
            System.out.println("------------------------------------------------------");
            System.out.println("----------Please choose one of below Options----------");
            System.out.println("1. Add Student");
            System.out.println("2. Add Faculty");
            System.out.println("3. Add Book");
            System.out.println("4. Display All Students");
            System.out.println("5. Display All Faculty");
            System.out.println("6. Display All Books");
            System.out.println("7. Search Student");
            System.out.println("8. Search Faculty");
            System.out.println("9. Search Book");
            System.out.println("10. Borow Book");
            System.out.println("11. Display All Borow Book");
            System.out.println("12. Return Book");
            System.out.println("13. Exit");
            System.out.print("your choice: ");
            int option = Sc.nextInt();
            System.out.println("------------------------------------------------------");
            switch (option) {
                case 1:
                    System.out.println("Enter Student Id");
                     int id = Sc.nextInt();
                    boolean chekId = checkStudentId(id);
                    if (chekId) {
                        System.out.println("StudentId Already Exist");
                        break;
                    }
                    Sc.nextLine();
                    System.out.println("Enter Student FirstName");
                    String surname = Sc.nextLine();
                    System.out.println("Enter Student lastName");
                    String lastName = Sc.nextLine();
                    System.out.println("Enter Student Age");
                    int age = Sc.nextInt();
                    Student student = new Student(id, surname, lastName, age);
                    studentList.add(student);
                    break;
                case 2:
                    System.out.println("Enter Faculty Id");
                    int id1 = Sc.nextInt();
                    boolean chekId1 = checkFacultyId(id1);
                    if (chekId1) {
                        System.out.println("FacultyId Already Exist");
                        break;
                    }
                    Sc.nextLine();
                    System.out.println("Enter Faculty FirstName");
                    String surname1 = Sc.nextLine();
                    System.out.println("Enter Faculty lastName");
                    String lastName1 = Sc.nextLine();
                    System.out.println("Enter Faculty Age");
                    int age1 = Sc.nextInt();
                    Faculty Faculty = new Faculty(id1, surname1, lastName1, age1);
                    FacultyList.add(Faculty);
                    break;
                case 3:
                    System.out.println("Enter Book Id :");
                    int bookId = Sc.nextInt();
                    boolean chekBookId = checkBookId(bookId);
                    if (chekBookId) {
                        System.out.println("Book Id Already Exist");
                        break;
                    }
                    Sc.nextLine();
                    System.out.println("Enter Book tittle");
                    String tittle = Sc.nextLine();
                    System.out.println("Enter author FirstName");
                    String authorSurName = Sc.nextLine();
                    System.out.println("Enter author lastName");
                    String authorName = Sc.nextLine();
                    System.out.println("Enter Book Purchase Date");
                    String purchaseDate = Sc.nextLine();
                    System.out.println("Enter Book Availability :");
                    String status = Sc.nextLine();
                    Book b = new Book(bookId, tittle, authorSurName, authorName, purchaseDate, status) {
                    }; // to implement all abrstract method
                    bookList.add(b);
                    break;
                case 4:
                    displayAllStudent();
                    break;
                case 5:
                    displayAllFaculty();
                    break;
                case 6:
                    displayAllBook();
                    break;
                case 7:
                    System.out.println("Please Enter student Id, you want to Search");
                    int searchStudentId = Sc.nextInt();
                    searchStudent(searchStudentId);
                    break;
                case 8:
                    System.out.println("Please Enter Faculty Id, you want to Search");
                    int searchFacultyId = Sc.nextInt();
                    searchFaculty(searchFacultyId);
                    break;
                case 9:
                    System.out.println("Please Enter Book Id, you want to Search");
                    int searchBookId = Sc.nextInt();
                    searchBook(searchBookId);
                    break;
                case 10:
                    borrowBook();
                    break;
                case 11:
                    DisplayborrowBook();
                    break;
                case 12:
                    returnBook();
                    break;
                case 13:
                    reapeat = false;
                    break;
            }
        }
        Sc.close();
    }
    // Student...

    public static boolean checkStudentId(int id) {
        for (Student st : studentList) {
            if (st.getStudentId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void displayAllStudent() {
        for (Student st : studentList) {
            System.out.println("\n Student Id: " + st.getStudentId() + "\n FirstName: " + st.getFirstName() + "\n lastName: " + st.getLastname()
                    + "\n Age: " + st.getAge() + "\n");
        }
    }

    public static void searchStudent(int searchStudentId) {
        boolean search = true;
        for (Student st : studentList) {
            if (st.getStudentId() == searchStudentId) {
                System.out.println("\n Student Id: " + st.getStudentId() + "\n FirstName: " + st.getFirstName() + "\n lastName: " + st.getLastname()
                    + "\n Age: " + st.getAge() + "\n");
                search = false;
            }
        }
        if (search) {
            System.out.println(searchStudentId + " Not exist");
        }
    }

    // Faculty...

    public static boolean checkFacultyId(int id) {
        for (Faculty ft : FacultyList) {
            if (ft.getFacultyId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void displayAllFaculty() {
        for (Faculty ft : FacultyList) {
            System.out.println("\n Faculty Id: " + ft.getFacultyId() + "\n FirstName: " + ft.getSurname() + "\n lastName: " + ft.getLastname()
                    + "\n Age: " + ft.getAge() + "\n");
        }
    }

   public static void searchFaculty(int searchFacultyId) {
        boolean search = true;
        for (Faculty ft : FacultyList) {
            if (ft.getFacultyId() == searchFacultyId) {
                System.out.println("\n Faculty Id: " + ft.getFacultyId() + "\n FirstName: " + ft.getSurname() + "\n lastName: " + ft.getLastname()
                    + "\n Age: " + ft.getAge()  + "\n");
                search = false;
            }
        }
        if (search) {
            System.out.println(searchFacultyId + " Not exist");
        }
    }
    
    // book....

    public static boolean checkBookId(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                return true;
            }
        }
        return false;
    }

    public static void searchBook(int searchBookId) {
        boolean search = true;
        for (Book book : bookList) {
            if (book.getBookId() == searchBookId) {
                System.out.println("\n Book Id: " + book.getBookId() + "\n Tittle : " + book.getTittle() + "\n Author FirstName: " + book.getAuthorFirstName()
                    + "\n Auhtor Surname: " + book.getAuthorSurName() + "\n Purchase Date: " + book.getPurchaseDate() + "\n staus: " + book.getStatus() + "\n");
                search = false;
            }
        }
        if (search) {
            System.out.println(searchBookId + " Not exist");
        }
    }

    public static void displayAllBook() {
        for (Book book : bookList) {
            System.out.println("\n Book Id: " + book.getBookId() + "\n Tittle : " + book.getTittle() + "\n Author FirstName: " + book.getAuthorFirstName()
                    + "\n Auhtor Surname: " + book.getAuthorSurName() + "\n Purchase Date: " + book.getPurchaseDate() + "\n staus: " + book.getStatus() + "\n");
        }
    }

    public static void borrowBook() {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.println("----List of all Available book as Below----");
            for (Book book : bookList) {
                if (book.getStatus().equalsIgnoreCase("AVAILABLE")) {
                    System.out.println("\n Book Id: " + book.getBookId() + "\n Tittle : " + book.getTittle() + "\n Author FirstName: " + book.getAuthorFirstName()
                    + "\n Auhtor Surname: " + book.getAuthorSurName() + "\n Purchase Date: " + book.getPurchaseDate() + "\n staus: " + book.getStatus() + "\n");
                }
            }
            System.out.println("---------------------");
            System.out.println("Please enter Student/Faculty Id:");
            int id = Sc.nextInt();
            System.out.println("Please enter Book Id:");
            int bookId = Sc.nextInt();
            for (Book book : bookList) {
                if (book.getBookId() == bookId) {
                    borrowList.add(book);
                    book.setStatus("Not AVAILABLE");
                }
            }
        }
    }

    public static void returnBook() {
        try (Scanner Sc = new Scanner(System.in)) {
            try {
                System.out.println("---------------------");
                System.out.println("Please enter Student/Faculty Id:");
                int id = Sc.nextInt();
                System.out.println("Please enter Book Id:");
                int bookId = Sc.nextInt();
                for (int i = 0; i < borrowList.size(); i++) {
                    if (borrowList.get(i).getBookId() == bookId) {

                        borrowList.get(i).setStatus("AVAILABLE");
                        borrowList.remove(i);//  remove borrow book from borrowlist 
                        break;
                    }
                }

            } catch (NumberFormatException e) {
                System.err.println("error. " + e);
            }
        }
        
    }

    public static void DisplayborrowBook() {
        for (Book book : borrowList) {
            System.out.println("\n Book Id: " + book.getBookId() + "\n Tittle : " + book.getTittle() + "\n Author FirstName: " + book.getAuthorFirstName()
                    + "\n Auhtor Surname: " + book.getAuthorSurName() + "\n Purchase Date: " + book.getPurchaseDate() + "\n staus: " + book.getStatus() + "n");
        }
    }    
} 

class Student {

    int id;
    String firstName;
    String lastname;
    int age;
    public Student (int id, String firstName, String lastname, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
    }

    public int getStudentId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    
}

class Faculty {

    int id1;
    String surname1;
    String lastname1;
    int age1;
    public Faculty (int id1, String surname1, String lastname1, int age1) {
        this.id1 = id1;
        this.surname1 = surname1;
        this.lastname1 = lastname1;
        this.age1 = age1;
        
    }
    public int getFacultyId() {
        return id1;
    }
    public String getSurname() {
        return surname1;
    }
    public String getLastname() {
        return lastname1;
    }
    public int getAge() {
        return age1;
    }
}

class Book {

    int bookId;
    String tittle;       
    String authorSurName;
    String authorFirstName;
    String purchaseDate;
    String status;        
    public Book (int bookId, String tittle, String authorSurName, String authorFirstName, String purchaseDate, String status) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.authorSurName = authorSurName;
        this.authorFirstName = authorFirstName;
        this.purchaseDate = purchaseDate;
        this.status = status;
        
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getAuthorSurName() {
        return authorSurName;
    }
    public void setAuthorSurName(String authorSurName) {
        this.authorSurName = authorSurName;
    }
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}