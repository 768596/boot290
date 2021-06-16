package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Subject {
    private int tid;
    private String tname;
    private List<Banji> banjis;
    private List<Historys> jilu;

    @Override
    public String toString() {
        return "Subject{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    @Id
    @Column(name = "tid")
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "tname")
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return tid == subject.tid && Objects.equals(tname, subject.tname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tid, tname);
    }

    @ManyToMany
    @JoinTable(name = "kcxzb", catalog = "", schema = "tr02005", joinColumns = @JoinColumn(name = "tid", referencedColumnName = "tid", nullable = false), inverseJoinColumns = @JoinColumn(name = "bid", referencedColumnName = "bid", nullable = false))
    public List<Banji> getBanjis() {
        return banjis;
    }

    public void setBanjis(List<Banji> banjis) {
        this.banjis = banjis;
    }

    @OneToMany(mappedBy = "kmss")
    public List<Historys> getJilu() {
        return jilu;
    }

    public void setJilu(List<Historys> jilu) {
        this.jilu = jilu;
    }
}
