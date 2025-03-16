package model;

import java.sql.Date;

import service.Data;
public class Software {
    static int cnt=1;
    private int softwareId;
    private String expiryDate;
    private int cost;
    private int installs;
    private int vendorId;

    public Software(String exp,int c,int vId){
        softwareId=cnt++;
        this.expiryDate=exp;
        this.cost=c;
        this.vendorId=vId;

    }

    public int getSoftwareId() {
        return this.softwareId;
    }
    public int getCost(){
        return this.cost;
    }

    public int getInstalls() {
        return this.installs;
    }

    public void setInstalls(int t) {
       this.installs=t;
    }

    

    
}
