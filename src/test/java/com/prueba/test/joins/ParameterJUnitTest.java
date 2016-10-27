/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.test.joins;

import com.dataconnector.criteria.CriteriaQuery;
import com.dataconnector.manager.DataConnector;
import com.dataconnector.manager.DataConnectorFactory;
import com.dataconnector.manager.DataConnectorManager;
import com.dataconnector.query.Query;
import com.dataconnector.object.JoinsTypeEnum;
import com.dataconnector.constans.ProvidersSupportEnum;
import com.dataconnector.sql.CriteriaBuilder;
import com.dataconnector.sql.Join;
import com.dataconnector.sql.JoinPredicate;
import com.dataconnector.sql.ParameterExpression;
import com.dataconnector.sql.Predicate;
import com.dataconnector.sql.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author proveedor_hhurtado
 */
public class ParameterJUnitTest {

    public ParameterJUnitTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testParameter() {

     /*   try {
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory(null, ProvidersSupportEnum.GENERIC);
            DataConnectorManager manager = (DataConnectorManager) factory.getDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            String nombre = "Prueba";
            int cantidad = 1;
            //Realiza la creacion del CriterialQuery
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(null);
            Root empleados = cq.from("Employee");

            //Select
            List<Predicate> listPredicate = new ArrayList<>();
            cq.select(empleados.get("nombre"), empleados.get("apellido"));
            if (!nombre.equals("")) {
                ParameterExpression<String> param1 = cb.parameter(String.class, nombre);
                Predicate p = cb.equal(empleados.get("idEmpleado"), param1);
                listPredicate.add(p);
            }

            if (cantidad != 0) {
                ParameterExpression<Integer> param1 = cb.parameter(Integer.class, "cantidad");
                Predicate p = cb.equal(empleados.get("cantidad"), param1);
                listPredicate.add(p);
            }
            if (!listPredicate.isEmpty() && listPredicate.size() > 1) {
                cq.where(cb.and(listPredicate.toArray(new Predicate[0])));
           //    Predicate[] predicate= (Predicate[])listPredicate.toArray(new Predicate[listPredicate.size()]);
                //  cq.where(cb.and(predicate));
            } else if (listPredicate.size() == 1) {
                cq.where(listPredicate.get(0));
            }
            //Se crea el query
            Query q = manager.createQuery(cq);
            //Parametros
            if (!nombre.equals("")) {
                q.setParameter(nombre, "Harry Hurtado");
            }
            if (cantidad != 0) {
                q.setParameter("cantidad1", 1);
            }
           
            Map<String,Object> mapa= q.getMapParameters();
            Set<String> keys= mapa.keySet();
           for(String llave:keys){
               System.out.println(""+llave +" :"+ mapa.get(llave));
           }
        } catch (Exception ex) {
            Logger.getLogger(InnerJoinJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
    }
}
