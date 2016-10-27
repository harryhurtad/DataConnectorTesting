/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.object2;

import com.dataconnector.annotation.DataConnectorPOJO;
import java.util.Date;

/**
 *
 * @author proveedor_hhurtado
 */

public class SalaryDTO {
    private int salary;
  
    private Date toDate;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    
    
}
