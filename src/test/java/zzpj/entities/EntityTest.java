package zzpj.entities;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class EntityTest {

	@Test
	public void test1() {
		
		Entity entity=Mockito.mock(Entity.class);
		
        when(entity.getAllQuery()).thenReturn("SELECT * FROM title");

        assertEquals(entity.getAllQuery(), "SELECT * FROM title");
		
	}

}
