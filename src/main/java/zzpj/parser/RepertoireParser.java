package zzpj.parser;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

abstract public class RepertoireParser extends Parser {

    protected ArrayList<String> filmTitles = new ArrayList<>();

    /**
     *
     * @throws IOException
     */
    public RepertoireParser(String url) throws IOException {
        super(url);
        Elements filmTitlesElements;
        filmTitlesElements = this.elements.select(this.getFilmTitleSelector());

        for (Element filmTitle : filmTitlesElements) {
            this.filmTitles.add(filmTitle.text());
        }
    }

    public ArrayList<String> getFilmTitles() {
        return this.filmTitles;
    }

    abstract String getFilmTitleSelector();
}
