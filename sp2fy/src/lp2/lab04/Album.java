// Pabllo Lima, 115111825, turma 1

package lp2.lab04;

import java.util.ArrayList;

public class Album {

	private String artista;
	private String titulo;
	private int ano;
	private ArrayList<Musica> album;

	public Album(String artista, String titulo, int ano) throws Exception {

		if (artista == null || artista.trim().isEmpty()) {
			throw new Exception("Artista do album nao pode ser nulo ou vazio.");
		}

		if (titulo == null || titulo.trim().isEmpty()) {
			throw new Exception("Titulo do album nao pode ser nulo ou vazio.");
		}

		if (ano <= 1900) {
			throw new Exception("Ano de lancamento do album nao pode ser inferior a 1900.");
		}

		this.artista = artista;
		this.titulo = titulo;
		this.ano = ano;
		this.album = new ArrayList<Musica>();
	}

	public boolean adicionaMusica(Musica musica) {

		if (musica != null) {
			album.add(musica);
			return true;
		} else {
			return false;
		}
	}

	public boolean removeMusica(int faixa) {
		album.remove(faixa - 1);
		return true;
	}

	public boolean contemMusica(String titulo) {

		for (Musica musica : album) {
			if (musica.getTitulo().equalsIgnoreCase(titulo)) {
				return true;
			}
		}

		return false;

	}

	public Musica getFaixa(int faixa) {
		return album.get(faixa - 1);
	}

	public Musica getMusica(String titulo) {

		for (Musica musica : album) {
			if (musica.getTitulo().equalsIgnoreCase(titulo)) {
				return musica;
			}
		}

		return null;
	}

	public int quantidadeFaixas() {
		return album.size();
	}

	public int getDuracaoTotal() {

		int duracaoTotal = 0;

		for (Musica musica : album) {
			duracaoTotal = duracaoTotal + musica.getDuracao();
		}

		return duracaoTotal;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object objeto) {

		if (!(objeto instanceof Album)) {
			return false;
		}

		Album album = (Album) objeto;

		return this.getTitulo().equalsIgnoreCase(album.getTitulo()) && this.getArtista().equalsIgnoreCase(album.getArtista());

	}

	@Override
	public String toString() {

		String representacao = titulo + ", " + artista + " (" + ano + ")";

		if (album.size() > 0) {

			representacao = representacao + "\n\n";

			for (int i = 1; i < quantidadeFaixas() + 1; i = i + 1) {
				Musica faixaAtual = getFaixa(i);
				representacao = representacao + (i) + ". " + faixaAtual + "\n";
			}

		}

		return representacao;

	}

}
