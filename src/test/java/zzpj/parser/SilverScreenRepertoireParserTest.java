package zzpj.parser;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class SilverScreenRepertoireParserTest {

	@Test
	public void test1() {
			
		SilverScreenRepertoireParser silverScreen=Mockito.mock(SilverScreenRepertoireParser.class);
		
        when(silverScreen.getFilmTitleSelector()).thenReturn(".cinema_film a");

        assertEquals(silverScreen.getFilmTitleSelector(), ".cinema_film a");
		
	}
}
