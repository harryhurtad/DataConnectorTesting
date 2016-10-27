/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import com.dataconnector.constans.ProvidersSupportEnum;
import com.dataconnector.criteria.CriteriaQuery;
import com.dataconnector.manager.DataConnector;
import com.dataconnector.manager.DataConnectorFactory;
import com.dataconnector.manager.DataConnectorManager;
import com.dataconnector.manager.DataConnectorSQLServerManager;
import com.dataconnector.query.SQLServerQuery;
import com.dataconnector.object.JoinsTypeEnum;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Join;
import com.dataconnector.sql.JoinPredicate;
import com.dataconnector.sql.Root;
import com.dataconnector.table.UNICO_TLF;
import com.dataconnector.table.UNICO_TLF_TMP;
import com.prueba.dataconnector.object2.EmployeeDTO;
import com.prueba.dataconnector.object2.TlfDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * {Insert class description here}
 *
 * @version $Revision: 1.1.1 (UTF-8)
 * @since build 28/03/2016
 * @author proveedor_hhurtado email: proveedor_hhurtad@ath.com.co
 */
public class DataConnectorSQLServerTestingMain {

    public static void main(String[] args) {
        
         try {
           // String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            DataConnector.getInitialContextDataConnector();
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory("ConnectorSQLServer");
            DataConnectorSQLServerManager manager = (DataConnectorSQLServerManager) factory.getInstanceDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Elaboracion del query
          CriteriaQuery cq = (CriteriaQuery) cb.createQuery(TlfDTO.class);            
            Root unicoIDTLF = cq.from(UNICO_TLF_TMP.class);
          
           
            cq.select(unicoIDTLF.get(UNICO_TLF_TMP.idTLF).alias("idTlf"));   
             cq.where(cb.equal(unicoIDTLF.get(UNICO_TLF.idAdquiriente), cb.value(String.class, "23")));
              // cq.where(cb.IN(unicoIDTLF.get(UNICO_TLF.idTerminal),new String[]{"27901","66006"}));
            // Root unicoAdquiriente = cq.from("UNICO_ADQUIRIENTE");
            // cq.select( unicoAdquiriente.get("ID").alias("idAdquiriente"));
            SQLServerQuery query = manager.createQuery(cq);
            query.setFieldRowIndex(unicoIDTLF.get(UNICO_TLF_TMP.id_unico_tlf));
            //query.setMaxDop(new Integer("1"));
            //query.setFieldRowNumber(unicoAdquiriente.get("ID"));
           // query.setNumeroRegistrosHilo(1500000);
           //query.setNumeroRegistrosHilo(2500000);
           // query.setNumeroRegistrosHilo(180000);
            query.excuteMultiThread(false);

            List<TlfDTO> listTLF = query.getResultList();
            System.out.println("Total:" + listTLF.size());

        } catch (Exception ex) {
            Logger.getLogger(DataConnectorSQLServerTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        }
      /*  try {
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory(driver, ProvidersSupportEnum.SQLSERVER);
            DataConnectorSQLServerManager manager = (DataConnectorSQLServerManager) factory.getInstanceDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Elaboracion del query
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(TlfDTO.class);
            Root unicoIDTLF = cq.from("UNICO_TLF");
            //Joins
            Join unicoAdquiriente = unicoIDTLF.joinTable("UNICO_ADQUIRIENTE", JoinsTypeEnum.INNER_JOIN);
            JoinPredicate predicateTLF = cb.and(cb.equal(unicoIDTLF.get("numeroRecibo"), unicoAdquiriente.get("numeroRecibo")),
                    cb.equal(unicoIDTLF.get("idOperacionDebito"), unicoAdquiriente.get("idOperacionDebito")),
                    cb.equal(unicoAdquiriente.get("fechaNegocio"), cb.value(String.class, "2015-11-11")),
                    cb.equal(unicoAdquiriente.get("idTerminal"), cb.value(Integer.class, new Integer("11005"))));
            unicoAdquiriente.On(predicateTLF);

            cq.select(unicoIDTLF.get("idTLF").alias("idTlf"), unicoAdquiriente.get("ID").alias("idAdquiriente"));
            //Where
            cq.where(cb.equal(unicoIDTLF.get("idAdquiriente"), cb.value(Integer.class, new Integer("52"))));
            // Root unicoAdquiriente = cq.from("UNICO_ADQUIRIENTE");
            // cq.select( unicoAdquiriente.get("ID").alias("idAdquiriente"));
            SQLServerQuery query = manager.createQuery(cq);
            query.setFieldRowNumber(unicoIDTLF.get("idTLF"));
            //query.setFieldRowNumber(unicoAdquiriente.get("ID"));
            query.setNumeroRegistrosHilo(124000);
            query.excuteMultiThread(true);

            List<TlfDTO> listTLF = query.getResultList();
            System.out.println("Total:" + listTLF.size());

        } catch (Exception ex) {
            Logger.getLogger(DataConnectorSQLServerTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
