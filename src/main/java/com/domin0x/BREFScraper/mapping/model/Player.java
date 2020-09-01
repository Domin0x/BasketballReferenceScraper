package com.domin0x.BREFScraper.mapping.model;

import org.jsoup.nodes.Element;

public class Player {

    private String name;
    private String externalId;

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
}


