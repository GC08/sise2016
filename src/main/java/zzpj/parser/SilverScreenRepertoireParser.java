package zzpj.parser;

import java.io.IOException;

public class SilverScreenRepertoireParser extends RepertoireParser {

    public SilverScreenRepertoireParser(String url) throws IOException {
        super(url);
    }

    @Override
    String getFilmTitleSelector() {
        return ".cinema_film a";
    }
}
