package com.domin0x.BREFScraper;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestUtil {
    private static final String HTML_DIRECTORY = "src/test/html/";

    public static String readTestData(String fileName) throws IOException {
        return readFromFile(new File(HTML_DIRECTORY, fileName));
    }

    private static String readFromFile(File file) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        StringBuilder out = new StringBuilder();
        String line;

        while ((line = in.readLine()) != null) {
            out.append(line);
        }

        in.close();

        return out.toString();
    }
}
