package artikli;

public class Knjiga extends Artikal {

	
	@Override
	public String toString() {
		return "Knjiga: '" + getNaziv() + "', sifra: " + getSifra() + ", opis: " + getOpis() +
				", kolicina: " + getKolicina();
	}
	
}
