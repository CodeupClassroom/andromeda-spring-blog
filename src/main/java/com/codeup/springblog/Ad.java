package com.codeup.springblog;

import javax.persistence.*;

@Entity
@Table(name = "ads")
public class Ad {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "INT unsigned NOT NULL AUTO_INCREMENT")
    private long id;

    @Column(nullable = false, unique = true, length = 300)
    private String title;



    private String description;

    private int priceInCents;

}
