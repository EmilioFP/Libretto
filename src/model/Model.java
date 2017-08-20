package model;

import libretto.db.EsameDAO;

public class Model {
		
    /**
     * Aggiunge un nuovo esame all'elenco degli esami presenti
     * verificando che non ci sia già
     * @param e
     * @return true se l'ha inserto, false se esisteva già e quindi non inserito
    */
	public boolean addEsame(Esame e) {
		
		EsameDAO dao = new EsameDAO();
					
		return dao.create(e);
	}
	/**
	 * Ricerca se esite un esame con il codice specificato.
	 * Se esiste, lo restituisce, altrimenti restituisce null.
	 * @param codice codice dell'esame da ricercare
	 * @return esame trovato, oppure null se non trovato
	 */
	public Esame trovaEsame(String codice) {
		
		EsameDAO dao = new EsameDAO();
		
		Esame e = dao.find(codice);
		
		return e;
	}

}
