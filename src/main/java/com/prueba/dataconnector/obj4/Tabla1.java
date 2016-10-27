/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.prueba.dataconnector.obj4;

import com.dataconnector.commons.metadata.MetadataFieldDataConnector;
import com.dataconnector.commons.metadata.MetdataTableDataConn;

/**
 *{Insert class description here}
 * @version $Revision: 1.1.1  (UTF-8)
 * @param <X>
 * @since build 8/06/2016  
 * @author proveedor_hhurtado  email: proveedor_hhurtad@ath.com.co
 */
public class Tabla1 implements MetadataFieldDataConnector {

    private final Object valor;
    private final String nameField;
    
    public Tabla1(Object valor,String nameField){
    
        this.valor=valor;
        this.nameField=nameField;
    }
    
    @Override
    public Object getType() {
       return valor;
    }

    @Override
    public String nameField() {
        return nameField;
    }

    @Override
    public String toString() {
        return "Tabla1{" + "valor=" + valor + ", nameField=" + nameField + '}';
    }

    
}
