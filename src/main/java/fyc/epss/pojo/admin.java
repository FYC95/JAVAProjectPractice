package fyc.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class admin implements Serializable {
    private List<info> infoList = new ArrayList<>();
    private List<business> businessesList = new ArrayList<>();
    private List<orderMap> orderMapsList = new ArrayList<>();
    private Integer id;
    private String adminName;
    private String password;
    private Timestamp uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public admin() {}

    public admin(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                ", uptime=" + uptime +
                '}';
    }
}

