package database.repository;


import client.clientInfo;
import database.client.clientTable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Repository {

    private static final SessionFactory session = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try{
            return new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            System.out.println("Session startUp fail");
            throw new HibernateException("Could not start session");
        }
    }

    public static Session connect(){
        return session.openSession();
    }

    public static boolean register(clientTable user){
        Transaction tx = null;
        Session session = connect();
        try{
            tx = session.beginTransaction();
            session.persist(user);
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx != null){
                tx.rollback();
            }

            e.printStackTrace();

            return false;
        }
    }

    public static void getAll(){

    }

    public static void getUser(String email){

    }
}
