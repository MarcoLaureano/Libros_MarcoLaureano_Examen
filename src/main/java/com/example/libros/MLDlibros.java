package com.example.libros;

public class MLDlibros {
     private int MLD_id_libros;
     private String MLD_categoria;
    private String MLD_titulo;
    private String MLD_autor;
    private Boolean MLD_prestado;

    public MLDlibros(int MLD_id_libros, String MLD_categoria, String MLD_titulo, String MLD_autor, Boolean MLD_prestado) {

    }

    public MLDlibros(int id, String cat, String titulo, String autor, boolean prestado) {
        super();
        this.MLD_id_libros = id;
        this.MLD_categoria = cat;
        this.MLD_titulo = titulo;
        this.MLD_autor = autor;
        this.MLD_prestado = prestado;
    }

    public int getMLD_id_libros() {
        return MLD_id_libros;
    }

    public void setMLD_id_libros(int MLD_id_libros) {
        this.MLD_id_libros = MLD_id_libros;
    }

    public String getMLD_categoria() {
        return MLD_categoria;
    }

    public void setMLD_categoria(String MLD_categoria) {
        this.MLD_categoria = MLD_categoria;
    }

    public String getMLD_titulo() {
        return MLD_titulo;
    }

    public void setMLD_titulo(String MLD_titulo) {
        this.MLD_titulo = MLD_titulo;
    }

    public String getMLD_autor() {
        return MLD_autor;
    }

    public void setMLD_autor(String MLD_autor) {
        this.MLD_autor = MLD_autor;
    }

    public Boolean getMLD_prestado() {
        return MLD_prestado;
    }

    public void setMLD_prestado(Boolean MLD_prestado) {
        this.MLD_prestado = MLD_prestado;
    }
}
