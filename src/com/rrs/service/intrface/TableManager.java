/* 
 * Filename : TableManager.java
 * Interface : TableManager
 * Author : charanjit.singh 
 * Date : December 28, 2015
 * Purpose : 
 * Description :   */

package com.rrs.service.intrface;

import com.rrs.service.pojo.Table;
import java.util.Collection;

/**
 *
 * @author CN
 */
public interface TableManager {

    /*
    *This method add the tables
    return true on success
    */
    boolean addTable(Table table);

    /*
    This method will find the table by id 
    return the tables if id exist
    */
    Table findTableByID(int id);
    
    /*
    This is the main method which returns collection of free tables
    considering business logic
    */

    Collection<Table> freeTables(String date, int time, int duration);

    /*
    This method return list of all tables present
    */
    Collection<Table> allTables();
}
