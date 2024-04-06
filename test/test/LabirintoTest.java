package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {
private Labirinto labirinto;
private Stanza stanza;

	@Before
	public void setUp() {
	labirinto=new Labirinto();
	labirinto.creaStanze();
	stanza=new Stanza("Bar");
	}

	@Test
	public void getStanzaVincenteTest() {
    assertEquals("Biblioteca",labirinto.getStanzaVincente().getNome());
	}
	
	@Test
	public void setStanzaCorrenteTest() {
	labirinto.setStanzaCorrente(stanza);
	assertEquals("Bar",labirinto.getStanzaCorrente().getNome());
	}

}
