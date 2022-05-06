package dp.flyweight;

import java.util.ArrayList;

public class MesajPrintare {
	private ETipMesaj tipMesaj;
	private String mesajePrintare;
	
	public MesajPrintare(ETipMesaj tipMesaj) {
		super();		
		this.tipMesaj = tipMesaj;
		System.out.println("S-a creat un mesaj printare tip "+ this.tipMesaj);
	}

	public ETipMesaj getTipMesaj() {
		return tipMesaj;
	}
	
	
}
