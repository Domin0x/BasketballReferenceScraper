package com.domin0x.BREFScraper.mapping.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class ElementHelper {
    static Element createFromStringHTML(String html){
        return Jsoup.parse(html, "", Parser.htmlParser());
    }
}
