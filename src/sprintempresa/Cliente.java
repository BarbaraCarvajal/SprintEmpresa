package sprintempresa;

import java.util.Scanner;

public class Cliente extends Usuario {

    String nombres;
    String apellidos;
    String telefono;
    String afp;
    String sistemaSalud;
    String direccion;
    String comuna;
    String edad;

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String fechaNacimiento, String rut, String nombres, String apellidos,
            String telefono, String afp, String sistemaSalud, String direccion, String comuna, String edad)
            {
        super(nombre, fechaNacimiento, rut);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "\nDATOS CLIENTE\n\nNombres --> " + nombres + "\napellidos --> " + apellidos + "\nrut --> " + rut
                + "\ntelefono --> " + telefono
                + "\nafp --> " + afp + "\nsistemaSalud --> " + obtenerSistemaSalud() + "\ndireccion --> " + direccion
                + "\ncomuna --> " + comuna
                + "\nedad --> " + edad;
    }

    public String validarAfp(String mensaje, Scanner sc) {

        boolean condAfp = true;
        String input = "";

        while (condAfp) {

            System.out.print("\n" + mensaje);
            input = sc.nextLine().toLowerCase();

            if (input.matches("[a-z A-Z]{3,9}")) {

                if (input.equals("uno") || input.equals("provida") || input.equals("habitat") || input.equals("cuprum")
                        || input.equals("capital") || input.equals("planvital") || input.equals("modelo")) {

                    condAfp = false;
                } else {
                    System.out.println("AFP no existente, intentalo nuevamente");
                }
            } else {
                System.out.println("Dato ingresado no valido, intentalo nuevamente");
            }
        }
        return input;
    }


    public String validarSalud(String mensaje, Scanner sc) {

		boolean condSalud = true;
		String input = "fonasa";

		while (condSalud) {

			System.out.print("\n" + mensaje);
			input = sc.nextLine().toLowerCase();

			if (input.matches("[1-2]+")) {

				if (input.equals("1") || input.equals("2")) {
					condSalud = false;
				} else {
					System.out.println("Sistema de salud no existente, intentalo nuevamente");
				}

			} else {
				System.out.println("Dato ingresado no valido, intentalo nuevamente");
			}
		}
		return input;
	}

    public String obtenerSistemaSalud(){
        String sistema = "Fonasa";
    
        if (this.sistemaSalud.equals("1")){
             sistema = "Fonasa";
    
        }else if (this.sistemaSalud.equals("2")){
            sistema = "Isapre";
    
        }else{
            System.out.println("norsts");
        }
        
        return sistema;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public void analizarUsuario() {
        // TODO Auto-generated method stub
        super.analizarUsuario();
        System.out.println("\nDireccion --> " + getDireccion() + "\nComuna --> " + getComuna());
    }

}