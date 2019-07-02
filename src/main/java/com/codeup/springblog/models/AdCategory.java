package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class AdCategory  {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Ad> ads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
