package biblioteka.interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;

public interface BibliotekaInterfejs {

	void dodajKnjigu(Knjiga k);
	void obrisiKnjigu(Knjiga k);
	List<Knjiga> vratiSveKnjige();
	List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
}
