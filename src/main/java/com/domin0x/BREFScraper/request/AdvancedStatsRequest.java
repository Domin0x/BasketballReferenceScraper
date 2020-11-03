package com.domin0x.BREFScraper.request;

import com.domin0x.BREFScraper.mapping.model.*;
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

public class AdvancedStatsRequest extends AbstractRequest<List<AdvancedStats>> {
    final SeasonType seasonType;
    final int year;

    public AdvancedStatsRequest(SeasonType seasonType, int year) {
        super(Map.of("seasonType", seasonType.getUriValue()
                    ,"year", String.valueOf(year)));
        this.seasonType = seasonType;
        this.year = year;
    }

    @Override
    public String createPath() {
        return buildPath("{seasonType}/NBA_{year}_advanced.html");
    }

    @Override
    public List<AdvancedStats> execute() throws IOException {
        Document document = getDocument();
        Elements elements = document.select("#advanced_stats > tbody > tr:not(.thead)");

        return elements.stream()
                .map(this::createStatLine)
                .collect(Collectors.toList());
    }

    private AdvancedStats createStatLine(Element element){
        Map<String, Element> colsMap =
                element.select("td").stream().collect(Collectors.toMap(e->e.attr("data-stat"), Function.identity()));

        return new AdvancedStats.Builder()
                .setTeam(new Team(colsMap.get("team_id")))
                .setPlayer(new Player(colsMap.get("player")))
                .setSeasonType(seasonType)
                .setYear(year)
                .setGamesPlayed(getAsInt(colsMap.get("g")))
                .setMp(getAsBigDecimal(colsMap.get("mp")))
                .setPer(getAsBigDecimal(colsMap.get("per")))
                .setTrueShootingPct(getAsBigDecimal(colsMap.get("ts_pct")))
                .setThreePointAttemptRate(getAsBigDecimal(colsMap.get("fg3a_per_fga_pct")))
                .setFreeThrowAttemptRate(getAsBigDecimal(colsMap.get("fta_per_fga_pct")))
                .setOffRebPct(getAsBigDecimal(colsMap.get("orb_pct")))
                .setDefRebPct(getAsBigDecimal(colsMap.get("drb_pct")))
                .setTotalRebPct(getAsBigDecimal(colsMap.get("trb_pct")))
                .setAssistPct(getAsBigDecimal(colsMap.get("ast_pct")))
                .setStealPct(getAsBigDecimal(colsMap.get("stl_pct")))
                .setBlockPct(getAsBigDecimal(colsMap.get("blk_pct")))
                .setTurnOverPct(getAsBigDecimal(colsMap.get("tov_pct")))
                .setUsagePct(getAsBigDecimal(colsMap.get("usg_pct")))
                .setOffWinShares(getAsBigDecimal(colsMap.get("ows")))
                .setDefWinShares(getAsBigDecimal(colsMap.get("dws")))
                .setWinShares(getAsBigDecimal(colsMap.get("ws")))
                .setWinSharesPer48(getAsBigDecimal(colsMap.get("ws_per_48")))
                .setOffBoxPlusMinus(getAsBigDecimal(colsMap.get("obpm")))
                .setDefBoxPlusMinus(getAsBigDecimal(colsMap.get("dbpm")))
                .setBoxPlusMinus(getAsBigDecimal(colsMap.get("bpm")))
                .setValueOverReplacement(getAsBigDecimal(colsMap.get("vorp")))
                .build();
    }

}
