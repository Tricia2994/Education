package com.codecademy.boots.entities;

import com.codecademy.boots.enums.BootType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Boot {

    @Entity

    @Table(name = "BOOTS")
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "TYPE")
    private BootType type;

    public BootType getType() {
        return this.type;
    }

    public void setType(BootType type) {
        this.type = type;
    }

    @Column(name = "SIZE")
    private Float size;

    public Float getSize() {
        return this.size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    @Column(name = "QUANTITY")
    private Integer quantity;

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "MATERIAL")
    @Enumerated(EnumType.STRING)
    private String material;

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
