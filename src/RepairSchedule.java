import java.util.ArrayList;

public class RepairSchedule {
    /** Each element represents a repair by an individual mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object as described in part (a).
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        numberOfMechanics = n;
        schedule = new ArrayList<CarRepair>();
    }

    public ArrayList<CarRepair> getSchedule() {
        return schedule;
    }

    /** Attempts to schedule a repair by a given mechanic in a given bay as described in part (b).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        boolean a = true;
        boolean b = true;
        for (int i = 0; i < schedule.size(); i++){
            if (schedule.get(i) == m){
                a = false;
            }
            if (schedule.get(i) == b){
                b = false;
            }
        }
        if (a == true && b == true){
            schedule.add(m);
            schedule.add(b);
            return true;
        }
        return false;
    }

    /** Returns an ArrayList containing the mechanic identifiers of all available mechanics,
     * as described in part (c).
     */
    public ArrayList<Integer> availableMechanics() {
        /* to be implemented in part (c) */
    }

    /** Removes an element from schedule when a repair is complete.
     THIS METHOD HAS BEEN ADDED FOR ILLUSTRATIVE PURPOSES ONLY,
     AS DESCRIBED IN PART B; you do NOT need to call this
     method as part of your solution to part B
     */
    public void carOut(int b) {
        for (int i = 0; i < schedule.size(); i++) {
            CarRepair carAtIdx = schedule.get(i);
            if (carAtIdx.getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
}