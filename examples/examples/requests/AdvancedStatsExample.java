package examples.requests;

import com.domin0x.BREFScraper.BasketballRefClient;
import com.domin0x.BREFScraper.mapping.model.AdvancedStats;
import com.domin0x.BREFScraper.mapping.model.SeasonType;
import com.domin0x.BREFScraper.request.AdvancedStatsRequest;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class AdvancedStatsExample {
    public static void main(String [] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try(Writer writer = new FileWriter("AdvancedStats.csv", true)){
            StatefulBeanToCsv<AdvancedStats> beanToCsv = new StatefulBeanToCsvBuilder<AdvancedStats>(writer).build();
            for(var year = 2000; year <= 2020; year++){
                AdvancedStatsRequest request = BasketballRefClient.getAdvancedStatsRequest(SeasonType.REGULAR_SEASON, year);
                var stats = request.execute();
                beanToCsv.write(stats);
            }
        }
    }
}
