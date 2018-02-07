package com.company;

public class Ventana {
    private String titulo;
    private Boton entrar;
    private Etiqueta etiquetaNombre,etiquetaPassword;
    private CampoTexto campoNombre, campoPassword;

    public Ventana (String getTitulo) {
        this.titulo = titulo;
        this.entrar = new Boton("ENTRAR");
        this.etiquetaNombre = new Etiqueta("NOMBRE");
        this.etiquetaPassword = new Etiqueta("CONTRASENA");
        this.campoNombre = new CampoTexto("");
        this.campoPassword = new CampoTexto("");
    }
    public void insertarNombre(String nombre){
        this.campoNombre.setTexto(nombre);
    }
    public void insertarPassword(String texto) {
        this.campoPassword.setTexto(texto);
    }

    public boolean validar() {
        String nombre = this.campoNombre.getTexto();
        String pass = this.campoPassword.getTexto();
        return nombre.equals("pepito") && pass.equals("1234");
    }

}
