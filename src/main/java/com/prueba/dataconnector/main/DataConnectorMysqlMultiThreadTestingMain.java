/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import com.dataconnector.criteria.CriteriaQuery;
import com.dataconnector.exceptions.DataConnectorQueryException;
import com.dataconnector.exceptions.DataConnectorResultException;
import com.dataconnector.manager.DataConnector;
import com.dataconnector.manager.DataConnectorFactory;
import com.dataconnector.manager.DataConnectorManager;
import com.dataconnector.manager.DataConnectorSQLServerManager;
import com.dataconnector.query.Query;
import com.dataconnector.query.SQLServerQuery;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Root;
import com.dataconnector.table.UNICO_TLF;
import com.employees.table.EMPLOYEES;
import com.prueba.dataconnector.object2.EmployeeDTO;
import com.prueba.dataconnector.object2.TlfDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author proveedor_hhurtado
 */
public class DataConnectorMysqlMultiThreadTestingMain {
    
    public static void main(final String arg[]){
        try {
            // String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            DataConnector.getInitialContextDataConnector();
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory("ConnectorMysql");
            DataConnectorManager manager = (DataConnectorManager) factory.getInstanceDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Elaboracion del query
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(EmployeeDTO.class);            
            Root employeesTbl = cq.from(EMPLOYEES.class);
            
            
            cq.select(employeesTbl.get(EMPLOYEES.emp_no).alias("empNo"));
            //  cq.where(cb.equal(unicoIDTLF.get(UNICO_TLF.idAdquiriente), cb.value(String.class, "23")));
     //       cq.where(cb.IN(employeesTbl.get(UNICO_TLF.idTerminal),new String[]{"27901","66006"}));
            // Root unicoAdquiriente = cq.from("UNICO_ADQUIRIENTE");
            // cq.select( unicoAdquiriente.get("ID").alias("idAdquiriente"));
            Query query = manager.createQuery(cq);
        
            //query.setFieldRowNumber(unicoAdquiriente.get("ID"));
            // query.setNumeroRegistrosHilo(1500000);
            //query.setNumeroRegistrosHilo(2500000);
            //   query.setNumeroRegistrosHilo(181578);
            //query.setNumeroRegistrosHilo(401289);
            query.setNumeroRegistrosHilo(251394);
            query.excuteMultiThread(true);

            List<EmployeeDTO> listTLF = query.getResultList();
            System.out.println("Total:" + listTLF.size());
        } catch (DataConnectorResultException ex) {
            Logger.getLogger(DataConnectorMysqlMultiThreadTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DataConnectorQueryException ex) {
            Logger.getLogger(DataConnectorMysqlMultiThreadTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
}
