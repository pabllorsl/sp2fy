// Pabllo Lima, 115111825, turma 1

package lp2.lab04;

public class Perfil {

	private String nome;
	private Musiteca musiteca;

	// public boolean addAlbum(Album album)
	// public boolean removeAlbum(Album album)
	// public boolean contemAlbum(Album album)

	// public boolean addAosFavoritos(Album album)
	// public int getQtdFavoritos()

	// public boolean criaPlaylist(String nomePlaylist)
	// public boolean contemPlaylist(String nomePlaylist)
	// public boolean addNaPlaylist(String nomePlaylist, String nomeAlbum, int faixa)
	// public boolean contemNaPlaylist(String nomePlaylist, String nomeMusica)
	// public int getTamPlaylist(String nomePlaylist)

	public Perfil(String nome) {
		this.nome = nome;
		this.musiteca = new Musiteca();
	}

	public boolean addAlbum(Album album) {
		return musiteca.addAlbum(album);
	}

	public boolean removeAlbum(Album album) {
		return musiteca.removeAlbum(album);
	}

	public boolean contemAlbum(Album album) {
		return musiteca.contemAlbum(album);
	}

	public boolean addAosFavoritos(Album album) {
		return musiteca.addAosFavoritos(album);
	}

	public int getQtdFavoritos() {
		return musiteca.getQtdFavoritos();
	}

	public boolean criaPlaylist(String nomePlaylist) {
		return musiteca.criaPlaylist(nomePlaylist);
	}

	public boolean contemPlaylist(String nomePlaylist) {
		return musiteca.contemPlaylist(nomePlaylist);
	}

	public boolean addNaPlaylist(String nomePlaylist, String nomeAlbum, int faixa) {
		return musiteca.addNaPlaylist(nomePlaylist, nomeAlbum, faixa);
	}

	public boolean contemNaPlaylist(String nomePlaylist, String nomeMusica) {
		return musiteca.contemNaPlaylist(nomePlaylist, nomeMusica);
	}

	public int getTamPlaylist(String nomePlaylist) {
		return musiteca.getTamPlaylist(nomePlaylist);
	}

}
