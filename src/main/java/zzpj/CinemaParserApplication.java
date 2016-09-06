package zzpj;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaParserApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(CinemaParserApplication.class, args);

        Document htmlDoc = Jsoup.connect("http://www.filmweb.pl/film/%C5%BBo%C5%82nierze+kosmosu+II-2004-109485").get();
        Elements elements = htmlDoc.select("body");
        Element element = elements.select(".filmPlot .text").first();
        System.out.println(element.text());
    }
}
