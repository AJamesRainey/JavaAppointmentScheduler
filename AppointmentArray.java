public class AppointmentArray {
    public static void main(String args[]) {
        int Size = 40;
        Appointment array[] = new Appointment[Size];
        for(int i=0;i<Size;i++)
        {
//            array[i] = i+1;
            System.out.println("Appointment number "+i+" is as follows: "+array[i]);
        }

    }
}