package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {
	private Stanza stanza;
	private Stanza stanza2;
	private Attrezzo attrezzo;
	private String[] direzioni;
	
	@Before
	public void setUp() {
		stanza=new Stanza("Bar");
		stanza2=new Stanza("Aula Campus");
		attrezzo=new Attrezzo("penna",1);
	}

	@Test
	public void impostaStanzaAdiacenteTest() {
		this.stanza.impostaStanzaAdiacente("nord",stanza2);
		assertEquals("Aula Campus",this.stanza.getStanzaAdiacente("nord").getNome());
	}

	@Test
	public void addAttrezzoTest() {
		assertTrue(stanza.addAttrezzo(attrezzo));
	}

	@Test
	public void hasAttrezzoTest() {
		this.stanza.addAttrezzo(attrezzo);
		assertTrue(stanza.hasAttrezzo("penna"));
	}

	@Test
	public void getAttrezzoTest() {
		this.stanza.addAttrezzo(attrezzo);
		assertEquals("penna",this.stanza.getAttrezzo("penna").getNome());
	}

	@Test
	public void getDirezioni() {
    direzioni=stanza.getDirezioni();
    for(int i=0;i<direzioni.length;i++)
    assertEquals("nord",direzioni[i]);
	}
}
