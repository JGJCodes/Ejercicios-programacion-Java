/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemabiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import leer.Leer;

/**
 *
 * @author Jorge Guzmán Juárez
 */
public class Main {

    public static void main(String[] args) {
        Main.MenuPrincipal();
    }

//Metodos que ejecutan los menus de opciones {
    public static void MenuPrincipal(){
        short opc =0;
        while(opc!=4){
            System.out.println("Menu Principal");
            System.out.println("1.-Alumnos");
            System.out.println("2.-Libros");
            System.out.println("3.-Prestamos");
            System.out.println("4.-Salir");
            opc=Leer.datoShort();
            switch(opc){
                case 1:Main.MenuAlumnos();
                       break;
                case 2:Main.MenuLibros();
                       break;
                case 3:Main.MenuPrestamos();
                       break;
                case 4:System.out.println("Gracias por entrar");
                       break;
            }
        }
    }

    public static void MenuAlumnos(){
        Alumnos ArregloAlumnos[] =new Alumnos[100];
        int TotalAlumnos =Main.CargarArreglo(ArregloAlumnos);
        short opc =0;
        while(opc!=5){
            System.out.println("Menu Alumnos");
            System.out.println("1.-Registrar");
            System.out.println("2.-Renovar Credencial");
            System.out.println("3.-Consultar");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Regresar");
            opc=Leer.datoShort();
            switch(opc){
                case 1:Alumnos AlumnoNuevo=new Alumnos();
                       Main.CapturarDatosAlumnos(AlumnoNuevo);
                       ArregloAlumnos[++TotalAlumnos]=AlumnoNuevo;
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 2:Main.RenovarAlumnos(ArregloAlumnos, TotalAlumnos);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 3:Main.ConsultarAlumnos(ArregloAlumnos, TotalAlumnos);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 4:TotalAlumnos=Main.EliminarAlumnos(ArregloAlumnos, TotalAlumnos);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 5:System.out.println("Retorno al menu principal");
                       break;
            }
        }
        Main.GrabarAlumnos(ArregloAlumnos, TotalAlumnos);
    }

    public static void MenuLibros(){
        Libro ArregloLibros[]=new Libro[100];
        int TotalLibros =Main.CargarArreglo(ArregloLibros);
        short opc =0;
        while(opc!=5){
            System.out.println("Menu Libros");
            System.out.println("1.-Registrar");
            System.out.println("2.-Consultar");
            System.out.println("3.-Inventario");
            System.out.println("4.-Eliminar");
            System.out.println("5.-Regresar");
            opc=Leer.datoShort();
            switch(opc){
                case 1:Libro LibroNuevo =new Libro();
                       Main.CapturarDatosLibros(LibroNuevo);
                       ArregloLibros[++TotalLibros]=LibroNuevo;
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 2:Main.ConsultarLibros(ArregloLibros, TotalLibros);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 3:Main.InventarioLibros(ArregloLibros, TotalLibros);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 4:TotalLibros=Main.EliminarLibros(ArregloLibros, TotalLibros);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 5:System.out.println("Retorno al menu principal");
                       break;
            }
        }
        Main.GrabarLibros(ArregloLibros, TotalLibros);
    }

    public static void MenuPrestamos(){
        Alumnos ArregloAlumnos[] =new Alumnos[100];
        int TotalAlumnos =Main.CargarArreglo(ArregloAlumnos);
        Libro ArregloLibros[]=new Libro[100];
        int TotalLibros =Main.CargarArreglo(ArregloLibros);
        Prestamos ArregloPrestamos[]=new Prestamos[100];
        int TotalPrestamos=Main.CargarArreglo(ArregloPrestamos);
        short opc =0;
        while(opc!=5){
            System.out.println("Menu Prestamos");
            System.out.println("1.-Registrar prestamos");
            System.out.println("2.-Cancelar prestamos");
            System.out.println("3.-Reporte prestamos");
            System.out.println("4.-Reporte multas");
            System.out.println("5.-Regresar");
            opc=Leer.datoShort();
            switch(opc){
                case 1:Prestamos PrestamoNuevo=new Prestamos();
                       Main.CapturarDatosPrestamos(PrestamoNuevo, ArregloAlumnos, TotalAlumnos, ArregloLibros, TotalLibros);
                       ArregloPrestamos[++TotalPrestamos]=PrestamoNuevo;
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 2:TotalPrestamos=Main.EliminarPrestamos(ArregloPrestamos, TotalPrestamos, ArregloAlumnos, TotalAlumnos, ArregloLibros, TotalLibros);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 3:Main.ReportePrestamos(ArregloPrestamos, TotalPrestamos, ArregloAlumnos, TotalAlumnos, ArregloLibros, TotalLibros);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 4:Main.ReporteMultas(ArregloAlumnos, TotalAlumnos);
                       System.out.println("Presione <enter> para continuar");
                       Leer.dato();
                       break;
                case 5:System.out.println("Retorno al menu principal");
                       break;
            }
        }
        Main.GrabarAlumnos(ArregloAlumnos, TotalAlumnos);
        Main.GrabarLibros(ArregloLibros, TotalLibros);
        Main.GrabarPrestamos(ArregloPrestamos, TotalPrestamos);
    }
//  }MENUS

//Metodos que efectuan las acciones necesarias para realizar las opciones del menu Alumnos {
    public static int CargarArreglo(Alumnos[]ArregloAlumnos){
        int TotalAlumnos =-1;
        BufferedReader Br =null;
        try{
            Br=new BufferedReader(new FileReader(new File("Alumnos.txt")));
            String linea=Br.readLine();
            for(;linea!=null;){
                System.out.println(linea);
                ArregloAlumnos[++TotalAlumnos]=new Alumnos();
                ArregloAlumnos[TotalAlumnos].setNombre(linea);
                ArregloAlumnos[TotalAlumnos].setCarrera(Br.readLine());
                ArregloAlumnos[TotalAlumnos].setSemestre(Short.parseShort(Br.readLine()));
                ArregloAlumnos[TotalAlumnos].setNumControl(Br.readLine());
                ArregloAlumnos[TotalAlumnos].setNumFolio(Short.parseShort(Br.readLine()));
                ArregloAlumnos[TotalAlumnos].setVigencia(Br.readLine());
                ArregloAlumnos[TotalAlumnos].setEstado(Br.readLine());
                linea=Br.readLine();
            }
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return TotalAlumnos;
    }

//Metodos para registrar un Alumno
    public static void CapturarDatosAlumnos(Alumnos AlumnoNuevo){
        System.out.println("Modulo de registro de Alumnos");
        System.out.print("Ingresar Nombre: ");
        AlumnoNuevo.setNombre(Leer.dato());
        System.out.print("\nIngresar Carrera: ");
        AlumnoNuevo.setCarrera(Leer.dato());
        System.out.print("\nIngresar Semestre: ");
        AlumnoNuevo.setSemestre(Short.parseShort(Leer.dato()));
        System.out.print("\nIngresar Número de control: ");
        AlumnoNuevo.setNumControl(Leer.dato());
        System.out.print("\nIngresar Número de folio: ");
        AlumnoNuevo.setNumFolio(Short.parseShort(Leer.dato()));
        System.out.print("\nIngresar Vigencia: ");
        AlumnoNuevo.setVigencia(Leer.dato());
        AlumnoNuevo.setEstado("Inactivo");
        System.out.println();
    }

    public static int GrabarAlumnos(Alumnos[]ArregloAlumnos, int TotalAlumnos){
        BufferedWriter Br =null;
        try{
            Br =new BufferedWriter(new FileWriter(new File("Alumnos.txt")));
            for(int i=0;i<=TotalAlumnos;i++){
                Br.write(ArregloAlumnos[i].getNombre()+"\n");
                Br.write(ArregloAlumnos[i].getCarrera()+"\n");
                Br.write(ArregloAlumnos[i].getSemestre()+"\n");
                Br.write(ArregloAlumnos[i].getNumControl()+"\n");
                Br.write(ArregloAlumnos[i].getNumFolio()+"\n");
                Br.write(ArregloAlumnos[i].getVigencia()+"\n");
                Br.write(ArregloAlumnos[i].getEstado()+"\n");
            }
            Br.flush();
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return TotalAlumnos;
    }

//Metodos para renovar la credencial de los Alumnos
    public static void RenovarAlumnos(Alumnos ArregloAlumnos[], int TotalAlumnos){
        String tNControl; int Indice;
        System.out.println("Modulo de renovación de credenciales de Alumnos");
        System.out.print("Numero de control: ");
        tNControl =Leer.dato();
        if((Indice=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, tNControl))!=-1){
            System.out.print("\nActualizar vigencia:");
            ArregloAlumnos[Indice].setVigencia(Leer.dato());
            System.out.println("\nCredencial actualizada");
        }
        else{
            System.out.println("\nNo se encontro el Alumno");
        }
    }

//Metodos para consultar a un Alumno
    public static int BuscarAlumnos(Alumnos ArregloAlumnos[], int TotalAlumnos, String tNControl){
        for(int i=0;i<=TotalAlumnos;i++){
            if(ArregloAlumnos[i].getNumControl().equals(tNControl))
                return i;
        }
        return -1;
    }

    public static void ConsultarAlumnos(Alumnos ArregloAlumnos[], int TotalAlumnos){
        String tNControl; int Indice;
        System.out.println("Modulo de consulta de Alumnos");
        System.out.print("Numero de control: ");
        tNControl=Leer.dato();
        if((Indice=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, tNControl))!=-1){
            System.out.println("\nNombre: " + ArregloAlumnos[Indice].getNombre());
            System.out.println("Carrera: " + ArregloAlumnos[Indice].getCarrera());
            System.out.println("Semestre: " + ArregloAlumnos[Indice].getSemestre());
            System.out.println("Número de folio: " + ArregloAlumnos[Indice].getNumFolio());
            System.out.println("Vigencia: " + ArregloAlumnos[Indice].getVigencia());
            System.out.println("Estado: " + ArregloAlumnos[Indice].getEstado());
        }
        else{
            System.out.println("\nNo se encontro el Alumno");
        }
    }

//Metodos para eliminar un Alumno
    public static int EliminarAlumnos(Alumnos ArregloAlumnos[], int TotalAlumnos){
        String tNControl; int Indice;
        System.out.println("Modulo de eliminación de Alumnos");
        System.out.print("Numero de control: ");
        tNControl =Leer.dato();
        if((Indice=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, tNControl))!=-1){
            for(;Indice<TotalAlumnos;Indice++)
                ArregloAlumnos[Indice]=ArregloAlumnos[Indice+1];
            System.out.println("Alumno eliminado");
        }
        else{
            System.out.println("\nNo se encontro el Alumno");
        }
        return TotalAlumnos-1;
    }
//  }ALUMNOS
    
//Metodos que efectuan las acciones necesarias para realizar las opciones del menu Libros {
    public static int CargarArreglo(Libro[]ArregloLibros){
        int Totallibros =-1;
        BufferedReader Br =null;
        try{
            Br =new BufferedReader(new FileReader(new File("Libros.txt")));
            String linea =Br.readLine();
            for(;linea!=null;){
                System.out.println(linea);
                ArregloLibros[++Totallibros] =new Libro();
                ArregloLibros[Totallibros].setTitulo(linea);
                ArregloLibros[Totallibros].setSubtitulo(Br.readLine());
                ArregloLibros[Totallibros].setAutor(Br.readLine());
                ArregloLibros[Totallibros].setNumEdicion(Br.readLine());
                ArregloLibros[Totallibros].setAñoEdicion(Short.parseShort(Br.readLine()));
                ArregloLibros[Totallibros].setEditorial(Br.readLine());
                ArregloLibros[Totallibros].setNumClasificacion(Br.readLine());
                ArregloLibros[Totallibros].setNumInventario(Integer.parseInt(Br.readLine()));
                ArregloLibros[Totallibros].setEstado(Br.readLine());
                linea =Br.readLine();
            }
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return Totallibros;
    }

//Metodos para registrar un Libro
    public static void CapturarDatosLibros(Libro LibroNuevo){
        System.out.println("Modulo de registro de Libros");
        System.out.print("Ingresar Titulo: ");
        LibroNuevo.setTitulo(Leer.dato());
        System.out.print("\nIngresar Subtitulo: ");
        LibroNuevo.setSubtitulo(Leer.dato());
        System.out.print("\nIngresar Autor: ");
        LibroNuevo.setAutor(Leer.dato());
        System.out.print("\nIngresar Número de edición: ");
        LibroNuevo.setNumEdicion(Leer.dato());
        System.out.print("\nIngresar Año de edición: ");
        LibroNuevo.setAñoEdicion(Short.parseShort(Leer.dato()));
        System.out.print("\nIngresar Editorial: ");
        LibroNuevo.setEditorial(Leer.dato());
        System.out.print("\nIngresar Número de clasificación: ");
        LibroNuevo.setNumClasificacion(Leer.dato());
        System.out.print("\nIngresar Número de inventario: ");
        LibroNuevo.setNumInventario(Integer.parseInt(Leer.dato()));
        LibroNuevo.setEstado("Disponible");
        System.out.println();
    }

    public static int GrabarLibros(Libro[]ArregloLibros, int TotalLibros){
        BufferedWriter Br =null;
        try{
            Br =new BufferedWriter(new FileWriter(new File("Libros.txt")));
            for(int i=0;i<=TotalLibros;i++){
                Br.write(ArregloLibros[i].getTitulo()+"\n");
                Br.write(ArregloLibros[i].getSubtitulo()+"\n");
                Br.write(ArregloLibros[i].getAutor()+"\n");
                Br.write(ArregloLibros[i].getNumEdicion()+"\n");
                Br.write(ArregloLibros[i].getAñoEdicion()+"\n");
                Br.write(ArregloLibros[i].getEditorial()+"\n");
                Br.write(ArregloLibros[i].getNumClasificacion()+"\n");
                Br.write(ArregloLibros[i].getNumInventario()+"\n");
                Br.write(ArregloLibros[i].getEstado()+"\n");
            }
            Br.flush();
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return TotalLibros;
    }

//Metodos para consultar un Libro
    public static int BuscarLibros(Libro[]ArregloLibros, int TotalLibros, String tTitulo){
        for(int i=0;i<=TotalLibros;i++){
            if(ArregloLibros[i].getTitulo().equals(tTitulo))
                return i;
        }
        return -1;
    }

    public static void ConsultarLibros(Libro[]ArregloLibros, int TotalLibros){
        String tTitulo; int Indice;
        System.out.println("Modulo de consulta de Libros");
        System.out.print("Titulo: ");
        tTitulo =Leer.dato();
        if((Indice =Main.BuscarLibros(ArregloLibros, TotalLibros, tTitulo))!=-1){
            System.out.println("\nSubtitulo: " + ArregloLibros[Indice].getSubtitulo());
            System.out.println("Autor: " + ArregloLibros[Indice].getAutor());
            System.out.println("Número de edición: " + ArregloLibros[Indice].getNumEdicion());
            System.out.println("Año de edición: " + ArregloLibros[Indice].getAñoEdicion());
            System.out.println("Editorial: " + ArregloLibros[Indice].getEditorial());
            System.out.println("Número de clasificación: " + ArregloLibros[Indice].getNumClasificacion());
            System.out.println("Número de inventario: " + ArregloLibros[Indice].getNumInventario());
            System.out.println("Estado: " + ArregloLibros[Indice].getEstado());
        }
        else{
            System.out.println("\nNo se encontro el Titulo");
        }
    }

//Metodo para observar el inventario de Libros
    public static void InventarioLibros(Libro[]ArregloLibros, int TotalLibros){
        System.out.println("Modulo de inventario  de Libros");
        System.out.println("||Titulo\t\t||Autor\t\t||Editorial");
        for(int i=0;i<=TotalLibros;i++){
            System.out.println(ArregloLibros[i].getTitulo()+"\t"+ArregloLibros[i].getAutor()+"\t"+ArregloLibros[i].getEditorial());
        }
    }

//Metodo para eliminar un Libro
    public static int EliminarLibros(Libro[]ArregloLibros, int TotalLibros){
        String tTitulo; int Indice;
        System.out.println("Modulo de eliminacion de Libros");
        System.out.print("Titulo: ");
        tTitulo =Leer.dato();
        if((Indice =Main.BuscarLibros(ArregloLibros, TotalLibros, tTitulo))!=-1){
            for(;Indice<TotalLibros;Indice++)
                ArregloLibros[Indice]=ArregloLibros[Indice+1];
            System.out.println("Libro eliminado");
        }
        else{
            System.out.println("\nNo se encontro el Titulo");
        }
        return TotalLibros-1;
    }
//  }LIBROS

//Metodos que efectuan las acciones necesarias para realizar las opciones del menu Prestamos{
    public static int CargarArreglo(Prestamos ArregloPrestamos[]){
        int TotalPrestamos =-1;
        BufferedReader Br =null;
        try{
            Br =new BufferedReader(new FileReader(new File("Prestamos.txt")));
            String linea =Br.readLine();
            for(;linea!=null;){
                System.out.println(linea);
                ArregloPrestamos[++TotalPrestamos] =new Prestamos();
                ArregloPrestamos[TotalPrestamos].setNumControl(linea);
                ArregloPrestamos[TotalPrestamos].setTitulo(Br.readLine());
                ArregloPrestamos[TotalPrestamos].setNumClasificacion(Br.readLine());
                ArregloPrestamos[TotalPrestamos].setNumInventario(Integer.parseInt(Br.readLine()));
                ArregloPrestamos[TotalPrestamos].setFecha(Br.readLine());
                ArregloPrestamos[TotalPrestamos].setFechaEntrega(Br.readLine());
                linea =Br.readLine();
            }
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return TotalPrestamos;
    }

    public static int Verificar(Alumnos []ArregloAlumnos, int i){
        String estado="Multado";
        if(ArregloAlumnos[i].getEstado().equals(estado))
            return 0;
        estado="Activo";
        if(ArregloAlumnos[i].getEstado().equals(estado))
            return 1;
        return -1;
    }

    public static int Verificar(Libro []ArregloLibros, int i){
        String estado="Prestado";
        if(ArregloLibros[i].getEstado().equals(estado))
            return 0;
        return -1;
    }

//Metodos para registrar un Prestamo
    public static void CapturarDatosPrestamos(Prestamos PrestamoNuevo,Alumnos []ArregloAlumnos,int TotalAlumnos, Libro[]ArregloLibros, int TotalLibros){
        String Lectura = null;int indiceA, indiceL, iA, iL;
        System.out.println("Modulo de registro de Prestamos");
        System.out.print("Ingresar Número de control: ");
        PrestamoNuevo.setNumControl(Leer.dato());
        Lectura=PrestamoNuevo.getNumControl();
        indiceA=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, Lectura);
        if(indiceA!=-1){
            iA=Main.Verificar(ArregloAlumnos,indiceA);
            if(iA!=0){
                if(iA!=1){
                    System.out.print("\nIngresar Titulo: ");
                    PrestamoNuevo.setTitulo(Leer.dato());
                    Lectura=PrestamoNuevo.getTitulo();
                    indiceL=Main.BuscarLibros(ArregloLibros, TotalLibros, Lectura);
                    if(indiceL!=-1){
                        iL=Main.Verificar(ArregloLibros,indiceL);
                        if(iL==-1){
                            System.out.print("\nIngresar Número de clasificación: ");
                            PrestamoNuevo.setNumClasificacion(Leer.dato());
                            System.out.print("\nIngresar Número de inventario: ");
                            PrestamoNuevo.setNumInventario(Integer.parseInt(Leer.dato()));
                            System.out.print("\nIngresar Fecha de prestamo: ");
                            PrestamoNuevo.setFecha(Leer.dato());
                            System.out.print("\nIngresar Fecha de entrega: ");
                            PrestamoNuevo.setFechaEntrega(Leer.dato());
                            ArregloAlumnos[indiceA].setEstado("Activo");
                            ArregloLibros[indiceL].setEstado("Prestado");
                            System.out.println();
                        }
                        else
                            System.out.println("El libro no esta disponible");
                    }
                    else
                        System.out.println("El libro no esta registrado");
                }
                else
                    System.out.println("El alumno ya tiene un prestamo registrado");
            }
            else
                System.out.println("El alumno esta sancionado");
        }
        else
            System.out.println("El alumno no esta registrado");
    }

    public static int GrabarPrestamos(Prestamos []ArregloPrestamos, int TotalPrestamos){
       BufferedWriter Br =null;
        try{
            Br =new BufferedWriter(new FileWriter(new File("Prestamos.txt")));
            for(int i=0;i<=TotalPrestamos;i++){
                Br.write(ArregloPrestamos[i].getNumControl()+"\n");
                Br.write(ArregloPrestamos[i].getTitulo()+"\n");
                Br.write(ArregloPrestamos[i].getNumClasificacion()+"\n");
                Br.write(ArregloPrestamos[i].getNumInventario()+"\n");
                Br.write(ArregloPrestamos[i].getFecha()+"\n");
                Br.write(ArregloPrestamos[i].getFechaEntrega()+"\n");
            }
            Br.flush();
            Br.close();
        }
        catch(Exception e){
            System.out.println("Error archivo no encontrado");
        }
        return TotalPrestamos;
    }

//Metodos para cancelar un Prestamo
    public static int BuscarPrestamos(Prestamos []ArregloPrestamos, int TotalPrestamos, String tNControl){
        for(int i=0;i<=TotalPrestamos;i++){
            if(ArregloPrestamos[i].getNumControl().equals(tNControl))
                return i;
        }
        return -1;
    }

    public static int EliminarPrestamos(Prestamos []ArregloPrestamos, int TotalPrestamos,Alumnos []ArregloAlumnos,int TotalAlumnos, Libro[]ArregloLibros, int TotalLibros){
        String tNControl, tTitulo, Multa; int Indice;
        System.out.println("Modulo de cancelación de Prestamos");
        System.out.print("Numero de control: ");
        tNControl =Leer.dato();
        if((Indice=Main.BuscarPrestamos(ArregloPrestamos, TotalPrestamos, tNControl))!=-1){
            tTitulo=ArregloPrestamos[Indice].getTitulo();
            System.out.println("Fecha de entrega: " + ArregloPrestamos[Indice].getFechaEntrega());
            for(;Indice<TotalPrestamos;Indice++)
                ArregloPrestamos[Indice]=ArregloPrestamos[Indice+1];
            Indice=Main.BuscarLibros(ArregloLibros, TotalLibros, tTitulo);
            ArregloLibros[Indice].setEstado("Disponible");
            Indice=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, tNControl);
            System.out.print("¿Aplicar multa al alumno? (SI ó NO): ");
            Multa=Leer.dato();
            if(Multa.equals("SI"))
                ArregloAlumnos[Indice].setEstado("Multado");
            else
                ArregloAlumnos[Indice].setEstado("Inactivo");
            System.out.println("Prestamo eliminado");
        }
        else{
            System.out.println("\nNo se encontro el Alumno");
        }
        return TotalPrestamos-1;
    }

//Metodos para reportar los Prestamos
    public static void ReportePrestamos(Prestamos []ArregloPrestamos, int TotalPrestamos,Alumnos []ArregloAlumnos,int TotalAlumnos, Libro[]ArregloLibros, int TotalLibros){
        int iA, iL;
        System.out.println("Modulo de reporte de Prestamos");
        System.out.println("Fecha\t\t\t\t||Nombre\t\t\t||Libro");
        for(int i=0;i<=TotalPrestamos;i++){
            iA=Main.BuscarAlumnos(ArregloAlumnos, TotalAlumnos, ArregloPrestamos[i].getNumControl());
            iL=Main.BuscarLibros(ArregloLibros, TotalLibros, ArregloPrestamos[i].getTitulo());
            System.out.println(ArregloPrestamos[i].getFecha()+"-"+ArregloPrestamos[i].getFechaEntrega()+"\t"+ArregloAlumnos[iA].getNombre()+"\t"+ArregloLibros[iL].getTitulo());
        }
    }

//Metodos para reportar las Multas
    public static void ReporteMultas(Alumnos []ArregloAlumnos,int TotalAlumnos){
        int indice;
        System.out.println("Modulo de reporte de Multas");
        System.out.println("Nombre del alumno\t||Número de control");
        for(int i=0;i<TotalAlumnos;i++){
            if((indice=Main.Verificar(ArregloAlumnos, i))!=-1 && (indice=Main.Verificar(ArregloAlumnos, i))!=1)
                System.out.println(ArregloAlumnos[i].getNombre()+"\t"+ArregloAlumnos[i].getNumControl());
        }
    }
//}PRESTAMOS

}