package Project;

import java.util.Scanner;

public class Librarymanagement {
	public static void main(String[] args) {
		Library library = new Library();
		Scanner sc = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\n1. Add Book");
		            System.out.println("2. Register Student");
		            System.out.println("3. Show Books");
		            System.out.println("4. Issue Book");
		            System.out.println("5. Return Book");
		            System.out.println("0. Exit");
		            System.out.print("Enter choice: ");
		            choice = sc.nextInt();
		            sc.nextLine();  

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Book ID: ");
		                    String id = sc.nextLine();
		                    System.out.print("Enter Title: ");
		                    String title = sc.nextLine();
		                    System.out.print("Enter Author: ");
		                    String author = sc.nextLine();
		                    Books book = new Books(id, title, author);
		                    library.addBook(book);
		                    break;

		                case 2:
		                    System.out.print("Enter Roll No: ");
		                    String roll = sc.nextLine();
		                    System.out.print("Enter Name: ");
		                    String name = sc.nextLine();
		                    Student student = new Student(roll, name);
		                    library.registerStudent(student);
		                    break;

		                case 3:
		                    library.showallbooks();
		                    break;

		                case 4:
		                    System.out.print("Enter Book ID to issue: ");
		                    String bid = sc.nextLine();
		                    System.out.print("Enter Student Roll No: ");
		                    String sid = sc.nextLine();
		                    library.issueBook(bid, sid);
		                    break;

		                case 5:
		                    System.out.print("Enter Book ID to return: ");
		                    String rid = sc.nextLine();
		                    library.returnBook(rid);
		                    break;

		                case 0:
		                    System.out.println("Exiting...");
		                    break;

		                default:
		                    System.out.println("Invalid choice.");
		            }

		        } while (choice != 0);

		        sc.close();
		    }
		}