package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	private Giocatore cfu;

	@Before
	public void setUp(){
		cfu=new Giocatore();
	}

	@Test
	public void getCfuTest() {
		assertEquals(20,cfu.getCfu());
	}

	@Test
	public void setCfuTest() {
		cfu.setCfu(0);
		assertEquals(0,cfu.getCfu());
	}

}
