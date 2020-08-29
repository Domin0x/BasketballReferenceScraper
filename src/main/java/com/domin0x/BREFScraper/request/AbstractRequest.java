package com.domin0x.BREFScraper.request;

import com.domin0x.BREFScraper.BasketballRefClient;
import com.domin0x.BREFScraper.HTMLDocumentService;
import org.apache.hc.core5.net.URIBuilder;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Map;

public abstract class AbstractRequest <T> {
    private HTMLDocumentService HTMLDocumentService;
    private URI uri;
    private Map<String, String> pathParams;

    protected AbstractRequest(){
        this(Collections.emptyMap());
    }

    protected AbstractRequest(Map<String,String> map){
        HTMLDocumentService = new HTMLDocumentService();
        pathParams = map;
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme(BasketballRefClient.SCHEME)
                  .setHost(BasketballRefClient.HOST)
                  .setPath(createPath());
        try {
            this.uri = uriBuilder.build();
        }catch (URISyntaxException e){
            e.printStackTrace(); //TODO Logger
        }
    }
    public abstract T execute() throws IOException;

    protected abstract String createPath();

    protected final String buildPath(String pathTemplate){
        String path = pathTemplate;
        for(Map.Entry<String,String> entry: pathParams.entrySet())
            path = path.replaceAll("\\{" + entry.getKey() + "}", entry.getValue());

        return path;
    }

    protected Document getDocument() throws IOException {
        return HTMLDocumentService.getDocument(this.uri.toString());
    }

    public void setHTMLDocumentService(HTMLDocumentService HTMLDocumentService) {
        this.HTMLDocumentService = HTMLDocumentService;
    }
}
