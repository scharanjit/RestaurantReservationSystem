/* 
 * Filename : GuestManager.java
 * Interface : GuestManager
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : 
 * Description :   */
package com.rrs.service.intrface;

import com.rrs.service.pojo.Guest;

/**
 *
 * @author CN
 */
public interface GuestManager {

    /*
    This method add the guest based upon their information
    */
    boolean addGuest(Guest guest);

    /*
    this method find the gues based upon their email id if exist
    */
    Guest findGuest(String email);


}
