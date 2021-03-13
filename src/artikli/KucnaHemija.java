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
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija: " + getNaziv() + ", sifra: " + getSifra() + ", opis: " + getOpis() +
				", kolicina: " + getKolicina() + "rokTrajanja: " + getRokTrajanja();
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
				
			} else return false;
			
		} else return false;
		
		return true;
	}
	
}

	