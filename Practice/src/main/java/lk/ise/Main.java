package lk.ise;


import lk.ise.entity.Address;
import lk.ise.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Address.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCid(3);
        customer.setName("amal");


        //SQL
       /* NativeQuery query = session.createNativeQuery("select * from customer");
        query.addEntity(Customer.class);
        List<Customer> customers = query.list();
        for (Customer custom : customers) {
            System.out.println(custom);
        }

        NativeQuery query1 = session.createNativeQuery("insert into customer values(?,?)");
        query1.setParameter(1,11);
        query1.setParameter(2,"Namal");
        query1.executeUpdate();*/

        //HQL
        /*Query query = session.createQuery("from Customer");
        List<Customer> customers = query.list();
        for(Customer cust: customers){
            System.out.println(cust);
        }*/

        Query query1 = session.createQuery("insert into Customer(cid,name) values(?1,?2)");
        query1.setParameter(1,12);
        query1.setParameter(2,"shenal");
        query1.executeUpdate();


        transaction.commit();
        session.close();
        }
    }
