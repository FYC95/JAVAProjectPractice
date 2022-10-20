package fyc.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class food implements Serializable {
    private List<orderMap> orderMapsList = new ArrayList<>();
    private Integer id;
    private String foodName;
    private String foodExplain;
    private Double foodPrice;
    private Integer bid;
    private business business;
    private Timestamp uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public fyc.epss.pojo.business getBusiness() {
        return business;
    }

    public void setBusiness(fyc.epss.pojo.business business) {
        this.business = business;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public food(){}

    public food(String foodName, Double foodPrice, Integer bid) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodPrice=" + foodPrice +
                ", bid=" + bid +
                ", business=" + business +
                ", uptime=" + uptime +
                '}';
    }
}
