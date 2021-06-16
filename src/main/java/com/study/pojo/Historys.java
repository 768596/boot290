package com.study.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Historys {
    private int hid;
    private Integer hjf;
    private Timestamp htime;
    private Integer tos;
    private Student xue;
    private Subject kmss;

    @Override
    public String toString() {
        return "Historys{" +
                "hid=" + hid +
                ", hjf=" + hjf +
                ", htime=" + htime +
                ", tos=" + tos +
                '}';
    }

    @Id
    @Column(name = "hid")
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "hjf")
    public Integer getHjf() {
        return hjf;
    }

    public void setHjf(Integer hjf) {
        this.hjf = hjf;
    }

    @Basic
    @Column(name = "htime")
    public Timestamp getHtime() {
        return htime;
    }

    public void setHtime(Timestamp htime) {
        this.htime = htime;
    }

    @Basic
    @Column(name = "tos")
    public Integer getTos() {
        return tos;
    }

    public void setTos(Integer tos) {
        this.tos = tos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historys historys = (Historys) o;
        return hid == historys.hid && Objects.equals(hjf, historys.hjf) && Objects.equals(htime, historys.htime) && Objects.equals(tos, historys.tos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hid, hjf, htime, tos);
    }

    @ManyToOne
    @JoinColumn(name = "sid", referencedColumnName = "sid")
    public Student getXue() {
        return xue;
    }

    public void setXue(Student xue) {
        this.xue = xue;
    }

    @ManyToOne
    @JoinColumn(name = "tid", referencedColumnName = "tid")
    public Subject getKmss() {
        return kmss;
    }

    public void setKmss(Subject kmss) {
        this.kmss = kmss;
    }
}
