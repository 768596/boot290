package com.study.pojo;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Student {
    private int sid;
    private String sname;
    private String sex;
    private Date sbirth;
    private Banji banji;
    private List<Historys> lishi;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", sbirth=" + sbirth +
                '}';
    }

    @Id
    @Column(name = "sid")
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "sbirth")
    public Date getSbirth() {
        return sbirth;
    }

    public void setSbirth(Date sbirth) {
        this.sbirth = sbirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(sname, student.sname) && Objects.equals(sex, student.sex) && Objects.equals(sbirth, student.sbirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, sex, sbirth);
    }

    @ManyToOne
    @JoinColumn(name = "bid", referencedColumnName = "bid")
    public Banji getBanji() {
        return banji;
    }

    public void setBanji(Banji banji) {
        this.banji = banji;
    }

    @OneToMany(mappedBy = "xue")
    public List<Historys> getLishi() {
        return lishi;
    }

    public void setLishi(List<Historys> lishi) {
        this.lishi = lishi;
    }
}
