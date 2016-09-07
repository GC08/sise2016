package zzpj.parser;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import zzpj.entities.FilmEntity;

public class FilmwebFilmParser implements FilmParserInterface {

    private final String title;
    private final String description;

    public FilmwebFilmParser(String url) throws IOException {
        Document htmlDoc = Jsoup.connect(url).get();
        Elements elements = htmlDoc.select("body");
        Element titleElement = elements.select(".filmTitle").first();
        Element descriptionElement = elements.select(".filmPlot .text").first();
        this.title = titleElement.text();
        this.description = descriptionElement.text();

    }

    @Override
    public FilmEntity getFilm() {
        FilmEntity film = getByTitleIfExists(title.toString());

        if (film == null) {
            film = new FilmEntity();
            film.setTitle(this.title);
            film.setDescription(this.description);
        }
        
        return film;
    }

    private FilmEntity getByTitleIfExists(String title) {
        HashMap columns = new HashMap();
        columns.put("title", title);
        return null;
    }

}
