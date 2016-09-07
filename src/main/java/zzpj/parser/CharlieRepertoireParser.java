/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzpj.parser;

import java.io.IOException;

/**
 *
 * @author gciolek
 */
public class CharlieRepertoireParser extends RepertoireParser {

    public CharlieRepertoireParser(String url) throws IOException {
        super("http://lodz.repertuary.pl/charlie");
    }

    @Override
    String getFilmTitleSelector() {
        return ".cinema_film a";
    }

}
