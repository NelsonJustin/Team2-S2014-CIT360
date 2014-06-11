import java.util.*;

public class Registration {


    ArrayList<UserBean> userList = new ArrayList<UserBean>();


    //Create new user and add to ArrayList
   
	public ArrayList<UserBean> addUser(Scanner f, Scanner l){


        for(int i = 0; i < 3; i++) {
            UserBean u = new UserBean();

            System.out.println("Please Enter Your First Name: ");
            u.setFirstName(f.nextLine());

            System.out.println("Please Enter Your Last Name: ");
            u.setLastName(l.nextLine());

            userList.add(i, u);
        }

        return userList;
    }

    //Display ArrayList
    public void displayUser(){
        for(int x = 0; x < 3; x++){

           System.out.println("Hello, " + userList.get(x).getFirstName() + " " + userList.get(x).getLastName()
           + ".\nThank you for registering!" + System.getProperty("line.separator"));

        }
}

}
