/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class UberInventory {

    private ArrayList<Uber> uberList;
    private ArrayList<Uber> templist;
    
    public UberInventory(){
        this.uberList = new ArrayList<Uber>();
        
        
        Uber uber1 = new Uber ("BMW","B1", 2015, 2, 5, 1, "California", "Available", "Expired");
        Uber uber2 = new Uber ("TESLA", "TE1", 2016, 1, 4, 2, "Boston", "Booked", "Not Expired");
        Uber uber3 = new Uber ("AUDI", "A1", 2017, 2, 6, 3, "NEW YORK", "Available", "Expired");
        Uber uber4 = new Uber ("TOYOTA", "TO1", 2014, 3, 5, 4, "ARLINGTON", "Booked", "Not Expired");
        Uber uber5 = new Uber ("TATA", "TA1", 2018, 2, 6, 5, "WORCESTER", "Booked", "Not Expired");
        Uber uber6 = new Uber ("SUZUKI", "SU1", 2012, 2, 7, 6,"PUNE", "Available", "Expired");
        Uber uber7 = new Uber ("MAHINDRA", "MA1", 2011, 2, 8, 7, "MUMBAI", "Booked", "Expired");
        Uber uber8 = new Uber ("MAHINDRA", "MA2", 2011, 2, 5, 8, "MUMBAI", "Available", "Not Expired");
        Uber uber9 = new Uber ("IMPALA", "IM1", 2014, 1, 4, 9, "DALLAS", "Booked", "Expired");
        Uber uber10 = new Uber ("TESLA", "TE2", 2011, 2, 5, 10, "MUMBAI", "Available", "Not Expired");
        Uber uber11 = new Uber ("MAXX", "MX1", 2011, 2, 6, 11, "MUMBAI", "Booked", "Expired");
        Uber uber12 = new Uber ("BMW", "MB2", 2011, 2, 7, 12, "MUMBAI", "Available", "Expired");
        Uber uber13 = new Uber ("AUDI", "A1", 2012, 2, 4, 13, "MUMBAI", "Booked", "Not Expired");
        Uber uber14 = new Uber ("BMW", "B1", 2014, 2, 9, 14, "MUMBAI", "Available", "Expired");
        Uber uber15 = new Uber ("TATA", "TA1", 2016, 2, 5, 15, "MUMBAI", "Booked", "Expired");
        
        
        uberList.add(uber1);
        uberList.add(uber2);
        uberList.add(uber3);
        uberList.add(uber4);
        uberList.add(uber5);
        uberList.add(uber6);
        uberList.add(uber7);
        uberList.add(uber8);
        uberList.add(uber9);
        uberList.add(uber10);
        uberList.add(uber11);
        uberList.add(uber12);
        uberList.add(uber13);
        uberList.add(uber14);
        uberList.add(uber15);        
    }
    
    public ArrayList<Uber> getUberList() {
        return uberList;
    }

    public void setUberList(ArrayList<Uber> uberList) {
        this.uberList = uberList;
    }
    
    public Uber addUber()
    {
        Uber uber = new Uber();
        uberList.add(uber);
        return uber;
    }
    
    public void deleteUber (Uber uber)
    {
        uberList.remove(uber);
    }
    public ArrayList<Uber>searchBrand (String brandName ){
        templist = new ArrayList<Uber>();
        for(Uber uber : uberList){
            if (uber.getCarBrand().equalsIgnoreCase(brandName)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    
    public ArrayList<Uber>searchBrand1 (String brandName1, ArrayList<Uber> result ){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getCarBrand().equalsIgnoreCase(brandName1)){
                templist.add(uber);
            }
        }
        return templist;
        
    }
    

     public ArrayList<Uber>searchManuYear (String manuYear, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getCarManuYear()== Integer.parseInt(manuYear))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
     
     public ArrayList<Uber>searchSeatsAvail (int minSeats, int maxSeats, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
       
        for (Uber uber : result) {
           if (minSeats <= uber.getCarMinSeats()&& maxSeats >= uber.getCarMaxSeats())
           {
               templist.add(uber);
           }
       
       }
        return templist;
    }
     
    

      public ArrayList<Uber>searchSerialNumber (String serialNumber, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getCarSerialNo()== Integer.parseInt(serialNumber))
                    {
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchModelNumber (String modelNumber, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getCarModelNo().equalsIgnoreCase(modelNumber)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchAvailCity (String availCity, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.getCity().equalsIgnoreCase(availCity)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber>searchAvailStatus (String availStatus, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.isCarAvailability().equalsIgnoreCase(availStatus)){
                templist.add(uber);
            }
        }
        return templist;
    }
      
      public ArrayList<Uber>searchExpiryStatus (String expiryStatus, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.isCarExpiry().equalsIgnoreCase(expiryStatus)){
                templist.add(uber);
            }
        }
        return templist;
    }
      public ArrayList<Uber> searchFirstAvailUber (String firstAvailUber, ArrayList<Uber> result){
          templist = new ArrayList<Uber>();
          for (Uber uber : result){
              if (uber.isCarAvailability().equalsIgnoreCase("Available")){
                  templist.add(uber);
                  break;
              }
          }
          return templist;
      }
      public ArrayList<Uber>searchMainCerti (String mainCerti, ArrayList<Uber> result){
        templist = new ArrayList<Uber>();
        for(Uber uber : result){
            if (uber.isCarExpiry().equalsIgnoreCase(mainCerti)){
                templist.add(uber);
            }
        }
        return templist;
    }    
}
