package artikli;

public class Artikal {

	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new RuntimeException("Naziv ne sme biti null!");
		}
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra < 0) {
			throw new RuntimeException("Sifra mora biti veca od 0!");
		}
		this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis == null) {
			throw new RuntimeException("Opis artikla ne sme biti null!");
		}
		this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina < 0) {
			throw new RuntimeException("Kolicina ne sme biti manja od 0!");
		}
		this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;

		if (sifra != other.sifra)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}

}
