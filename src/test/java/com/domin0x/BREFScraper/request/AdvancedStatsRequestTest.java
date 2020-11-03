package com.domin0x.BREFScraper.request;

import com.domin0x.BREFScraper.BasketballRefClient;
import com.domin0x.BREFScraper.HTMLDocumentService;
import com.domin0x.BREFScraper.TestUtil;
import com.domin0x.BREFScraper.mapping.model.AdvancedStats;
import com.domin0x.BREFScraper.mapping.model.SeasonType;
import org.jsoup.Jsoup;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AdvancedStatsRequestTest {
    @Mock
    HTMLDocumentService HTMLDocumentService;

    @InjectMocks
    private AdvancedStatsRequest request = BasketballRefClient.getAdvancedStatsRequest(SeasonType.REGULAR_SEASON, 2020);

    @Before
    public void setUp() throws IOException {
        String htmlContent = TestUtil.readTestData("AdvancedStatsFixture.html");
        when(HTMLDocumentService.getDocument(Mockito.any())).thenReturn(Jsoup.parse(htmlContent));
        request.setHTMLDocumentService(HTMLDocumentService);
    }

    @Test
    public void shouldHaveProperUri() {
        assertEquals("https://basketball-reference.com/leagues/NBA_2020_advanced.html",
                     request.getUri().toString());
    }

    @Test
    public void shouldReturnDefaultList() throws IOException {
        List<AdvancedStats> stats = request.execute();
        assertEquals(stats.size(),52);
    }

}
