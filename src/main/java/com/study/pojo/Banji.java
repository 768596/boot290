package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Banji {
    private int bid;
    private String bname;
    private String buser;
    private String badds;
    private List<Subject> kms;
    private List<Student> xuesheng;

    @Override
    public String toString() {
        return "Banji{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", buser='" + buser + '\'' +
                ", badds='" + badds + '\'' +
                '}';
    }

    @Id
    @Column(name = "bid")
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Basic
    @Column(name = "bname")
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Basic
    @Column(name = "buser")
    public String getBuser() {
        return buser;
    }

    public void setBuser(String buser) {
        this.buser = buser;
    }

    @Basic
    @Column(name = "badds")
    public String getBadds() {
        return badds;
    }

    public void setBadds(String badds) {
        this.badds = badds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banji banji = (Banji) o;
        return bid == banji.bid && Objects.equals(bname, banji.bname) && Objects.equals(buser, banji.buser) && Objects.equals(badds, banji.badds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, bname, buser, badds);
    }

    @ManyToMany(mappedBy = "banjis")
    public List<Subject> getKms() {
        return kms;
    }

    public void setKms(List<Subject> kms) {
        this.kms = kms;
    }

    @OneToMany(mappedBy = "banji")
    public List<Student> getXuesheng() {
        return xuesheng;
    }

    public void setXuesheng(List<Student> xuesheng) {
        this.xuesheng = xuesheng;
    }
}
