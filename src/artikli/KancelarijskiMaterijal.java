package artikli;

public class KancelarijskiMaterijal extends Artikal {

	@Override
	public String toString() {
		return "Kancelarijski materijal: " + getNaziv() + ", sifra: " + getSifra() + ", opis: " + getOpis() +
				", kolicina: " + getKolicina();
	}
	
}
