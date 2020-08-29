package com.domin0x.BREFScraper.mapping.model;

import org.jsoup.nodes.Element;

import java.util.Date;

public class Player {

    private String name;
    private String externalId;
    private Integer weight;
    private Integer height;
    private Date dateOfBirth;

    public Player (Element element) {
        Element link = element.selectFirst("a");
        this.name = link.text();
        this.externalId = link.attr("href");
    }

    public String getName() {
        return name;
    }

    public String getExternalId() {
        return externalId;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}


