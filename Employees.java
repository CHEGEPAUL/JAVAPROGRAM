import java.util.ArrayList;
import java.util.Scanner;

public class Employees {
    String names,emailaddress,time;
    int salaries;
    float phonenumber;

    public Employees(String names, String emailaddress, String time,int salaries,int phonenumber) {
        this.names = names;
        this.emailaddress = emailaddress;
        this.time = time;
        this.salaries=salaries;
        this.phonenumber=phonenumber;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "names='" + names + '\'' +
                ", emailaddress='" + emailaddress + '\'' +
                ", time='" + time + '\'' +
                ", salaries=" + salaries +
                ", phonenumber=" + phonenumber +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employees>details;
        //Instantiating  the arraylist
        details= new ArrayList<>();

        //Lists using the constructor
        Employees no1= new Employees("Paul Chege ","144 MATATHIA","2.5 years",5000000,72897898);
        Employees no2= new Employees("Stella Gikonyo","144 Nairobi","5 years",200000,7808790);
        Employees no3= new Employees("Margraet Nyambura","14 Limuru","3 years",20000,78909890);
        Employees no4= new Employees("Marion Wanjiru","144 Naivasha","4 years",270000,7806802);
        Employees no5= new Employees("Sylvia Njoki","4 Kagwe","7 years",209000,07245536);
        Employees no6= new Employees("Stephani Njoki","27 Nakuru","8 years",205000,76975704);
        Employees no7= new Employees("Kimberly Njoki","138 Kahawa west","6 years",204000,7897772);
        Employees no8= new Employees("Chege Ndegwa","67 Nyahururu","9 years",78000,79773172);
        Employees no9= new Employees("Davine Mwithiga ","34 OTC","6.7 years",36000,78785672);
        Employees no10= new Employees("Zachariah Njoki","789 Nyamakima","21 years",890000,7976372);

        //Adding the  Employees number
        details.add(no1);
        details.add(no2);
        details.add(no3);
        details.add(no4);
        details.add(no5);
        details.add(no6);
        details.add(no7);
        details.add(no8);
        details.add(no9);
        details.add(no10);

        //Printing out the array class
        System.out.println(details.toString());

    }
}

