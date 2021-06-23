package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
 private static final String PRESISTENCE_UNIT_NAME = "daily_report_system2";
 private static EntityManagerFactory emf;

 public static EntityManager createEntityManager(){
     return getEntityManagerFactory().createEntityManager();
 }

 private static EntityManagerFactory getEntityManagerFactory(){
     if(emf==null){
         emf = Persistence.createEntityManagerFactory(PRESISTENCE_UNIT_NAME);

     }
     return emf;
 }

}