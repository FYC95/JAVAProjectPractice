package fyc.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class info implements Serializable {
    private Integer id;
    private admin aid;
    private String phone;
    private String avatar;
    private Boolean gender;
    private Timestamp uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public admin getAid() {
        return aid;
    }

    public void setAid(admin aid) {
        this.aid = aid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public info() {}

    public info(String phone, String avatar) {
        this.phone = phone;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "info{" +
                "id=" + id +
                ", aid=" + aid +
                ", phone='" + phone + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender=" + gender +
                ", uptime=" + uptime +
                '}';
    }
}
