

/**
 * class Pruefungsleistung
 *@author winnie
 *@version 4-7-2020
 */
public class Pruefungsleistung {
	private String modul;
	private String pruefer;
	private double ergebnis;
	
/**
 * Der Konstruktotr
 */
	 Pruefungsleistung(String modul, String pruefer, double ergebnis){
		 this.modul=modul;
		 this.pruefer=pruefer;
		 this.ergebnis=ergebnis;
		 
	 }
	 
	 /**
	  * diese Methode gibt der Modul zueruck
	  * @return  modul von Student
	  */
	 public String getModul() {
		 return modul;
	 }
	 
	 /**
	  * diese Methode gibt der Pruefer zueruck
	  * @return  pruefer eines Moduls
	  */
	 public String getPruefer() {
		 return pruefer;
	 }
	 
	 /**
	  * diese Methode gibt der Ergebnis zueruck
	  * @return ergebnis in prozent
	  */
	 public double getErgebnis() {
		 return ergebnis;
	 }
	 
    /**
     * diese Methode ersetzt der Vorname
     * @param e Resulat in prozent
     * 
     */
	 public void setErgebnis(double e) {
		 this.ergebnis=e;
	 }
	  
	 
	/**
	 * diese Methode gibt der Modul,Pruefer,Ergebnis zueruck
	 * @return alles in allem
		 */
	public String toString() {
		 
		 
		return 
				
				 "\n\nModul\t\t :" + modul + "\n"+
				 "Pruefer\t\t :" + pruefer + "\n"+
				 "ergebnis\t :"+ergebnis;
	}

	
	 
	
}
