// Person class will hold person's name/username, & topic of appointment


public class Appointment {

    // Member data / attributes
    String username;
    String date;
    String timeSlot;
    String appointmentTopic;

    /* Constructor */
    public Appointment(String username, String date, String timeSlot, String appointmentTopic) {
        this.username = username;
        this.date = date;
        this.timeSlot = timeSlot;
        this.appointmentTopic = appointmentTopic;
        }






    public void sayHello() {
        System.out.println(username + ": Hello");
    }


    public void sayMessage() {
        System.out.println(username + "Made an appointment on: "+ date + " at: "+ timeSlot);
        System.out.println("The topic of the appointment: " + appointmentTopic);
    }


    // Four functions to return all data from a person object
    public String getName() {
        return username;
    }

    public String getDate() {
        return date;
    }
    public String gettimeSlot() {
        return timeSlot;

    }
    public String getappointmentTopic() {
        return appointmentTopic;
    }
}