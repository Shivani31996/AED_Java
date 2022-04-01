/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/**
 *
 * @author Dell
 */
public class Uber {
    
    private String carBrand;
    private String carModelNo;
    private int carManuYear;
    private int carMaxSeats;
    private int carMinSeats;
    private int carSerialNo;
    private String city;
    private String carAvailability;
    private String carExpiry;
    
    public Uber(String carBrand, String carModelNo, int carManuYear, int carMinSeats, int carMaxSeats, int carSerialNo, String city, String carAvailability, String carExpiry){
        this.carBrand = carBrand;
        this.carModelNo = carModelNo;
        this.carManuYear = carManuYear;
        this.carMaxSeats = carMaxSeats;
        this.carMinSeats = carMinSeats;
        this.carSerialNo = carSerialNo;
        this.city = city;
        this.carAvailability = carAvailability;
        this.carExpiry = carExpiry;
        
    }
    
         Uber ()
     {
         
     }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModelNo() {
        return carModelNo;
    }

    public void setCarModelNo(String carModelNo) {
        this.carModelNo = carModelNo;
    }

    public int getCarManuYear() {
        return carManuYear;
    }

    public void setCarManuYear(int carManuYear) {
        this.carManuYear = carManuYear;
    }

    public int getCarMaxSeats() {
        return carMaxSeats;
    }

    public void setCarMaxSeats(int carMaxSeats) {
        this.carMaxSeats = carMaxSeats;
    }

    public int getCarMinSeats() {
        return carMinSeats;
    }

    public void setCarMinSeats(int carMinSeats) {
        this.carMinSeats = carMinSeats;
    }

    public int getCarSerialNo() {
        return carSerialNo;
    }

    public void setCarSerialNo(int carSerialNo) {
        this.carSerialNo = carSerialNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String isCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String isCarExpiry() {
        return carExpiry;
    }

    public void setCarExpiry(String carExpiry) {
        this.carExpiry = carExpiry;
    }
    
    @Override
    public String toString(){
        return carBrand;        
    }    
    
}

