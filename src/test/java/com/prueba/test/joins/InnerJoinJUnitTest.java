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
import com.dataconnector.sql.Root;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author proveedor_hhurtado
 */
public class InnerJoinJUnitTest {

    public InnerJoinJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void useJoinTable() {

      /*  try {
            DataConnectorFactory factory = DataConnector.createDataConnectorFactory(null, ProvidersSupportEnum.GENERIC);
            DataConnectorManager manager = (DataConnectorManager) factory.getDataConnectorManager();
            CriteriaBuilder cb = manager.getCriterialBuilder();
            //Realiza la creacion del CriterialQuery
            CriteriaQuery cq = (CriteriaQuery) cb.createQuery(null);
            Root empleados = cq.from("Employee");

            //Join table
            Join ciudad = empleados.joinTable("Ciudad", JoinsTypeEnum.INNER_JOIN);

            JoinPredicate predicate = cb.and(cb.equal(ciudad.get("idCiudad"), empleados.get("idCiudad")),
                    cb.notEqual(ciudad.get("nombreDerp"), empleados.get("nombreCiudad")));
            ciudad.On(predicate);
            
            Join departamento=empleados.joinTable("Departamento", JoinsTypeEnum.INNER_JOIN);
            JoinPredicate predicDepart=cb.equal(departamento.get("idprueba"),empleados.get("idPrueba"));
            departamento.On(predicDepart).where(cb.mayorQue(departamento.get("salario"), cb.value(int.class, 100)));
            //Select
            cq.select(empleados.get("nombre"), empleados.get("apellido"))
                    .where(cb.equal(empleados.get("idEmpleado"), cb.value(String.class, "2")));
            //Se crea el query
            Query q = manager.createQuery(cq);

        } catch (Exception ex) {
            Logger.getLogger(InnerJoinJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
*/
    }
}
