// Pabllo Lima, 115111825, turma 1

package lp2.lab04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Musiteca {

	private HashSet<Album> meusAlbuns;
	private HashSet<Album> meusAlbunsFavoritos;
	private ArrayList<Musica> playlist;
	private HashMap<String, ArrayList<Musica>> minhasPlaylists;

	public Musiteca() {
		this.meusAlbuns = new HashSet<Album>();
		this.meusAlbunsFavoritos = new HashSet<Album>();
		this.playlist = new ArrayList<Musica>();
		this.minhasPlaylists = new HashMap<String, ArrayList<Musica>>();
	}

	public boolean addAlbum(Album album) {
		if (album == null || meusAlbuns.contains(album)) {
			return false;
		} else {
			meusAlbuns.add(album);
			return true;
		}
	}

	public boolean removeAlbum(Album album) {
		if (album != null && meusAlbuns.contains(album)) {
			meusAlbuns.remove(album);
			return true;
		} else {
			return false;
		}
	}

	public boolean contemAlbum(Album album) {
		return meusAlbuns.contains(album);
	}

	public boolean addAosFavoritos(Album album) {
		if (album == null || meusAlbunsFavoritos.contains(album)) {
			return false;
		} else {
			meusAlbunsFavoritos.add(album);
			return true;
		}
	}

	public int getQtdFavoritos() {
		return meusAlbunsFavoritos.size();
	}

	public boolean criaPlaylist(String nomePlaylist) {

		if (nomePlaylist == null || nomePlaylist.trim().isEmpty() || minhasPlaylists.containsKey(nomePlaylist)) {
			return false;
		}

		minhasPlaylists.put(nomePlaylist, playlist);
		return true;
	}

	public boolean addNaPlaylist(String nomePlaylist, String nomeAlbum, int faixa) {

		Musica musica;

		if (nomePlaylist == null || nomePlaylist.trim().isEmpty() || nomeAlbum == null || nomeAlbum.trim().isEmpty()
				|| faixa < 1) {
			return false;
		}

		criaPlaylist(nomePlaylist);
		musica = procuraMusicaAlbum(nomeAlbum, faixa);

		if (musica == null) {
			return false;
		} else {
			return minhasPlaylists.get(nomePlaylist).add(musica);
		}

	}

	public int getTamPlaylist(String nomePlaylist) {
		return minhasPlaylists.get(nomePlaylist).size();
	}

	private Musica procuraMusicaAlbum(String nomeAlbum, int faixa) {

		Musica musica = null;
		for (Album album : meusAlbuns) {
			if (album.getTitulo().equalsIgnoreCase(nomeAlbum)) {
				musica = album.getFaixa(faixa);
			}
		}
		return musica;

	}

	public boolean contemNaPlaylist(String nomePlaylist, String nomeMusica) {

		ArrayList<Musica> playlistDesejada = minhasPlaylists.get(nomePlaylist);

		for (Musica musica : playlistDesejada) {
			if (musica.getTitulo().equalsIgnoreCase(nomeMusica)) {
				return true;
			}
		}

		return false;

	}

	public boolean contemPlaylist(String nomePlaylist) {
		if (minhasPlaylists.containsKey(nomePlaylist)) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Album> retornaAlbunsArtista(String nomeArtista) {

		ArrayList<Album> albunsPorArtista = new ArrayList<Album>();

		for (Album album : meusAlbuns) {
			if (album.getArtista().equalsIgnoreCase(nomeArtista)) {
				albunsPorArtista.add(album);
			}
		}

		return albunsPorArtista;
	}

}
