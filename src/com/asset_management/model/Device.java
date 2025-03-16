package model;

import java.util.List;

import service.Data;

public class Device {
    int deviceId;
    public List<Software> sftList;
    public Device(int d,List<Software> l){
        this.deviceId=d;
        this.sftList=l;
    }
    public int getDeviceid() {
        return this.deviceId;
    }
}
