
package cpit251;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Owner extends user{
    //attributes
    private String BusinessName;
    
    //Constructor

   public Owner(String firstName, String lastName, String BusinessName, String phoneNumber, String email, String id, String passWord) {
        super(firstName, lastName, phoneNumber, email, id, passWord);
        this.BusinessName = BusinessName;
    }
    
    
    //getters and setters

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }
    
     void addOwner(ArrayList<Owner> AddOwner, Owner Oinfo) {
        AddOwner.add(Oinfo);
        System.out.println(Oinfo.toString());
    }
    
}
