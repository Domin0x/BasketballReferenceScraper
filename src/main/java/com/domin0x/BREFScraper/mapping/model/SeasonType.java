package com.domin0x.BREFScraper.mapping.model;

public enum SeasonType {

    REGULAR_SEASON("leagues", "regular season"),
    PLAYOFFS("playoffs", "playoffs");

    SeasonType(String uriValue, String name){
        this.uriValue = uriValue;
        this.name = name;
    }

    private final String uriValue;
    private final String name;

    public String getUriValue() {
        return uriValue;
    }

    public String getName() {
        return name;
    }
}
