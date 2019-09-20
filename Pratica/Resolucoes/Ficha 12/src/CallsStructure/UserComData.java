/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CallsStructure;

/**
 *
 * @author morei
 */
public class UserComData {
    
    private int vmail;
    private double dmin;
    private double emin; 
    private double nmin;
    private double intmin;
    private String code;
    private String phnumber;

    public UserComData() {
    }

    public UserComData(int vmail, double dmin, double emin, double nmin, double intmin, String code, String phnumber) {
        this.vmail = vmail;
        this.dmin = dmin;
        this.emin = emin;
        this.nmin = nmin;
        this.intmin = intmin;
        this.code = code;
        this.phnumber = phnumber;
    }

    public int getVmail() {
        return vmail;
    }

    public void setVmail(int vmail) {
        this.vmail = vmail;
    }

    public double getDmin() {
        return dmin;
    }

    public void setDmin(double dmin) {
        this.dmin = dmin;
    }

    public double getEmin() {
        return emin;
    }

    public void setEmin(double emin) {
        this.emin = emin;
    }

    public double getNmin() {
        return nmin;
    }

    public void setNmin(double nmin) {
        this.nmin = nmin;
    }

    public double getIntmin() {
        return intmin;
    }

    public void setIntmin(double intmin) {
        this.intmin = intmin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhnumber() {
        return phnumber;
    }

    public void setPhnumber(String phnumber) {
        this.phnumber = phnumber;
    }
    
    @Override
    public String toString(){
        String text = "Number - " + phnumber + "\n";
               text +="     Voice Mail - "+ vmail +"\n";
               text +="     Day minutes - "+ dmin +"\n";
               text +="     Evening Minutes - "+ emin +"\n";
               text +="     Night Minutes - "+ nmin +"\n";
               text +="     Intern Minutes - "+ intmin +"\n";
               text +="     Code - "+ code +"\n";
               
        return text;
    }
}
