package examples.requests;

import com.domin0x.BREFScraper.BasketballRefClient;
import com.domin0x.BREFScraper.mapping.model.SeasonType;
import com.domin0x.BREFScraper.request.PerGameStatsRequest;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PerGameStatsExample {
    public static void main(String [] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        try(Writer writer = new FileWriter("PerGameStats.csv", true)){
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            for(int i = 1990; i<=2020; i++){
                PerGameStatsRequest request = BasketballRefClient.getBaseStatsRequest(SeasonType.PLAYOFFS, i);
                var stats= request.execute();
                beanToCsv.write(stats);
            }
        }
    }
}
