package dp.proxy;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> listaInvitati = new ArrayList<>();
		listaInvitati.add("Mos Craciun");
		listaInvitati.add("Renul Rudolf");

		Client cl1 = new Client("Gigel", 20);
		Client cl2 = new Client("Costel", 12);
		Petrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
		petrecere.adaugaParticipant(cl1);
		
		Client cl3 = new Client("Marcel", 20);
		Client cl4 = new Client("Ionela", 12);
		PetrecereProxy petrecereProxy = new PetrecereProxy(petrecere);
		petrecereProxy.adaugaParticipant(cl3);
		petrecereProxy.adaugaParticipant(cl4);
	}

}
