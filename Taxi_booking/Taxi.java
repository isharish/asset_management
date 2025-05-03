import java.util.ArrayList;
import java.util.List;

public class Taxi implements Cloneable{
    static int Dcounter=1;
    private int picktime,droptime,cost;
    private char curr_loc;
    ArrayList<Character> pickList=new ArrayList<>(); 
    ArrayList<Character> dropList=new ArrayList<>(); 
    private int Did;
    public Taxi() {
        this.picktime=0;
        this.droptime=0;
        this.Did=Dcounter++;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
    public int getid(){
        return Did;
    }
    public char getCurr_loc(){
        return curr_loc;
    }
    public int getPicktime(){
        return picktime;
    }
    public int getDroptime(){
        return droptime;
    }
    public int getCost(){
        return cost;
    }
    public void setid(int id){
        Did=id;
    }
    public void setCurr_loc(char loc){
        curr_loc=loc;
    }
    public void setPicktime(int pic){
        picktime=pic;
    }
    public void setDroptime(int drp){
        droptime=drp;
    }
    public void setCost(int cos){
        cost=cos;
    }
}
