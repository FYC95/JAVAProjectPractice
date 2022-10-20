package fyc.epss.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class business {
//    private List<food> foodList = new ArrayList<>();
    private Integer id;
    private String password;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private Double starPrice;
    private Double deliveryPrice;
    private admin aid;
    private Timestamp uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getBusinessExplain() {
        return businessExplain;
    }

    public void setBusinessExplain(String businessExplain) {
        this.businessExplain = businessExplain;
    }

    public Double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(Double starPrice) {
        this.starPrice = starPrice;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public admin getAid() {
        return aid;
    }

    public void setAid(admin aid) {
        this.aid = aid;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public business() {}

    public business(String password, String businessName, String businessAddress, Double starPrice, Double deliveryPrice, Timestamp uptime) {
        this.password = password;
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.starPrice = starPrice;
        this.deliveryPrice = deliveryPrice;
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "business{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", businessExplain='" + businessExplain + '\'' +
                ", starPrice=" + starPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", aid=" + aid +
                ", uptime=" + uptime +
                '}';
    }
}
