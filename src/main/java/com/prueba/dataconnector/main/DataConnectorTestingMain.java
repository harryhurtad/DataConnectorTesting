/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import com.dataconnector.constans.ProvidersSupportEnum;
import com.dataconnector.criteria.CriteriaQuery;
import com.dataconnector.manager.AbstractDataConnectorManager;
import com.dataconnector.manager.DataConnector;
import com.dataconnector.manager.DataConnectorFactory;
import com.dataconnector.manager.DataConnectorManager;
import com.dataconnector.query.Query;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Join;
import com.dataconnector.sql.Root;
import com.prueba.dataconnector.object2.EmployeeDTO;
import com.prueba.dataconnector.object.Prueba;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author proveedor_hhurtado
 */
public class DataConnectorTestingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  try {
            // TODO code a pplication logic here
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory(null, ProvidersSupportEnum.GENERIC);
            DataConnectorManager manager = (DataConnectorManager) factory.getInstanceDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Realiza la creacion del
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(EmployeeDTO.class);
            Root empleados=cq.from("employees");
            
          //  cq.select(empleados.get("emp_no").alias("empNo"),empleados.get("first_name").alias("firstName"),empleados.get("last_name").alias("lastName"))
         //           .where(cb.equal(empleados.get("emp_no"),cb.value(String.class, "10001")));
            
           
            
             
            //        .where(cb.equal(empleados.get("emp_no"),cb.value(String.class, "10001")));
      //      Join tabla2=empleados.joinTable("prueba");
        //    tabla2.On(cb.equal(empleados.get("P"), empleados.get("P")));
           
            Query q=manager.createQuery(cq);
            
            q.excuteMultiThread(true);
            q.setNumeroRegistrosHilo(30000000);
            List<EmployeeDTO> listaEmpleado= q.getResultList();
            System.out.println("Total:"+listaEmpleado.size());
                // CriterialBuilder cb= factory.getCriterialBuilder();
          //  Prueba p = new Prueba();
            //EmployeeDTO emp = new EmployeeDTO();
            //Query<Prueba> q=manager.createQuery(null);
        } catch (Exception ex) {
            Logger.getLogger(DataConnectorTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}
