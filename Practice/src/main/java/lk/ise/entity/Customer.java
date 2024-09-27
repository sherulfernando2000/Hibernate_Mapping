package lk.ise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int cid;
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    public Customer(){

    }

    public Customer(int cid, String name){
        this.cid = cid;
        this.name = name;
    }

    public void setCid(int cid){
        this.cid = cid;
    }
    public int getCid(){
        return cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String cname) {
        this.name = cname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + name + '\'' +
                '}';
    }
}
