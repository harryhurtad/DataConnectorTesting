/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.object2;

import com.dataconnector.annotation.DataConnectorAttributes;
import com.dataconnector.annotation.DataConnectorPOJO;
import java.util.Date;

/**
 *
 * @author proveedor_hhurtado
 */
@DataConnectorPOJO
public class EmployeeDTO {
    @DataConnectorAttributes(name = "emp_no")
    private Integer empNo;
    
    private Date birthDate;
    @DataConnectorAttributes(name = "first_name")
    private String firstName;

    @DataConnectorAttributes(name = "last_name")
    private String lastName;
    
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "empNo=" + empNo + ", birthDate=" + birthDate + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
