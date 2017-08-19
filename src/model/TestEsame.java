package model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {

		Esame tdp = new Esame("03FYZ", "tecniche di pgm", "fulvio");
		System.out.println(tdp);
		Esame ami = new Esame ("01qzp", "ambient xxx", "Emilio");
		System.out.println(ami);
		System.out.println(ami.equals(tdp));
		tdp.supera(18,LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18,LocalDate.now());
		System.out.println(tdp);
	}

}
