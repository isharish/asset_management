package model;

import java.util.List;

public class Vendor {
    private int vendorId;
    List<Integer> software;
    private int spent;
    private int install;
    public Vendor(int v,List<Integer> l){
        this.vendorId=v;
        this.software=l;
    }
    public int getVendorId(){
        return this.vendorId;
    }
    
    protected int getSpent(){
        return this.spent;
    }
    protected int getInstall(){
        return this.install;
    }
}
