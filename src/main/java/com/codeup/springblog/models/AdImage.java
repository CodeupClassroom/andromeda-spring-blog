package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
public class AdImage {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn (name = "ad_id")
    private Ad ad;

}
