/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author osvaldo
 */
public class cliente {
String clientNo;
String fname;
String lname;
String telNo;
String prefType;
int maxRent;

    public cliente(String clientNo, String fname, String lname, String telNo, String prefType, int maxRent) {
        this.clientNo = clientNo;
        this.fname = fname;
        this.lname = lname;
        this.telNo = telNo;
        this.prefType = prefType;
        this.maxRent = maxRent;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getPrefType() {
        return prefType;
    }

    public void setPrefType(String prefType) {
        this.prefType = prefType;
    }

    public int getMaxRent() {
        return maxRent;
    }

    public void setMaxRent(int maxRent) {
        this.maxRent = maxRent;
    }


    
    
}
