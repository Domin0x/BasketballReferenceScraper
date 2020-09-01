package com.domin0x.BREFScraper.mapping.model;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static com.domin0x.BREFScraper.mapping.model.ElementHelper.createFromStringHTML;
import static org.junit.Assert.assertEquals;


public class PlayerTest {
    final String ELEMENT = "<td class=\"left \" data-append-csv=\"adamsst01\" data-stat=\"player\" csk=\"Adams,Steven\"><a href=\"/players/a/adamsst01.html\">Steven Adams</a></td>";

    @Test
    public void TestValidPlayerConstructor(){
        Element element = createFromStringHTML(ELEMENT);
        Player player = new Player(element);

        assertEquals("Steven Adams", player.getName());
        assertEquals("/players/a/adamsst01.html", player.getExternalId());
    }
}
