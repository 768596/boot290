package com.study.pojo;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

/*
 * @author SMILE.Huang
 * @date 2021-06-07 10:02
 */
@Entity
public class Product {
    /*一个产品对应多条订单详情*/
    private List<Ordetails> details;
    private Integer id;
    private String productname;
    private String descs;
    private Category mylei;/*表示当前产品所属列表信息*/

    @OneToMany(mappedBy = "myproduct")
    public List<Ordetails> getDetails() {
        return details;
    }

    public void setDetails(List<Ordetails> details) {
        this.details = details;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*主键自增策略制定*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "productname")
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Basic
    @Column(name = "descs")
    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(productname, product.productname) &&
                Objects.equals(descs, product.descs) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productname, descs);
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "id", nullable = false)
    public Category getMylei() {
        return mylei;
    }

    public void setMylei(Category mylei) {
        this.mylei = mylei;
    }
}
