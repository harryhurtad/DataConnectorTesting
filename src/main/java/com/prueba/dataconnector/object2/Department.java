/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.object2;

import com.dataconnector.annotation.DataConnectorAttributes;
import com.dataconnector.annotation.DataConnectorPOJO;

/**
 *
 * @author proveedor_hhurtado
 */
@DataConnectorPOJO
public class Department {
    @DataConnectorAttributes(name = "id_departamento")
    private String deptNo;
    
    
    private String deptName;

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    
}
