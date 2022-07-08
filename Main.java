
import java.util.*;
import java.text.SimpleDateFormat;


public class Main { //declare public class
    public static void main(String[] args) {
      System.out.println("Welcome to the appointment scheduler"); // welcome user in console
      Calendar c = Calendar.getInstance();
      System.out.println("The Current Date is:" + c.getTime()); //print current date 


  //create an array of 40 appointments
      Appointment[] appointments = new Appointment[40];
      Integer lengthArray = appointments.length;
      int arrayLength = appointments.length;
      System.out.println("There are currently "+ arrayLength+" available appointments");




      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      String firstName = null;
      boolean fnameComplete = false; //declare boolean fnameComplete as false
      while (fnameComplete == false) {
        System.out.println("Enter first name");

        if(myObj.hasNext("[A-Za-z]+")) {
          fnameComplete = true;
        }
        else {
          System.out.println("Please Enter a Valid Value");
          firstName = myObj.nextLine();
        }
      }





   // unused boolean for the purposes of a program loop getting user entries
    boolean scheduleComplete = false;


    //begin user entry 
      System.out.println("To begin, please choose the day you would like to schedule in the form MM/dd/yyyy: ");
      String date = myObj.nextLine();
      System.out.println("Choose a preferred time in the form 00M: For example; 4PM");
      String timeSlot = myObj.nextLine();  // Read user input into timeSlot

      System.out.println("Please give a short description of the appointment topic: ");
      String appointmentTopic = myObj.nextLine();  // Read user input into appointmentTopic
      System.out.println("Please Enter your last name: ");
      String lastName = myObj.nextLine();  // Read user input into appointmentTopic    
      String username = firstName + lastName; // concatenate firstName & lastName into username
      Appointment p1 = new Appointment(username, date, timeSlot, appointmentTopic); // Create appointment object
      appointments[0] = p1; //put appointment object into array
      System.out.println("Thank you, " + p1.getName() + ". Your Appointment on " + date + " has been created. ");
      myObj.close();
      // This is a test to see how to refer to functions within classes and print different datatypes
      System.out.println(appointments[0].username); //This is a test to see how to retrieve objects from an array. And also how to retrieve variables from within said object
      
      
      p1.sayHello(); //say hello to user
      p1.sayMessage();//say message reiterating appointment
    }
  }


    //function to convert user provided string containing date information to datedatatype
    //  public Date convertDate(String date) {
    //    SimpleDateFormat strFormat1 = new   SimpleDateFormat("MM/dd/yyyy");
    //    Date dateObj1 = strFormat1.parse(date, 0);
    //    return dateObj1;
 

     

    //function to retrieve the length of the appointment to then place the user's new appointment in the following spot in the array. 

    
    // public void getappointmentLength(Appointment[] appointments) {
    //   Integer arrayLength=appointments.length;  
    //   return arrayLength;
    // }



