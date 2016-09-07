package zzpj.parser;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {

    public Elements elements;

    public Parser(String url) throws IOException {
        Document htmlDoc = Jsoup.connect(url).get();
        this.elements = htmlDoc.select("body");
    }

}
