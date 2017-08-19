package model;

public class TestModel {

	public static void main(String[] args) {

		Model m = new Model();
		m.addEsame(new Esame("03FY1", "tecniche di pgm1", "fulvio"));
		m.addEsame(new Esame("03FY2", "tecniche di pgm2", "fulvio"));
		m.addEsame(new Esame("03FY3", "tecniche di pgm3", "fulvio"));
		m.addEsame(new Esame("03FY4", "tecniche di pgm4", "fulvio"));
        System.out.println(m.trovaEsame("03FY5"));
	}

}
