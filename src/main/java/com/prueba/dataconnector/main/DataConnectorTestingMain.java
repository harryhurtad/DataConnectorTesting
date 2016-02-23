/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import com.prueba.dataconnector.bd.CriterialBuilder;
import com.prueba.dataconnector.bd.DataConnector;
import com.prueba.dataconnector.bd.FactoryDataConnectorManager;
import com.prueba.dataconnector.bd.Query;
import com.prueba.dataconnector.object.EmployeeDTO;
import com.prueba.dataconnector.object.Prueba;

/**
 *
 * @author proveedor_hhurtado
 */
public class DataConnectorTestingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a pplication logic here
       FactoryDataConnectorManager manager= DataConnector.createDataConnectorManager();
       CriterialBuilder cb= manager.getCriterialBuilder();
        Prueba p=new Prueba();
        EmployeeDTO emp=new EmployeeDTO();
        //Query<Prueba> q=manager.createQuery(null);
    }
    
}
