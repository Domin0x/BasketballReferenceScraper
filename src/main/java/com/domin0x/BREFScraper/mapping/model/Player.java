package com.domin0x.BREFScraper.mapping.model;

import com.opencsv.bean.CsvBindByName;
import org.jsoup.nodes.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

    @CsvBindByName
    private String name;
    @CsvBindByName(column ="playerId")
    private String externalId;

    public Player (Element element) {
        Element link = element.selectFirst("a");
        this.name = link.text();
        this.externalId = extractPlayerId(link);
    }

    public String getName() {
        return name;
    }

    public String getExternalId() {
        return externalId;
    }

    private String extractPlayerId(Element aHref){
        String text = aHref.attr("href");
        Pattern pattern = Pattern.compile("/players/.{1}/(.*)(\\.html)");
        Matcher matcher = pattern.matcher(text);

        return matcher.find() ? matcher.group(1) : "";
    }
}


