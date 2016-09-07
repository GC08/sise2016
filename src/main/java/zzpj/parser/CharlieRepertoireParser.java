package zzpj.parser;

import java.io.IOException;

public class CharlieRepertoireParser extends RepertoireParser {

    public CharlieRepertoireParser(String url) throws IOException {
        super("http://lodz.repertuary.pl/charlie");
    }

    @Override
    String getFilmTitleSelector() {
        return ".cinema_film a";
    }

}
