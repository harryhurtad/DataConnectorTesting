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
import com.dataconnector.manager.DataConnectorSQLServerManager;
import com.dataconnector.context.InitialContextDataConnector;
import com.dataconnector.query.SQLServerQuery;
import com.dataconnector.object.JoinsTypeEnum;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Join;
import com.dataconnector.sql.JoinPredicate;
import com.dataconnector.sql.Root;
import com.dataconnector.table.UNICO_TLF;
import com.dataconnector.table.UNICO_TLF_TMP;
import com.prueba.dataconnector.object2.TlfDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *{Insert class description here}
 * @version $Revision: 1.1.1  (UTF-8)
 * @since build 4/05/2016  
 * @author proveedor_hhurtado  email: proveedor_hhurtad@ath.com.co
 */
public class DataConnectorSQLServerTesting2Main {

    public static void main(final String arg[]){
    
        try {
           // String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            DataConnector.getInitialContextDataConnector();
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory("ConnectorSQLServer");
            DataConnectorSQLServerManager manager = (DataConnectorSQLServerManager) factory.getInstanceDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Elaboracion del query
          CriteriaQuery cq = (CriteriaQuery) cb.createQuery(TlfDTO.class);            
            Root unicoIDTLF = cq.from(UNICO_TLF_TMP.class);
          
           
            cq.select(unicoIDTLF.get(UNICO_TLF_TMP.idTLF).alias("idTLF"));   
             cq.where(cb.equal(unicoIDTLF.get(UNICO_TLF_TMP.idAdquiriente), cb.value(String.class, "23")));           
          // cq.where(cb.IN(unicoIDTLF.get(UNICO_TLF_TMP.idTerminal),new String[]{"27901","66006"}));
            // Root unicoAdquiriente = cq.from("UNICO_ADQUIRIENTE");
            // cq.select( unicoAdquiriente.get("ID").alias("idAdquiriente"));
            SQLServerQuery query = manager.createQuery(cq);
            query.setFieldRowIndex(unicoIDTLF.get(UNICO_TLF_TMP.id_unico_tlf));
            query.isSelectForRowNumber(false);
           query.setMaxDop(new Integer("2"));
            query.setWithNotLock(true);
            //query.setFieldRowNumber(unicoAdquiriente.get("ID"));
           // query.setNumeroRegistrosHilo(1500000);
           //query.setNumeroRegistrosHilo(2500000);
           query.setNumeroRegistrosHilo(90788);
          // query.setNumeroRegistrosHilo(121051);
            //query.setNumeroRegistrosHilo(181578);
          //  query.setNumeroRegistrosHilo(23538);
            query.excuteMultiThread(true);

            List<TlfDTO> listTLF = query.getResultList();
            System.out.println("Total:" + listTLF.size());

        } catch (Exception ex) {
            Logger.getLogger(DataConnectorSQLServerTestingMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
