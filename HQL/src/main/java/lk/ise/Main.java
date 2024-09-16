package lk.ise;

import lk.ise.config.FactoryConfiguration;
import lk.ise.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Customer");
        //insert, update, delete
        List<Customer> customers = query.list();
        for (Customer customer: customers){
            System.out.println(customer);
        }


        //unique one data from customer
        /*Query query1 = session.createQuery("from Customer where cid = :id");
        query1.setParameter("id", 4);*/

        Query query1 = session.createQuery("from Customer where cid= ?1");
        query1.setParameter(1, 4);

        Customer customer = (Customer) query1.uniqueResult();
        System.out.println(customer);


        //load only one column
        Query query2 = session.createQuery("select name,cid from Customer");

        List<Object[]> collection = query2.getResultList();

        for (Object[] c : collection){
            System.out.println(c[0]);
            System.out.println(c[1]);
        }

        //
        Query query3 = session.createQuery("select cid,name from Customer where name");

        //
        Query query4 = session.createQuery("select cid, name from Customer");

        //join column
        //Query query5 = session.createQuery();

        transaction.commit();
        session.close();
    }
}
