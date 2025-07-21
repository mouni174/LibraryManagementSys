package Project;

public class Books {
	 String id; 
		String name;
		 String Author;
		 boolean isIssued;
		 Books(String id,String name,String Author){
			 this.id = id;
			 this.name = name;
			 this.Author=Author;
}
public String getId() {
	return id;
}
public String getName() {
	return name;
}
public String Author() {
	return Author;
}
public boolean isIssued() {
	return isIssued;
}
public void issue() {
    isIssued = true;
}

public void returnBook() {
    isIssued = false;
}

public String toString() {
    return id + ": "  + Author + (isIssued ? " [Issued]" : " [Available]");
}
	
}

