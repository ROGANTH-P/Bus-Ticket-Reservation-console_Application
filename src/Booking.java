import java.util.*;
import java.text.*;
public class Booking {
    String passName;
    int busNo;
    Date date;

      Booking(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your Name : ");
          passName = sc.next();
          System.out.println("Enter your busNo : ");
          busNo = sc.nextInt();
          System.out.println("Enter your date : ");
          String gtdate = sc.next();
          SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
          try {
              date = dt.parse(gtdate);
          }
          catch (Exception e)
          {
            System.out.print("Invalid Date input ");
          }


      }

      public boolean IsAvailable(ArrayList<Booking> book , ArrayList<Bus> buses)
      {
          int space = 0;
          for(Bus b : buses)
          {
              if(b.getBusNo() == busNo && b.getCap() >=1)
              {
                  space = b.getCap();
              }
          }
          int booked = 0;
        for(Booking b :book)
        {
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }
        if(space > booked)
        {
            return true;
        }
        return false;1
      }
   // System.out.print("Enter your Name : ");

    void display()
    {
        System.out.println("Passenger name : "+ passName + "busNo : " + busNo + "Date : " + date);
    }


}
