package examples.requests;

import com.domin0x.BREFScraper.BasketballRefClient;
import com.domin0x.BREFScraper.mapping.model.PerGameStats;
import com.domin0x.BREFScraper.mapping.model.SeasonType;
import com.domin0x.BREFScraper.request.PerGameStatsRequest;

import java.io.IOException;

public class PerGameStatsExample {
    public static void main(String [] args) throws IOException {
        PerGameStatsRequest request = BasketballRefClient.getBaseStatsRequest(SeasonType.REGULAR_SEASON, 2020);
        var stats= request.execute();

        System.out.println(stats.size());
        stats.stream()
                .filter(s -> s.getTeam().getAbbreviation().equals("TOT"))
                .map(PerGameStats::getTeam)
                .forEach(System.out::println);

    }
}
