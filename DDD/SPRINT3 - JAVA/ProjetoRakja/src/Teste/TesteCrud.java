package Teste;

import Model.GerenciadorVeiculos;


public class TesteCrud {
	
	public static void main(String[] args) {
		
		GerenciadorVeiculos gerVeic = new GerenciadorVeiculos();
		
		gerVeic.create("123456789-90", "Silas Henrique", "12123123-9", 45044450, "0001", "Caminhão",
				"XPT-4567", "55DS","Volkswagen", "AX2545SS145", "baú",2022 , 2, 12345678);
		
		gerVeic.create("987654321-00", "Henrique Silva", "4543123-9", 12345678, "0002", "Caminhão",
				"RST-5555", "74XD","Iveco", "DG44554SSAA", "Cegonha",2014 , 2, 12345678);
		
		gerVeic.read();
		
		// gerVeic.delete(1);
		
		// gerVeic.read();
		
		gerVeic.update(1,"987654321-00", "Silas Henrique Silva", "4543123-9", 12345678, "0002", "Caminhão",
				"RLS-4545", "75OA","Scania", "DG44554SSAA", "Carga Seca",2018 , 2, 12345678);
		
		gerVeic.read();
		
		gerVeic.verificarVeiculo();
		
	}

}
