package com.domin0x.BREFScraper.request;

import com.domin0x.BREFScraper.mapping.model.PerGameStats;
import com.domin0x.BREFScraper.mapping.model.Player;
import com.domin0x.BREFScraper.mapping.model.SeasonType;
import com.domin0x.BREFScraper.mapping.model.Team;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.domin0x.BREFScraper.mapping.ElementParser.getAsBigDecimal;
import static com.domin0x.BREFScraper.mapping.ElementParser.getAsInt;

public class PerGameStatsRequest extends AbstractRequest<List<PerGameStats>> {
    final SeasonType seasonType;
    final int year;

    public PerGameStatsRequest(SeasonType seasonType, int year) {
        super(Map.of("seasonType", seasonType.getUriValue()
                    ,"year", String.valueOf(year)));
        this.seasonType = seasonType;
        this.year = year;
    }

    @Override
    public String createPath() {
        return buildPath("{seasonType}/NBA_{year}_per_game.html");
    }

    @Override
    public List<PerGameStats> execute() throws IOException {
        Document document = getDocument();
        Elements elements = document.select("#per_game_stats > tbody > tr:not(.thead)");

        return elements.stream()
                .map(this::createStatLine)
                .collect(Collectors.toList());
    }

    private PerGameStats createStatLine(Element element){
        Map<String, Element> colsMap =
                element.select("td").stream().collect(Collectors.toMap(e->e.attr("data-stat"), Function.identity()));

        return new PerGameStats.Builder()
                .setTeam(new Team(colsMap.get("team_id")))
                .setPlayer(new Player(colsMap.get("player")))
                .setSeasonType(seasonType)
                .setYear(year)
                .setGamesPlayed(getAsInt(colsMap.get("g")))
                .setGamesStarted(getAsInt(colsMap.get("gs")))
                .setMp(getAsBigDecimal(colsMap.get("mp_per_g")))
                .setFgm(getAsBigDecimal(colsMap.get("fg_per_g")))
                .setFga(getAsBigDecimal(colsMap.get("fga_per_g")))
                .setFg3m(getAsBigDecimal(colsMap.get("fg3_per_g")))
                .setFg3a(getAsBigDecimal(colsMap.get("fg3a_per_g")))
                .setFtm(getAsBigDecimal(colsMap.get("ft_per_g")))
                .setFta(getAsBigDecimal(colsMap.get("fta_per_g")))
                .setOreb(getAsBigDecimal(colsMap.get("orb_per_g")))
                .setDreb(getAsBigDecimal(colsMap.get("drb_per_g")))
                .setReb(getAsBigDecimal(colsMap.get("trb_per_g")))
                .setAst(getAsBigDecimal(colsMap.get("ast_per_g")))
                .setBlk(getAsBigDecimal(colsMap.get("blk_per_g")))
                .setStl(getAsBigDecimal(colsMap.get("stl_per_g")))
                .setTov(getAsBigDecimal(colsMap.get("tov_per_g")))
                .setPf(getAsBigDecimal(colsMap.get("pf_per_g")))
                .setPts(getAsBigDecimal(colsMap.get("pts_per_g")))
                .setFg_pct(getAsBigDecimal(colsMap.get("fg_pct")))
                .setFg3_pct(getAsBigDecimal(colsMap.get("fg3_pct")))
                .setFt_pct(getAsBigDecimal(colsMap.get("ft_pct")))
                .build();
    }

}
