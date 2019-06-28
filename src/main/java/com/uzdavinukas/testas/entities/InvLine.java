package com.uzdavinukas.testas.entities;

import javax.persistence.*;

@Entity
@Table(name = "inv_lines")
public class InvLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    private int qty;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}