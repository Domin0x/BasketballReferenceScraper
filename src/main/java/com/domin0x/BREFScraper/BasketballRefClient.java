package com.domin0x.BREFScraper;

import com.domin0x.BREFScraper.mapping.model.SeasonType;
import com.domin0x.BREFScraper.request.PerGameStatsRequest;

public class BasketballRefClient {
    public final static String SCHEME = "https";
    public final static String HOST = "basketball-reference.com";
    public final static HTMLDocumentService DEFAULT_DOCUMENT_SERVICE = new HTMLDocumentService();

    public BasketballRefClient() {
    }

    public static PerGameStatsRequest getBaseStatsRequest(SeasonType seasonType, int year) {
        return new PerGameStatsRequest(seasonType, year);
    }

}
