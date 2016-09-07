package zzpj.parser;


import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;


public class CinemaCityRepertoireParserTest {

	@Test
	public void test1() {
			
		CinemaCityRepertoireParser cinemaCity=Mockito.mock(CinemaCityRepertoireParser.class);
		
        when(cinemaCity.getFilmTitleSelector()).thenReturn(".featurePosterTitle");

        assertEquals(cinemaCity.getFilmTitleSelector(), ".featurePosterTitle");
		
	}
}