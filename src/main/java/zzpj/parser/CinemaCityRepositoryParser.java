package zzpj.parser;

import java.io.IOException;

public class CinemaCityRepositoryParser extends RepertoireParser {

    public CinemaCityRepositoryParser(String url) throws IOException {
        super("https://www.cinema-city.pl/Manufaktura");
    }

    @Override
    String getFilmTitleSelector() {
        return ".featurePosterTitle";
    }

}
