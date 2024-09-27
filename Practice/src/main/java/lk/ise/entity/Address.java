package lk.ise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    @Id
    private int aid;
    private String road;
    private String city;

    @ManyToOne
    private Customer customer;


    public Address(int aid, String road, String city) {
        this.aid = aid;
        this.road = road;
        this.city = city;
    }

    public Address() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", road='" + road + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
