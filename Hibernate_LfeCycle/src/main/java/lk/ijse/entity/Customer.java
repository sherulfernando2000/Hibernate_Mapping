package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)   //meka nisa value generate wenne database eken
    private int cid;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Customer() {
    }

    public Customer(int cid, String name, List<Address> addresses) {
        this.cid = cid;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
