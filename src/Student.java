
import java.util.ArrayList;

/**
 * class Student
 *  @author winnie
 *@version 4-7-2020
 */
public class Student {
	private int matrNr;
	private String name;
	private String vorname;
	private ArrayList<Pruefungsleistung > pr;
	
	/**
	 *Der Konstruktor
	 * @param matrikulnummer  eines Studenten
	 * @param Name eines Student
	 * @param Vorname eines Student
	 * @param Liste der Note
	 */
	
	Student(int matrNr,String name,String vorname,ArrayList<Pruefungsleistung> pr){
		this.matrNr=matrNr;
		this.name=name; 
		this.vorname=vorname;
		this.pr=pr;
	}
	
	/**
	 * diese Methode gibt der Matrikulnummer zurueck
	 * @return matrikulnummer eines Studenten
	 */
	
	public int getMatrNr() {
		return matrNr;
	}
	
	/**
	 * diese Methode gibt der Name zurueck
	 * @return Name des Studenten
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * diese Methode ersetzt der Name
	 * @param Name ersetzen
	 */
	public void SetName(String n) {
		this.name=n;
	}
	
	/**
	 * diese Methode gibt der Vorname zurueck
	 * @return Vorname zurueckt
	 */
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * diese Methode ersetzt der Vorname
	 * @param übergibt den Vornamen 
	 */
	public void SetVorname(String v) {
		this.vorname=v;
	}
	
	
	/**
	 * Diese Methode gibt der Name, Vorname ,PruefungLeistung,die durschnitt Note und der Anzahl der 
	 * nicht bestandene Pruefungen  zurueck;
	 * @return ausgabe der Tostring
	 */
	public String toString() {
		double erg = 0;
		int nb=0;
		for(int i=0;i<pr.size();i++) {
			erg+=pr.get(i).getErgebnis();
			if(pr.get(i).getErgebnis()<50) {
				nb +=1;
			}
		}
		erg=erg/pr.size();
		
	
		return "\n------------------------------------------------------------------------------------------\nMatrNr\t :" + matrNr + "\n"+
				"Name\t :" + name +"\n"+
				"Vorname\t :" + vorname + "\n\n"+
				"Pruefungsleistungen \n" + pr + "\n" +
				"\nDurchschnitt\t :" + erg+"\n" +
				"Anzahl NB\t :"+nb+"\n";
	}
	
	

}
