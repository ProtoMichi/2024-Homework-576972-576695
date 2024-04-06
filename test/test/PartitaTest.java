package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

public class PartitaTest {
private Partita partita;
private Stanza corrente;
private Giocatore cfu;

	@Before
	public void setUp() {
	partita=new Partita();
	cfu=new Giocatore();
	corrente=partita.getLabirinto().getStanzaCorrente();
	cfu.setCfu(0);
	}

	@Test
	public void isNotVintaTest() {
	assertNotEquals(corrente.getNome(),"Biblioteca");
	}
	
	@Test
	public void isVintaTest() {
	corrente=new Stanza("Biblioteca");
	partita.getLabirinto().setStanzaCorrente(corrente);
	assertEquals(corrente.getNome(),"Biblioteca");
	}
	
	@Test
	public void isNotFinitaTest() {
		corrente=new Stanza("Biblioteca");
		partita.getLabirinto().setStanzaCorrente(corrente);
		assertFalse(partita.isFinita());
	}
	
	@Test
	public void isFinitaTest() {
		corrente=new Stanza("Biblioteca");
		partita.getLabirinto().setStanzaCorrente(corrente);
		partita.setCfu(cfu);
		assertTrue(partita.isFinita());
	}

}
