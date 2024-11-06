
import  java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> book = new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false, 3));




        int check = 1;
        while(check == 1){

            System.out.print("Enter 1 to book or 2 to exit : ");
            Scanner sc = new Scanner(System.in);
            check= sc.nextInt();
            if(check == 1)
            {
                Booking bookings = new Booking();
                if(bookings.IsAvailable(book,buses))
                {
                    book.add(bookings);
                    System.out.println("Your Ticket is confirmed !!");

                }
                else{
                    System.out.print("sorry !!");
                }
            }
        }
    }
}