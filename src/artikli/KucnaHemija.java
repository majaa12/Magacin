package artikli;

import java.util.GregorianCalendar;

public class KucnaHemija extends Artikal {

	private GregorianCalendar rokTrajanja;

	public KucnaHemija() {
		this.rokTrajanja = new GregorianCalendar();
	}

	public GregorianCalendar getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(GregorianCalendar rokTrajanja) {
		if (rokTrajanja.before(new GregorianCalendar()))
			throw new RuntimeException("Ovaj datum je vec prosao!");
		if (!(rokTrajanja.MONTH >= 0 && rokTrajanja.MONTH <= 11))
			throw new RuntimeException("Meseci se krecu o 0-11!");
		if (rokTrajanja.YEAR <= 0)
			throw new RuntimeException("Godina mora biti pozitivan broj!");
		if (rokTrajanja.DAY_OF_MONTH <= 0 || rokTrajanja.DAY_OF_MONTH > 31)
			throw new RuntimeException("Ne postoji ovaj dan u mesecu!");
		
			this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija: " + getNaziv() + ", sifra: " + getSifra() + ", opis: " + getOpis() + ", kolicina: "
				+ getKolicina() + "rokTrajanja: " + getRokTrajanja();
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			if (obj instanceof KucnaHemija) {
				KucnaHemija other = (KucnaHemija) obj;
				if (rokTrajanja == null) {
					if (other.rokTrajanja != null)
						return false;
				} else if (!rokTrajanja.equals(other.rokTrajanja))
					return false;

			} else
				return false;

		} else
			return false;

		return true;
	}

}
