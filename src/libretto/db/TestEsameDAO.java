package libretto.db;

import model.Esame;

public class TestEsameDAO {

	public static void main(String[] args) {
		EsameDAO dao = new EsameDAO();
		
		Esame e1 = dao.find("03FYZ");
		
		System.out.println(e1);
		
		Esame e2 = dao.find("03FY0");
		
		System.out.println(e2);		

	}

}
