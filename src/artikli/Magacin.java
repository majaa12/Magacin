package artikli;

import java.util.Iterator;
import java.util.LinkedList;

import magacin.MagacinInterface;

public class Magacin implements MagacinInterface {

	private LinkedList<Artikal> artikli = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if (artikli.contains(artikal)) {
			for (Artikal a : artikli) {
				if (a.equals(artikal))
					a.setKolicina(a.getKolicina() + artikal.getKolicina());
			}
		}
		artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		Iterator<Artikal> iterator = artikli.iterator();
		
		while (iterator.hasNext()) {
			 Artikal a = iterator.next();
			 if(a.equals(artikal)) {
				 a.setKolicina(a.getKolicina() - artikal.getKolicina());
				if(a.getKolicina()==0)
					iterator.remove();
			 }
		}
	}

	@Override
	public Artikal vratiArtikal(int sifra) {

		for(Artikal a: artikli) {
			if(a.getSifra() == sifra)
				return a;
		}
		System.out.println("Ne postoji taj artikal u magacinu!");
		return null;
	}

}
