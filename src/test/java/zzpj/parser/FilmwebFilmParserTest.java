package zzpj.parser;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import zzpj.entities.FilmEntity;

public class FilmwebFilmParserTest {

	@Test
	public void test1() {
		
		FilmEntity filmEntity = new FilmEntity();
		FilmEntity spy = spy(filmEntity);
		
		String title = "Inside Out";
		
		FilmwebFilmParser filmwebFilmParser=Mockito.mock(FilmwebFilmParser.class);
		
        when(filmwebFilmParser.getFilmByTitleIfExists(title)).thenReturn(spy);

        assertEquals(filmwebFilmParser.getFilmByTitleIfExists(title), spy);
		
	}
	
	@Test
	public void test2() {
		
		FilmEntity filmEntity = new FilmEntity();
		FilmEntity spy = spy(filmEntity);
		
		FilmwebFilmParser filmwebFilmParser=Mockito.mock(FilmwebFilmParser.class);
		
        when(filmwebFilmParser.getFilm()).thenReturn(spy);

        assertEquals(filmwebFilmParser.getFilm(), spy);
		
	}

}