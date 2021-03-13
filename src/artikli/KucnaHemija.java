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

	
}

	