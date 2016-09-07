package zzpj;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CinemaParserApplicationTests {

    @Mock
    CinemaParserApplication cinemaParserApplicationTests; 

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

    @Test
    public void testQuery()  {
    	CinemaParserApplication t  = new CinemaParserApplication(); 
            boolean check = t.equals(isNotNull());
            assertTrue(check); 
            verify(t).equals(isNotNull()); 
    }
}
