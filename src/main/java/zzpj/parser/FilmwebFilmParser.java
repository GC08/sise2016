package zzpj.parser;

import java.io.IOException;
import java.util.HashMap;
import org.jsoup.nodes.Element;
import zzpj.entities.FilmEntity;
import zzpj.entities.Entity;

public class FilmwebFilmParser extends Parser implements FilmParserInterface {

    private final String title;
    private final String description;

    public FilmwebFilmParser(String url) throws IOException {
        super(url);
        Element titleElement = elements.select(".filmTitle").first();
        Element descriptionElement = elements.select(".filmPlot .text").first();
        this.title = titleElement.text();
        this.description = descriptionElement.text();
    }

    @Override
    public FilmEntity getFilm() {
        FilmEntity film = getFilmByTitleIfExists(title);

        if (film == null) {
            film = new FilmEntity();
            film.setTitle(this.title);
            film.setDescription(this.description);
        }

        return film;
    }

    FilmEntity getFilmByTitleIfExists(String title) {
        HashMap columns = new HashMap();
        columns.put("title", title);

        return (FilmEntity) Entity.findOneByEntityAndColumns(new FilmEntity(), columns);
    }

}
