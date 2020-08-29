package com.domin0x.BREFScraper.mapping;

import org.jsoup.nodes.Element;

import java.math.BigDecimal;
import java.util.Optional;

public class ElementParser {
    public static int getAsInt(Element element) {
        return Integer.parseInt(element.text().replaceAll(",", ""));
    }
    public static BigDecimal getAsBigDecimal(Element element) {return new BigDecimal(element.text());}
    public static Optional<Element> getOptionalLinkElement(Element element){
        return Optional.ofNullable(element.selectFirst("a"));
    }
}
