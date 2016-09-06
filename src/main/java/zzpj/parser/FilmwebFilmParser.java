package zzpj.parser;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import zzpj.entities.FilmEntity;

public class FilmwebFilmParser implements FilmParserInterface {

    private FilmEntity film;

    public FilmwebFilmParser(String url) throws IOException {
        Document htmlDoc = Jsoup.connect(url).get();
        Elements elements = htmlDoc.select("body");
        Element title = elements.select(".filmTitle").first();

        film = getByTitleIfExists(title.toString());

        if (film == null) {
            film = new FilmEntity();
            film.setTitle(title.text());
            Element description = elements.select(".filmPlot .text").first();
            film.setDescription(description.text());
        }
    }

    @Override
    public FilmEntity getFilm() {
        return this.film;
    }

    private FilmEntity getByTitleIfExists(String title) {
        HashMap columns = new HashMap();
        columns.put("title", title);
        return null;
    }

}
