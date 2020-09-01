package com.domin0x.BREFScraper.mapping;

import org.jsoup.nodes.Element;

import java.math.BigDecimal;
import java.util.Optional;

public class ElementParser {
    private static final String ZERO = "0";

    public static int getAsInt(Element element) {
        return Integer.parseInt(replaceNullOrEmpty(element.text(), ZERO));
    }

    public static BigDecimal getAsBigDecimal(Element element) {
        return new BigDecimal(replaceNullOrEmpty(element.text(), ZERO));
    }

    public static Optional<Element> getOptionalLinkElement(Element element){
        return Optional.ofNullable(element.selectFirst("a"));
    }

    private static String replaceNullOrEmpty(String value, String fallBack) {
        return isNullOrEmpty(value) ? fallBack : value;
    }

    private static boolean isNullOrEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
