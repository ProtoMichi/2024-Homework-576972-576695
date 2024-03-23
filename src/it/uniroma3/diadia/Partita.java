package it.uniroma3.diadia;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Labirinto labirinto;
	private boolean finita;
	private Giocatore cfu;
	
	public Partita(){
		this.labirinto=new Labirinto();
		labirinto.creaStanze();
		this.finita = false;
		this.cfu = new Giocatore();
	}

public Labirinto getLabirinto() {
return this.labirinto;
}

public void setLabirinto(Labirinto labirinto) {
this.labirinto=labirinto;
}


	
	public Giocatore getGiocatore() {
	return cfu;
}

public void setCfu(Giocatore cfu) {
	this.cfu = cfu;
}

	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.labirinto.getStanzaCorrente()== this.labirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (cfu.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}


}
