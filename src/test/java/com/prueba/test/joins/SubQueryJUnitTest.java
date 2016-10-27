/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.test.joins;

import com.dataconnector.criteria.CriteriaQuery;
import com.dataconnector.criteria.SubQuery;
import com.dataconnector.manager.DataConnector;
import com.dataconnector.manager.DataConnectorFactory;
import com.dataconnector.manager.DataConnectorManager;
import com.dataconnector.query.Query;
import com.dataconnector.object.JoinsTypeEnum;
import com.dataconnector.constans.ProvidersSupportEnum;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Join;
import com.dataconnector.sql.JoinPredicate;
import com.dataconnector.sql.Root;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author proveedor_hhurtado
 */
public class SubQueryJUnitTest {
    
    public SubQueryJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void subQuerySelect() {
        
     /*   try {
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory(null, ProvidersSupportEnum.GENERIC);
            DataConnectorManager manager = (DataConnectorManager) factory.getDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Realiza la creacion del CriterialQuery
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(null);
            Root empleados = cq.from("Employee");
            //SubQuery
            SubQuery sub = cb.createSubQuery(Integer.class);
            Root pais = sub.from("Pais");
            sub.select(pais.get("idPais")).where(cb.notEqual(empleados.get("idnacionalidad"), cb.value(String.class, 2)));
            //Select
            cq.select(empleados.get("nombre"), empleados.get("apellido"),sub)
                    .where(cb.and(cb.equal(empleados.get("idEmpleado"), cb.value(String.class, "2")), cb.equal(empleados.get("prueba"), sub)));
            //Se crea el query
            Query q = manager.createQuery(cq);
            
            
        } catch (Exception ex) {
            Logger.getLogger(InnerJoinJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }
}
