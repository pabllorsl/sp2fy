// Pabllo Lima, 115111825, turma 1

package lp2.lab04;

public class Musica {

	private String titulo;
	private int duracao;
	private String genero;

	public Musica(String titulo, int duracao, String genero) throws Exception {

		if (titulo == null || titulo.trim().isEmpty()) {
			throw new Exception("O titulo da musica nao pode ser nulo ou vazio.");
		}

		if (duracao <= 0) {
			throw new Exception("A duracao da musica nao pode ser menor ou igual a zero.");
		}

		if (genero == null || genero.trim().isEmpty()) {
			throw new Exception("O genero da musica nao pode ser nulo ou vazio.");
		}

		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracao;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object objeto) {

		if (!(objeto instanceof Musica)) {
			return false;
		}

		Musica musica = (Musica) objeto;

		return this.getTitulo().equalsIgnoreCase(musica.getTitulo()) && this.getDuracao() == musica.getDuracao();
	}

	@Override
	public String toString() {
		return titulo + " (" + genero + " - " + duracao + " minutos)";
	}

}
