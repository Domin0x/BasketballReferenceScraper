package com.domin0x.BREFScraper.mapping.model;

import com.domin0x.BREFScraper.mapping.ElementParser;
import com.opencsv.bean.CsvBindByName;
import org.jsoup.nodes.Element;

import java.util.Optional;

public class Team {
    /*used in the Team column when a statline represents data of a player who played for multiple teams(for example
    was traded mid-season)*/
    public static final String TOTAL_ABBREVIATION = "TOT";

    @CsvBindByName(column = "teamId")
    private String externalId;
    @CsvBindByName(column = "abbreviation")
    private String abbreviation;

    public Team (Element parentElement){
        Optional<Element> optionalLink = ElementParser.getOptionalLinkElement(parentElement);
        this.abbreviation = optionalLink.map(Element::text).orElse(parentElement.text());
        this.externalId = optionalLink.map(link -> link.attr("href")).orElse("");
    }

    public String getExternalId() {
        return externalId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return "Team{" +
                "externalId='" + externalId + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
