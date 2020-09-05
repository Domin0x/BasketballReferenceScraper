package com.domin0x.BREFScraper.mapping.model;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static com.domin0x.BREFScraper.ElementHelper.createFromStringHTML;
import static org.junit.Assert.assertEquals;


public class TeamTest {
    final String NORMAL_TEAM_ELEMENT = "<td><a href=\"/teams/OKC/2020.html\">OKC</a></td>";
    final String TOTAL_TEAM_ELEMENT = "<td class=\"left \" data-stat=\"team_id\">TOT</td>";

    @Test
    public void TestNormalTeamConstructor(){
        Element element = createFromStringHTML(NORMAL_TEAM_ELEMENT);
        Team team = new Team(element);

        assertEquals("OKC", team.getAbbreviation());
        assertEquals("/teams/OKC/2020.html", team.getExternalId());
    }

    @Test
    public void TestTOTALTeamConstructor(){
        Element element = createFromStringHTML(TOTAL_TEAM_ELEMENT);
        Team team = new Team(element);

        assertEquals(Team.TOTAL_ABBREVIATION, team.getAbbreviation());
        assertEquals("", team.getExternalId());
    }

}
