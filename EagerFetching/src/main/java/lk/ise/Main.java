package lk.ise;

import lk.ise.config.FactoryConfiguration;
import lk.ise.entity.Address;
import lk.ise.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setCid(4);
//        customer.setName("shenal");
//
//        List<Address> addressList = new ArrayList<Address>();
//        Address a1 = new Address(4,"101","peter's street","San Francisco",customer);
//        Address a2 = new Address(5,"101","peter's street","Maggona",customer);
//        addressList.add(a1);
//        addressList.add(a2);
//        customer.setAddresses(addressList);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,4);
        System.out.println(customer.getCid());
        System.out.println(customer.getAddresses().toArray());




        /*Address address = session.get(Address.class,4);
        System.out.println(address);
*/
        transaction.commit();
        session.close();
    }
}
