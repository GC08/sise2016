package zzpj.parser;

import java.io.IOException;

public class CinemaCityRepertoireParser extends RepertoireParser {

    public CinemaCityRepertoireParser(String url) throws IOException {
        super("https://www.cinema-city.pl/Manufaktura");
    }

    @Override
    String getFilmTitleSelector() {
        return ".featurePosterTitle";
    }

}
