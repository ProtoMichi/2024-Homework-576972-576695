package it.uniroma3.diadia.giocatore;

public class Giocatore {
	private int cfu;
	static final private int CFU_INIZIALI = 20;
	private Borsa borsa;

	public Borsa getBorsa() {
		return borsa;
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}

	public Giocatore() {
	this.cfu=CFU_INIZIALI;
	this.borsa=new Borsa();
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	
}
