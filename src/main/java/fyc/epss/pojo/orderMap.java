package fyc.epss.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class orderMap implements Serializable {
    private Integer id;
    private admin aid;
    private food fid;
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

    public food getFid() {
        return fid;
    }

    public void setFid(food fid) {
        this.fid = fid;
    }

    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    public orderMap() {}

    public orderMap(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "orderMap{" +
                "id=" + id +
                ", aid=" + aid +
                ", fid=" + fid +
                ", uptime=" + uptime +
                '}';
    }
}
