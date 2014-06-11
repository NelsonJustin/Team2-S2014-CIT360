
import java.util.*;

public class Recipe {

	static Scanner first = new Scanner(System.in);
    static Scanner last = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 Registration r = new Registration();
	        r.addUser(first, last);
	        r.displayUser();

	}

}
