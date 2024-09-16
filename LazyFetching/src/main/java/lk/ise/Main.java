package lk.ise;

import lk.ise.config.FactoryConfiguration;
import lk.ise.entity.Address;
import lk.ise.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,4);
        System.out.println(customer.getCid());
        System.out.println(Arrays.toString(customer.getAddresses().toArray()));

        /*List<Address> addresses = customer.getAddresses();
        for (Address address : addresses) {
            System.out.println(address+", ");
        }*/


        transaction.commit();
        session.close();
    }
}
