/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dataconnector.main;

import com.dataconnector.commons.anotations.MetadataFielInfoDataConnector;
import com.prueba.dataconnector.obj4.Tabla1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * {Insert class description here}
 *
 * @version $Revision: 1.1.1 (UTF-8)
 * @since build 8/06/2016
 * @author proveedor_hhurtado email: proveedor_hhurtad@ath.com.co
 */
public class TestingScanClassPathMain {

    public static void main(final String arg[]) {
  //ClassLoader pp=TestingScanClassPathMain.class.getClassLoader().getParent().getParent();
        /*  try {
         Enumeration<URL> roots = TestingScanClassPathMain.class.getClassLoader().getResources("");
         while(roots.hasMoreElements()){
         System.out.println(roots.nextElement().getFile());
         }
         } catch (IOException ex) {
         Logger.getLogger(TestingScanClassPathMain.class.getName()).log(Level.SEVERE, null, ex);
         }*/
            //  DEPARTPRUEBA.class.getClassLoader()
       /*    PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver(pp);
         try {
         Resource resources[] = resolver.getResources("classpath*:/com/dataconnector/*");
         for(Resource r:resources){
         System.out.println(r.getFilename());
         }
            
         } catch (IOException ex) {
         Logger.getLogger(TestingScanClassPathMain.class.getName()).log(Level.SEVERE, null, ex);
         }*/
        /*  String strClassPath = System.getProperty("java.class.path");
            
         System.out.println("Classpath is " + strClassPath);
         */
      try {
            Enumeration<URL> en = TestingScanClassPathMain.class.getClassLoader().getResources("META-INF");
            //List<String> profiles = new ArrayList<>();
            File jarFile = new File("C:\\Users\\proveedor_hhurtado\\.m2\\repository\\com\\dataconnector\\bd_employees\\1.0\\bd_employees-1.0.jar");
           // if (en.hasMoreElements()) {
            // JarFile jFile=new JarFile(jarFile);
            // URL url = jarFile.toURI().toURL();
            //   JarURLConnection urlcon = (JarURLConnection) (url.openConnection());
            List<String> listClass = new ArrayList<>();
            try (JarFile jar = new JarFile(jarFile);) {
                Enumeration<JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    String entry = entries.nextElement().getName();
                    if (entry.endsWith(".class")) {
                        System.out.println(entry);
                        listClass.add(entry);
                    }
                }
                //   }
                for (String s : listClass) {
                    int i = s.indexOf(".class");
                    String nameClass = s.replace("/", ".").substring(0, i);
                     Class classWrapper = Class.forName(nameClass);
                     Object obj=classWrapper.newInstance();
                  //  System.out.println("Clase: " + obj+ " Campos");
                    for(Field f :classWrapper.getFields()){
                       MetadataFielInfoDataConnector anotacion=  f.getAnnotation(MetadataFielInfoDataConnector.class);
                       Object type= anotacion.type();
                       String nameField=f.getName();
                       Tabla1 impl=new Tabla1(type, nameField);
                       f.set(null, impl);                       
                    }  
                    
                }
               //  System.out.println("Clase: " +DEPARTPRUEBA.dept_name );
                
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(TestingScanClassPathMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(TestingScanClassPathMain.class.getName()).log(Level.SEVERE, null, ex);
        }
            // Class classWrapper = Class.forName(classNameWrapper)

    }

}
