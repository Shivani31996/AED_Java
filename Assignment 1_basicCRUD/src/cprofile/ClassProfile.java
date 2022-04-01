/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cprofile;

import java.io.File;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class ClassProfile {
    private String nameCP;
    private String geodataCP;
    private Date birthdateCP;
    private long telnumCP;
    private int faxCP;
    private String emailCP;
    private String ssnCP;
    private int medrecnumCP;
    private int helplanCP;
    private int bankaccnumCP;
    private int licensenumCP;
    private int vehserialnumCP;
    private int devserialnumCP;
    private String linkedinCP;
    private String IPaddCP;
    private File pictureCP;
    
    public File getImage() {
        return pictureCP;
    }

    public void setImage(File picture) {
        this.pictureCP = picture;
    }    

    public String getName() {
        return nameCP;
    }

    public void setName(String name) {
        this.nameCP = name;
    }

    public String getGeodata() {
        return geodataCP;
    }

    public void setGeodata(String geodata) {
        this.geodataCP = geodata;
    }

    public Date getBirthdate() {
        return birthdateCP;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdateCP = birthdate;
    }

    public long getTelnum() {
        return telnumCP;
    }

    public void setTelnum(long telnum) {
        this.telnumCP = telnum;
    }

    public int getFax() {
        return faxCP;
    }

    public void setFax(int fax) {
        this.faxCP = fax;
    }

    public String getEmail() {
        return emailCP;
    }

    public void setEmail(String email) {
        this.emailCP = email;
    }

    public String getSsn() {
        return ssnCP;
    }

    public void setSsn(String ssn) {
        this.ssnCP = ssn;
    }

    public int getMedrecnum() {
        return medrecnumCP;
    }

    public void setMedrecnum(int medrecnum) {
        this.medrecnumCP = medrecnum;
    }

    public int getHelplan() {
        return helplanCP;
    }

    public void setHelplan(int helplan) {
        this.helplanCP = helplan;
    }

    public int getBankaccnum() {
        return bankaccnumCP;
    }

    public void setBankaccnum(int bankaccnum) {
        this.bankaccnumCP = bankaccnum;
    }

    public int getLicensenum() {
        return licensenumCP;
    }

    public void setLicensenum(int licensenum) {
        this.licensenumCP = licensenum;
    }

    public int getVehserialnum() {
        return vehserialnumCP;
    }

    public void setVehserialnum(int vehserialnum) {
        this.vehserialnumCP = vehserialnum;
    }

    public int getDevserialnum() {
        return devserialnumCP;
    }

    public void setDevserialnum(int devserialnum) {
        this.devserialnumCP = devserialnum;
    }

    public String getLinkedin() {
        return linkedinCP;
    }

    public void setLinkedin(String linkedin) {
        this.linkedinCP = linkedin;
    }

    public String getIPadd() {
        return IPaddCP;
    }

    public void setIPadd(String IPadd) {
        this.IPaddCP = IPadd;
    }
    
    
    
}
