
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * class Studentenverwaltung
 * @author winnie
 *@version 4-7-2020
 */
 public class Studentenverwaltung {
		private  ArrayList<Student> student;
		
		/**
		 * konstruktor
		 */
		Studentenverwaltung(){
			this.student=new ArrayList<Student>();
		}
		
		/**
		 * diese Methode f�ght ein Student hinzu
		 * @param übernimmt die klasse student
		 */
		
		public void addStudent(Student s) {
			this.student.add(s);	
		}
		
		/**
		 * diese methode  laueft in der array student durch und zeigt der  file Datei an
		 * @return die writeList 
		 */
		public  String testFile() {
			String writeList="";
			
				for(int i=0; i<student.size();i++) {
					writeList=writeList + student.get(i).toString();
				}
		    return writeList;
	     }
	
		/**
		 *  diese Methode erzeugt der file Datei
		 * @param Filename(alles in allem)
		 */
		public void writeAll(String filename) {
				String textPath=System.getProperty("user.dir") +"/out/informatik_Sommester_2020.txt";
				
				try {
					 Files.write(Paths.get(textPath), filename.getBytes());
					 
				 }catch (IOException e) {
					 e.printStackTrace();
				 }
		}	
		
		/**
		 * diese Methode rundet das Ergebnis
		 * @param nombre in komma
		 * @return ergerbnis mit 2 stelle
		 * 
		 */
		public static double arrondi(double erg) {
			return (double)((int)((erg*100)+0.5)/100);
		}
		
		/**
		 * Die main Methode
		 * @param array of string
		 */
		
	     public static void main(String[] args) {
		    Studentenverwaltung sdt= new Studentenverwaltung();
		 
			    Pruefungsleistung pr1 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung pr2 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung pr3= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung pr4= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung pr5= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    
			    ArrayList<Pruefungsleistung> listVonLeistungen=new ArrayList<>();
			    listVonLeistungen.add(pr1);
			    listVonLeistungen.add(pr2);
			    listVonLeistungen.add(pr3);
			    listVonLeistungen.add(pr4);
			    listVonLeistungen.add(pr5);
			    Student student1=new Student(1234,"M�ller","Thomas",listVonLeistungen );
				sdt.addStudent(student1);
			
			    Pruefungsleistung p1 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung p2 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung p3= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung p4= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung p5= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    ArrayList<Pruefungsleistung> listVonLeistung=new ArrayList<>();
			    listVonLeistung.add(p1);
			    listVonLeistung.add(p2);
			    listVonLeistung.add(p3);
			    listVonLeistung.add(p4);
			    listVonLeistung.add(p5);
				Student student2=new Student(1454,"Kier","Jonas",listVonLeistung );
                sdt.addStudent(student2);
                
                
				Pruefungsleistung p11 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung p22 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung p33= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung p44= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung p55= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    ArrayList<Pruefungsleistung> liste=new ArrayList<>();
			    liste.add(p11);
			    liste.add(p22);
			    liste.add(p33);
			    liste.add(p44);
			    liste.add(p55);
				Student student3=new Student(1454,"Klaus","Cesar",liste);
                sdt.addStudent(student3);
				
				
				
				Pruefungsleistung pr11 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung pr22 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung pr33= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung pr44= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung pr55= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    ArrayList<Pruefungsleistung> list=new ArrayList<>();
			    list.add(pr11);
			    list.add(pr22);
			    list.add(pr33);
			    list.add(pr44);
			    list.add(pr55);
			    
				Student student4=new Student(1454,"Recker","Max",list);
	
				sdt.addStudent(student4);
				
				
				Pruefungsleistung pr111 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung pr222 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung pr333= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung pr444= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung pr555= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    ArrayList<Pruefungsleistung> listVonLeist=new ArrayList<>();
			    listVonLeist.add(pr111);
			    listVonLeist.add(pr222);
			    listVonLeist.add(pr333);
			    listVonLeist.add(pr444);
			    listVonLeist.add(pr555);
			    
				Student student5=new Student(1454,"Laxkute","Emile",listVonLeist);
	
				sdt.addStudent(student5);
				
				
				Pruefungsleistung p111 = new Pruefungsleistung("OOP","Bienhaus",arrondi(Math.random()*100));
			    Pruefungsleistung p222 = new Pruefungsleistung("PIS","Herzberg",arrondi(Math.random()*100));
			    Pruefungsleistung p333= new Pruefungsleistung("AUD","D�ring",arrondi(Math.random()*100));
			    Pruefungsleistung p444= new Pruefungsleistung("NTG","Welzel",arrondi(Math.random()*100));
			    Pruefungsleistung p555= new Pruefungsleistung("Mathematik","Just",arrondi(Math.random()*100));
			    ArrayList<Pruefungsleistung> listLeist=new ArrayList<>();
			    listLeist.add(p111);
			    listLeist.add(p222);
			    listLeist.add(p333);
			    listLeist.add(p444);
			    listLeist.add(p555);
			    
				Student student6=new Student(1454,"Kuhl","Marie",listLeist);
				
	
				sdt.addStudent(student6);
				
				sdt.writeAll(sdt.testFile());
		
	}
	
}
