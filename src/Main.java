import java.util.ArrayList;
import java.util.Scanner;

public class Main  extends display {

    public static void main(String[] argumnets) {
        ArrayList<data> data=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        String[] values={"1","sdfsd","Eswar","adarsh","azar","pallavi","laddu","karan"};

        for(int i=0;i<5;i++){
            System.out.println("Enter usrname");
            String username=input.next();
            System.out.println("Enter password");
            String password=input.next();
            data.add(new data(username, password));
        }
        for(int i=0;i<5;i++) {
            System.out.println(data.get(i).getUsername());
        }


    }
}