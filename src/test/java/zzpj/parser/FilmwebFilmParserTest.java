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
		
		FilmParserInterface filmParserInterface=Mockito.mock(FilmParserInterface.class);
		
        when(filmParserInterface.getFilm()).thenReturn(spy);

        assertEquals(filmParserInterface.getFilm(), spy);
		
	}
	
	@Test
	public void test2() {
		
		FilmEntity filmEntity = new FilmEntity();
		FilmEntity spy = spy(filmEntity);
		
		Film filmParserInterface=Mockito.mock(FilmParserInterface.class);
		
        when(filmParserInterface.getFilm()).thenReturn(spy);

        assertEquals(filmParserInterface.getFilm(), spy);
		
	}

}