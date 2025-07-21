package Project;

public class Student {
	  private String rollNo;
	    private String name;

	    public Student(String roll, String name) {
	        this.rollNo = roll;
	        this.name = name;
	    }

	    public String getRollNo() {
	        return rollNo;
	    }

	    public String getName() {
	        return name;
	    }
	}