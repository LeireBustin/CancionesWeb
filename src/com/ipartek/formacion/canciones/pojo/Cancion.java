package com.ipartek.formacion.canciones.pojo;

public class Cancion {
	
	// ATRIBUTOS
		private long id;
		private String nombre;
		private String artista;
		private String duracion; // en minutos

		// CONSTRUCTORES
		public Cancion() {
			super();
			this.nombre = "";
			this.artista = "";
			this.duracion = "";

		}

		public Cancion(String titulo) {
			super();
			this.nombre = titulo;
			this.artista = "";
			this.duracion = "";

		}

		public Cancion(String titulo, String artista) {
			super();
			this.nombre = titulo;
			this.artista = artista;
			this.duracion = "";

		}

		public Cancion(String titulo, String artista, String duracion) {
			super();
			this.nombre = titulo;
			this.artista = artista;
			this.duracion = duracion;

		}

		public String toString() {
			return "Cancion [titulo=" + nombre + ", artista=" + artista + ", duracion=" + duracion + "]";
		}

		// getters y setters
		public String getTitulo() {
			return nombre;
		}

		public void setTitulo(String titulo) {
			this.nombre = titulo;
		}

		public String getArtista() {
			return artista;
		}

		public void setArtista(String artista) {
			this.artista = artista;
		}

		public String getDuracion() {
			return duracion;
		}

		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

	}
