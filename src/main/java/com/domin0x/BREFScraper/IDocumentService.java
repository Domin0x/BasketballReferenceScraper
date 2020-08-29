package com.domin0x.BREFScraper;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface IDocumentService {

    Document getDocument(String URL) throws IOException;
}
