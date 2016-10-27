/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * {Insert class description here}
 *
 * @version $Revision: 1.1.1 (UTF-8)
 * @since build 28/04/2016
 * @author proveedor_hhurtado email: proveedor_hhurtad@ath.com.co
 */
public class TestingSimpleDataSource {

    public static void main(final String arg[]) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://10.130.4.101:1501;databaseName=DBUnico", "sa", "Pruebas123")) {
                 Statement stmt = con.createStatement();
                 ResultSet datos=  stmt.executeQuery("SELECT t1.idTLF AS idTlf,inerT0.ID AS idAdquiriente FROM UNICO_TLF t1 INNER JOIN UNICO_ADQUIRIENTE inerT0 ON ( ( t1.numeroRecibo = inerT0.numeroRecibo ) AND ( t1.idOperacionDebito = inerT0.idOperacionDebito ) AND ( inerT0.fechaNegocio = '2015-11-11' ) AND ( inerT0.idTerminal = 11005 )  )   \n"
                        + "  WHERE ( t1.idAdquiriente = 52 )");
               // PreparedStatement st = con.prepareStatement("SELECT t1.idTLF AS idTlf,inerT0.ID AS idAdquiriente FROM UNICO_TLF t1 INNER JOIN UNICO_ADQUIRIENTE inerT0 ON ( ( t1.numeroRecibo = inerT0.numeroRecibo ) AND ( t1.idOperacionDebito = inerT0.idOperacionDebito ) AND ( inerT0.fechaNegocio = '2015-11-11' ) AND ( inerT0.idTerminal = 11005 )  )   \n"
               //         + "  WHERE ( t1.idAdquiriente = 52 )");
            //    ResultSet datos = st.executeQuery();
                List<String> lista = new ArrayList();
                while (datos.next()) {
                    lista.add(datos.getString(1));
                }
                System.out.println("Total Datos: " + lista.size());

            } catch (SQLException ex) {
                Logger.getLogger(TestingSimpleDataSource.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestingSimpleDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
