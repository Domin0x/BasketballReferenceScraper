package com.domin0x.BREFScraper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class HTMLDocumentService implements IDocumentService {
    /**
     * jsoup's Connection.Request parameter, specified in bytes, zero means unlimited
     * */
    private static final int MAX_BODY_SIZE = 0;

    public HTMLDocumentService() {
    }

    public Document getDocument(String url) throws IOException {
        Connection conn = Jsoup.connect(url).maxBodySize(MAX_BODY_SIZE);
        return conn.get();
    }
}