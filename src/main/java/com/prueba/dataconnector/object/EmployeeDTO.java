/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.object;

import com.prueba.dataconnector.annotation.DataConnectorPOJO;
import java.util.Date;

/**
 *
 * @author proveedor_hhurtado
 */
@DataConnectorPOJO
public class EmployeeDTO {
    private Integer empNo;
   
    private Date birthDate;
    
    private String firstName;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    
}
