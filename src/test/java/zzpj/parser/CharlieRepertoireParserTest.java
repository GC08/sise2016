package zzpj.parser;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class CharlieRepertoireParserTest {

	@Test
	public void test1() {
			
		CharlieRepertoireParser charlie=Mockito.mock(CharlieRepertoireParser.class);
		
        when(charlie.getFilmTitleSelector()).thenReturn(".cinema_film a");

        assertEquals(charlie.getFilmTitleSelector(), ".cinema_film a");
		
	}
}
