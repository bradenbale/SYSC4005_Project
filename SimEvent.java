import java.util.*;
public class SimEvent implements Comparable<SimEvent>{

    public static enum eventType {I1_process,I2_process,I3_process, WS1_process, WS2_process, WS3_process};    // ALQ=Arrival at Loader Queue, EL=End of Loading, EW=End of Weighing, ES=End of Simulation
    private eventType eType;        // Type of the event
    private Integer eTime;          // Event Time
    private inspector InspectorID;      // Which Inspector is this event for.
    private workstation WorkstationID;  // Which Workstation is this event for

    public SimEvent(eventType eType, int eTime, inspector InspectorID, workstation WorkstationID) {
        this.eType = eType;      // The Event Type for Simulation Object
        this.eTime = eTime;      // The Event Time for Simulation Object
        this.InspectorID = InspectorID;     // The specified Inspector for Simulator Object
        this.WorkstationID = WorkstationID; // The specified Workstation for Simulator Object
    }

    @Override
    public int compareTo(SimEvent ev) {
        return this.geteTime().compareTo(ev.geteTime());  // Overwritten compareTo to return 0 if Sim Time and Event time are equal
    }

    public eventType geteType() {               // Return the Event Type
        return eType;                           
    }

    public void seteType(eventType eType) {     // Sets the Event type
        this.eType = eType;
    }

    public Integer geteTime() {                 // Returns the Event Time
        return eTime;
    }

    public void seteTime(int eTime) {           // Sets the Event Time
        this.eTime = eTime;
    }

    public inspector getInspectorID() {         // Returns the InspectorID for the given Simulation Event
        return InspectorID;
    }

    public void setInspectorID(inspector InspectorID) {     // Sets the InspectorID for the given Simulation Event
        this.InspectorID = InspectorID;
    }

    public workstation getWorkstationID() {     // Returns the WorkstationID for the given Simulation Event
        return WorkstationID;
    }

    public void setWorkstationID(workstation WorkstationID) {   // Sets the WorkstationID for the given Simulation Event
        this.WorkstationID = WorkstationID;
    }
}
