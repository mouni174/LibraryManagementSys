package Project;

import java.util.ArrayList;

public class Library {
	ArrayList<Books> books;
   ArrayList<Student> students;
    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public void  addBook(Books book) {
    	books.add(book);
    	System.out.println("Book added: " + book);
    }
    public void  registerStudent(Student student) {
    	students.add(student);
    	System.out.println("Student registered: " + student.getName());
    }
    public void showallbooks() {
    	System.out.println("\nAvailable Books:");
        for (Books b : books) {
            System.out.println(b);
        }
    }
        public void issueBook(String bookId, String rollNo) {
            Books bookToIssue = null;
            for (Books b : books) {
            	  if (b.getId().equals(String.valueOf(bookId))) {
                    bookToIssue = b;
                    break;
                }
            }

            if (bookToIssue == null) {
                System.out.println("Book not found.");
                return;
            }

            if (bookToIssue.isIssued()) {
                System.out.println("Book already issued.");
            } else {
                bookToIssue.issue();
                System.out.println("Book issued to student roll no: " + rollNo);
            }
        }

        public void returnBook(String rid) {
            for (Books b : books) {
                if (b.getId().equals(String.valueOf(rid))) {
                    if (b.isIssued()) {
                        b.returnBook();
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Book was not issued.");
                    }
                    return;
                }
            }
            System.out.println("Book not found.");
        }
		
			
		}
    