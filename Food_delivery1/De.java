import java.util.ArrayList;

public class De {
    private int did;
    static int dc = 1;
    private int orders;
    ArrayList<Character> src = new ArrayList<>();
    ArrayList<Character> des = new ArrayList<>();
    ArrayList<Double> ptime = new ArrayList<>();
    ArrayList<Double> dtime = new ArrayList<>();
    private double wtime;
    private double ftime;
    private int charge;
    private char curr_loc;

    public De() {
        this.did = dc++;
    }

    // setter
    public void setId(int id) {
        did = id;
    }

    public void setWtime(double wt) {
        wtime = wt;
    }

    public void setFtime(double ft) {
        ftime = ft;
    }

    public void setCharge(int c) {
        charge = c;
    }

    public void setOrders(int o) {
        orders = o;
        if (orders == 2) {
            orders = 0;
            wtime = 0.0;
        }
    }

    public void setCurr_loc(char loc) {
        curr_loc = loc;
    }

    // getter
    public int getId() {
        return did;
    }

    public double getWtime() {
        return wtime;
    }

    public double getFtime() {
        return ftime;
    }

    public int getCharge() {
        return charge;
    }

    public int getOrders() {
        return orders;
    }

    public char getCurr_loc() {
        return curr_loc;
    }

}