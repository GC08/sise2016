package zzpj.parser;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import zzpj.entities.FilmEntity;

public class FilmwebFilmParserTest {

    @Test
    public void test1() {

        FilmEntity filmEntity = new FilmEntity();
        FilmEntity spy = spy(filmEntity);

        String title = "http://www.filmweb.pl/film/%C5%BBo%C5%82nierze+kosmosu-1997-207#";

        FilmwebFilmParser filmwebFilmParser = Mockito.mock(FilmwebFilmParser.class);

        when(filmwebFilmParser.getFilmByTitleIfExists(title)).thenReturn(spy);

        assertEquals(filmwebFilmParser.getFilmByTitleIfExists(title), spy);

    }

    @Test
    public void test2() {

        FilmEntity filmEntity = new FilmEntity();
        FilmEntity spy = spy(filmEntity);

        FilmwebFilmParser filmwebFilmParser = Mockito.mock(FilmwebFilmParser.class);

        when(filmwebFilmParser.getFilm()).thenReturn(spy);

        assertEquals(filmwebFilmParser.getFilm(), spy);

    }

    @Test
    public void test3() throws IOException {

        FilmwebFilmParser filmParser = new FilmwebFilmParser("http://www.filmweb.pl/film/%C5%BBo%C5%82nierze+kosmosu-1997-207");
        FilmEntity film = filmParser.getFilm();
        String title = film.getTitle();
        //when(title).thenReturn("Żołnierze kosmosu");
        assertEquals(title, "Żołnierze kosmosu");

    }

    @Test
    public void test4() throws IOException {

        FilmwebFilmParser filmParser = new FilmwebFilmParser("http://www.filmweb.pl/film/%C5%BBo%C5%82nierze+kosmosu-1997-207");
        FilmEntity film = filmParser.getFilm();
//        when(film.getDescription()).thenReturn("Grupa szkolnych przyjaciół wstępuje do armii, co gwarantuje im obywatelstwo i różne przywileje. Wkrótce stawiają czoła najeźdźcom z kosmosu, olbrzymim pajęczakom. ");
        assertEquals(film.getDescription(), "Grupa szkolnych przyjaciół wstępuje do armii, co gwarantuje im obywatelstwo i różne przywileje. Wkrótce stawiają czoła najeźdźcom z kosmosu, olbrzymim pajęczakom. ");

    }

}
