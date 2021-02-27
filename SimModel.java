import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class SimModel {

    //Sim Model Variables
    public static double seconds, minutes, hours, currentDay; // double to track decimals
    public static double I1BlockedTime, I2BlockedTime, IdleWS1, IdleWS2, IdleWS3; // double to track decimals
    private static Queue<SimEvent> FEL; //Future event list
    public static Queue<inspector> IQ; // the inspector queue when a buffer is full
    public static Queue<workstation> WQ; // the inspector queue when a buffer is full

    // Inputs
    public static double[] servinsp1, servinsp22, servinsp23, ws1, ws2, ws3; //inspection times and workstation times
    public static int servinsp1_index, servinsp22_index, servinsp23_index, ws1_index, ws2_index, ws3_index; // to keep track of the element of interest
    // Metrics, Stats, and Counters
    private static double I1BT, I2BT; // double to track decimals


    private static double[] readFile(String fileName) {
        // reads from given data files and returns an array
        double[] fileContents = new double[300]; //Double array to store values read from file
        int i = 0;
        int data;
        try{
            File myFile = new File(fileName);
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                fileContents[i] = Double.parseDouble(myReader.nextLine());
                i+=1;
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        return fileContents;

    }

    private static void initialization(){
        // initializes the values for the variables declared, creates instances of inspector and workstation
    }

    public static void main(String[] args) {
        // Initializes the FEL and queues. Calls the various functions defined
       
    }

    private static void GenerateReport(){
        // For output
    }

    private static void checkMinutes(double seconds) {
        //updates the amount of minutes passed
        if (seconds == 60){
            minutes += 1;
            seconds = 0;
        }
    }

    private static void checkHour(double minutes) {
        //updates the amount of hours passed
        if (minutes == 60){
            hours += 1;
            minutes = 0;
        }
    }

    private static void checkDay(double hours) {
        //Updates the amount of days passed
        if (hours == 24){
            currentDay += 1;
            hours = 0;
        }
    }

    private static void ProcessInspector(SimEvent evt){
    //Inspector process
    }

    private static void ProcessWorkstation(SimEvent evt){
    //Workstation process
    }

    private static void ScheduleEventInspector(int index, double[] process_time_array, SimEvent.eventType eType, inspector ins){
    //Event for inspector
    }

    private static void ScheduleEventWorkstation(int index, double[] process_time_array, SimEvent.eventType eType, workstation ws){
    // Event for workstation
    }

    private static void ProcessSimEvent(SimEvent nxtEvent){
        //Process the simulation event
    }

}
