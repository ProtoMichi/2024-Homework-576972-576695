package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {
private Borsa borsa;
private Attrezzo attrezzo;
private Attrezzo attrezzo2;

	@Before
	public void setUp(){
	borsa=new Borsa(10);
	attrezzo=new Attrezzo("penna",1);
	attrezzo2=new Attrezzo("quaderno",5);
	borsa.addAttrezzo(attrezzo2);
	}

	@Test
	public void addAttrezzoTest() {
	assertTrue(borsa.addAttrezzo(attrezzo));
	}
	
	@Test
	public void getAttrezzoTest() {
	assertEquals("quaderno",borsa.getAttrezzo("quaderno").getNome());
	}

}
