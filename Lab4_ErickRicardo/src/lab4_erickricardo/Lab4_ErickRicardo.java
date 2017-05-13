/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_erickricardo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Lab4_ErickRicardo {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static ArrayList<Persona> persona = new ArrayList();
    static ArrayList<Producto> producto = new ArrayList();
    static ArrayList<Almacen> almacen = new ArrayList();
    static int cont = 0, cont2 = 0, cont3 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("*** Seguridad Nacional ***");
            System.out.println("1. Almacen");
            System.out.println("2. Persona");
            System.out.println("3. Producto");
            System.out.println("4. Reportes");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();
            System.out.println();
            int numr = rd.nextInt(2);
            switch (opcion) {
                case 1:
                    Almacen();
                    break;
                case 2:
                    Persona();
                    break;
                case 3:
                    Producto();
                    break;
                case 4:
                    System.out.println("-> Reportes");
                    System.out.println("1. Almacenes");
                    System.out.println("2. Personas");
                    System.out.println("3. Productos");
                    System.out.print("Ingrese su opcion: ");
                    int num2 = sc.nextInt();
                    System.out.println();
                    switch (num2) {
                        case 1:
                            System.out.println("-> Almacenes");
                            for (int i = 0; i < almacen.size(); i++) {
                                System.out.println("- " + almacen.get(i));
                            }
                            break;
                        case 2:
                            System.out.println("-> Personas");
                            for (int i = 0; i < persona.size(); i++) {
                                System.out.println("- " + persona.get(i));
                            }
                            break;
                        case 3:
                            System.out.println("-> Productos");
                            for (int i = 0; i < producto.size(); i++) {
                                System.out.println("- " + persona.get(i));
                            }
                            break;
                    }
                    break;
            }
        } while (opcion != 5);
    }

    public static void Almacen() {
        System.out.println("-> Almacen");
        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Tranferir");
        System.out.print("Ingrese su opcion: ");
        int opcion2 = sc.nextInt();
        System.out.println();
        switch (opcion2) {
            case 1:
                System.out.println("-> Crear");
                System.out.println(" Empleados:");
                for (int i = 0; i < persona.size(); i++) {
                    if (persona.get(i) instanceof Empleado) {
                        System.out.println(i + ". " + persona.get(i));
                    }
                }
                System.out.print("Ingrese el numero del empleado: ");
                int num_empleado = sc.nextInt();
                System.out.println(" Productos:");
                for (int i = 0; i < producto.size(); i++) {
                    System.out.println(i + ". " + producto.size());
                }
                System.out.print("Ingrese el numero del producto: ");
                int num_producto = sc.nextInt();
                System.out.print("Ingrese el tamaño: ");
                double tamano = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = sc.nextDouble();
                System.out.println(" Clientes:");
                for (int i = 0; i < persona.size(); i++) {
                    if (persona.get(i) instanceof Cliente) {
                        System.out.println(i + ". " + persona.get(i));
                    }
                }
                System.out.print("Ingrese el numero del cliente: ");
                int num_cliente = sc.nextInt();
                System.out.println();
                System.out.println("-> Tipos de Almacenes: ");
                System.out.println("1. Almacen de Planta");
                System.out.println("2. Almacen Regional");
                System.out.println("3. Almacen de Plataforma");
                System.out.println("4. Almacen Temporal");
                System.out.print("Ingrese el numero del almacen: ");
                int num_almacen = sc.nextInt();
                System.out.println();
                switch (num_almacen) {
                    case 1:
                        System.out.println("-> Almacen de Planta");
                        System.out.print("Ingrese el numero de plantas: ");
                        int num_plantas = sc.nextInt();
                        Almacen ap = new Almacen_Planta(num_plantas, tamano, altura);
                        ap.getC().add((Cliente) persona.get(num_cliente));
                        ap.getE().add((Empleado) persona.get(num_empleado));
                        ap.getP().add(producto.get(num_producto));
                        almacen.add(ap);
                        break;
                    case 2:
                        System.out.println("-> Almacen Regional");
                        System.out.print("Ingrese el nombre del departamento: ");
                        String nombre = sc.next();
                        Almacen ar = new Almacen_Regionales(nombre, tamano, altura);
                        ar.getC().add((Cliente) persona.get(num_cliente));
                        ar.getE().add((Empleado) persona.get(num_empleado));
                        ar.getP().add(producto.get(num_producto));
                        almacen.add(ar);
                        break;
                    case 3:
                        System.out.println("-> Almacen Plataforma");
                        for (int i = 0; i < almacen.size(); i++) {
                            almacen.get(i).getC().size();
                        }
                        break;
                    case 4:
                        System.out.println("-> Almacen Temporal");
                        Almacen at = new Almacen_Temporales(tamano, altura);
                        at.getC().add((Cliente) persona.get(num_cliente));
                        at.getE().add((Empleado) persona.get(num_empleado));
                        at.getP().add(producto.get(num_producto));
                        almacen.add(at);
                        break;
                }
                System.out.println("Almacen Creado!");
                break;
            case 2:
                System.out.println("-> Modificar");
                System.out.println(" Almacenes:");
                for (int i = 0; i < almacen.size(); i++) {
                    System.out.println(i + ". " + almacen.get(i));
                }
                System.out.print("Ingrese el numero del almacen: ");
                int num_almacen2 = sc.nextInt();
                System.out.println();
                System.out.println("-> Modificar");
                System.out.println("1. Tamaño");
                System.out.println("2. Altura");
                System.out.println("3. Informacion Detallada");
                System.out.print("Ingrese su opcion: ");
                int opcion3 = sc.nextInt();
                System.out.println();
                switch (opcion3) {
                    case 1:
                        System.out.print("Ingrese el tamaño: ");
                        double tamano2 = sc.nextDouble();
                        almacen.get(num_almacen2).setTamano(tamano2);
                        break;
                    case 2:
                        System.out.print("Ingrese la altura: ");
                        double altura2 = sc.nextDouble();
                        almacen.get(num_almacen2).setAltura(altura2);
                        break;
                    case 3:
                        if (almacen.get(num_almacen2) instanceof Almacen_Planta) {
                            System.out.println("-> Almacen Planta");
                            System.out.print("Ingrese el numero de plantas: ");
                            int num_plantas = sc.nextInt();
                            ((Almacen_Planta) almacen.get(num_almacen2)).setNumPlanta(num_plantas);
                        } else {
                            if (almacen.get(num_almacen2) instanceof Almacen_Regionales) {
                                System.out.println("-> Almacen Regional");
                                System.out.print("Ingrese el nombre del departamento: ");
                                String nombre2 = sc.next();
                                ((Almacen_Regionales) almacen.get(num_almacen2)).setDepartamento(nombre2);
                            } else {
                                if (almacen.get(num_almacen2) instanceof Almacen_Plataforma) {
                                    System.out.println("No se puede modificar nada!");
                                } else {
                                    if (almacen.get(num_almacen2) instanceof Almacen_Temporales) {
                                        System.out.println("No se puede modificar nada!");
                                    }
                                }
                            }
                        }
                        break;
                }
                System.out.println("Almacen Modificado!");
                break;
            case 3:
                System.out.println("-> Eliminar");
                for (int i = 0; i < almacen.size(); i++) {
                    System.out.println(i + ". " + almacen.get(i));
                }
                System.out.print("Ingrese el numero del almacen: ");
                int num_almacen3 = sc.nextInt();
                almacen.remove(num_almacen3);
                System.out.println("Almacen Eliminado!");
                break;
            case 4:
                System.out.println("-> Transferir");
                System.out.println(" Almacenes Temporales");
                for (int i = 0; i < almacen.size(); i++) {
                    if (almacen.get(i) instanceof Almacen_Temporales) {
                        System.out.println(i + ". " + almacen.get(i));
                    }
                }
                System.out.print("Ingrese el numero del almacen temporal: ");
                int num_almacen4 = sc.nextInt();
                for (int i = 0; i < almacen.size(); i++) {
                    if (!(almacen.get(i) instanceof Almacen_Temporales)) {
                        System.out.println(i + ". " + almacen.get(i));
                    }
                }
                System.out.print("Ingrese el numero del almacen a transferir: ");
                int num_almacen5 = sc.nextInt();
                System.out.println();
                System.out.println("-> Tranferir");
                System.out.println("1. Empleados");
                System.out.println("2. Productos");
                System.out.println("3. Clientes");
                System.out.print("Ingrese su opcion: ");
                int num_opcion = sc.nextInt();
                System.out.println();
                switch (num_opcion) {
                    case 1:
                        System.out.println("-> Empleados");
                        for (int i = 0; i < almacen.get(num_almacen4).getE().size(); i++) {
                            System.out.println(i + ". " + almacen.get(num_almacen4).getE().get(i));
                        }
                        System.out.print("Ingrese el numero del empleado: ");
                        int num_empleado2 = sc.nextInt();
                        almacen.get(num_almacen5).getE().add(almacen.get(num_almacen4).getE().get(num_empleado2));
                        break;
                    case 2:
                        System.out.println("-> Productos");
                        for (int i = 0; i < almacen.get(num_almacen4).getP().size(); i++) {
                            System.out.println(i + ". " + almacen.get(num_almacen4).getP().get(i));
                        }
                        System.out.print("Ingrese el numero del producto: ");
                        int num_producto2 = sc.nextInt();
                        almacen.get(num_almacen5).getP().add(almacen.get(num_almacen4).getP().get(num_producto2));
                        break;
                    case 3:
                        System.out.println("-> Clientes");
                        for (int i = 0; i < almacen.get(num_almacen4).getC().size(); i++) {
                            System.out.println(i + ". " + almacen.get(num_almacen4).getC().get(i));
                        }
                        System.out.print("Ingrese el numero del cliente: ");
                        int num_cliente2 = sc.nextInt();
                        almacen.get(num_almacen5).getC().add(almacen.get(num_almacen4).getC().get(num_cliente2));
                        break;
                }
                System.out.println("Datos Tranferidos!");
                break;
        }
    }

    public static void Persona() {
        System.out.println("-> Persona");
        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.print("Ingrese su opcion: ");
        int opcion3 = sc.nextInt();
        System.out.println();
        switch (opcion3) {
            case 1:
                System.out.println("-> Crear");
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese el ID: ");
                String id = sc.next();
                System.out.print("Ingrese la edad: ");
                int edad = sc.nextInt();
                System.out.print("Ingrese la altura: ");
                double altura = sc.nextDouble();
                System.out.print("Ingrese el peso: ");
                double peso = sc.nextDouble();
                System.out.print("Ingrese su residencia: ");
                String residencia = sc.next();
                System.out.println();
                System.out.println("-> Tipos de Personas");
                System.out.println("1. Empleado");
                System.out.println("2. Cliente");
                System.out.print("Ingrese su opcion: ");
                int opcion4 = sc.nextInt();
                System.out.println();
                switch (opcion4) {
                    case 1:
                        System.out.println("-> Empleado");
                        System.out.print("Ingrese el sueldo: ");
                        double sueldo = sc.nextDouble();
                        System.out.println();
                        System.out.println("-> Tipos de Empleados: ");
                        System.out.println("1. Empleado de Carga");
                        System.out.println("2. Empleado de Seguridad");
                        System.out.print("Ingrese su opcion: ");
                        int opcion_empleado = sc.nextInt();
                        switch (opcion_empleado) {
                            case 1:
                                System.out.print("Ingrese la hora de entrada: ");
                                String entrada = sc.next();
                                System.out.print("Ingrese la hora de salida: ");
                                String salida = sc.next();
                                System.out.print("Ingrese la fecha : ");
                                Date fecha = new Date();
                                Empleado_Carga pe = new Empleado_Carga(fecha, entrada, salida, sueldo, nombre, residencia, id, edad, altura, peso);
                                persona.add(pe);
                                break;
                            case 2:
                                System.out.print("Ingrese la contraseña: ");
                                String contrasena = sc.next();
                                System.out.print("Ingrese el dia que trabaja: ");
                                String dia = sc.next();
                                System.out.print("Ingrese la clave: ");
                                String clave = sc.next();
                                Empleado_Seguridad ps = new Empleado_Seguridad(contrasena, clave, dia, sueldo, nombre, residencia, id, edad, altura, peso);
                                persona.add(ps);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("-> Cliente");
                        System.out.print("Ingrese el dinero: ");
                        double dinero = sc.nextDouble();
                        System.out.print("Ingrese el año de su compra: ");
                        int ano = sc.nextInt();
                        System.out.print("Ingrese el mes de su compra: ");
                        int mes = sc.nextInt();
                        System.out.print("Ingrese el dia de su compra: ");
                        int dia = sc.nextInt();
                        Calendar c = new GregorianCalendar(ano, mes, dia);
                        System.out.println("-> Productos");
                        for (int i = 0; i < producto.size(); i++) {
                            System.out.println(i + ". " + producto.get(i));
                        }
                        System.out.print("Ingrese su opcion: ");
                        int opcion_3 = sc.nextInt();
                        Cliente pc = new Cliente(dinero, c, nombre, residencia, id, edad, altura, peso);
                        pc.getP().add(producto.get(opcion_3));
                        persona.add(pc);
                        break;
                }
                System.out.println("Persona Creada!");
                break;
            case 2:
                System.out.println("-> Modificar");
                System.out.println(" Personas:");
                for (int i = 0; i < persona.size(); i++) {
                    System.out.println(i + ". " + persona.get(i));
                }
                System.out.print("Ingrese el numero de la persona: ");
                int num_persona = sc.nextInt();
                System.out.println();
                System.out.println("-> Modificar");
                System.out.println("1. Nombre");
                System.out.println("2. ID");
                System.out.println("3. Edad");
                System.out.println("4. Altura");
                System.out.println("5. Peso");
                System.out.println("6. Residencia");
                System.out.println("7. Informacion Detallada");
                System.out.print("Ingrese su opcion: ");
                int opcion_m = sc.nextInt();
                System.out.println();
                switch (opcion_m) {
                    case 1:
                        System.out.print("Ingrese el nombre: ");
                        String nombre2 = sc.next();
                        persona.get(num_persona).setNombre(nombre2);
                        break;
                    case 2:
                        System.out.print("Ingrese el ID: ");
                        String id2 = sc.next();
                        persona.get(num_persona).setID(id2);
                        break;
                    case 3:
                        System.out.print("Ingrese la edad: ");
                        int edad2 = sc.nextInt();
                        persona.get(num_persona).setEdad(edad2);
                        break;
                    case 4:
                        System.out.print("Ingrese la altura: ");
                        double altura2 = sc.nextDouble();
                        persona.get(num_persona).setAltura(altura2);
                        break;
                    case 5:
                        System.out.print("Ingrese el peso: ");
                        double peso2 = sc.nextDouble();
                        persona.get(num_persona).setPeso(peso2);
                        break;
                    case 6:
                        System.out.print("Ingrese la residencia: ");
                        String residencia2 = sc.next();
                        persona.get(num_persona).setResidencia(residencia2);
                        break;
                    case 7:
                        System.out.println("-> Informacion Detallada");
                        if (persona.get(num_persona) instanceof Empleado) {
                            if (persona.get(num_persona) instanceof Empleado_Carga) {
                                System.out.println("1. Sueldo");
                                System.out.println("2. Hora de Entrada");
                                System.out.println("3. Hora de Salida");
                                System.out.print("Ingrese su opcion: ");
                                int opcion_1 = sc.nextInt();
                                switch (opcion_1) {
                                    case 1:
                                        System.out.print("Ingrese el sueldo: ");
                                        double sueldo = sc.nextDouble();
                                        ((Empleado_Carga) persona.get(num_persona)).setSueldo(sueldo);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese la hora de entrada: ");
                                        String entrada2 = sc.next();
                                        ((Empleado_Carga) persona.get(num_persona)).setHoraEntrada(entrada2);
                                        break;
                                    case 3:
                                        System.out.print("Ingrese la hora de salida: ");
                                        String salida2 = sc.next();
                                        ((Empleado_Carga) persona.get(num_persona)).setHoraSalida(salida2);
                                        break;
                                }
                            } else {
                                if (persona.get(num_persona) instanceof Empleado_Seguridad) {
                                    System.out.println("1. Sueldo");
                                    System.out.println("2. Dia que Trabaja");
                                    System.out.print("Ingrese su opcion: ");
                                    int opcion_2 = sc.nextInt();
                                    switch (opcion_2) {
                                        case 1:
                                            System.out.print("Ingrese el sueldo: ");
                                            double sueldo2 = sc.nextDouble();
                                            ((Empleado_Seguridad) persona.get(num_persona)).setSueldo(sueldo2);
                                            break;
                                        case 2:
                                            System.out.print("Ingrese el dia en que trabaja: ");
                                            String dia2 = sc.next();
                                            ((Empleado_Seguridad) persona.get(num_persona)).setDiaTrabajo(dia2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            if (persona.get(num_persona) instanceof Cliente) {
                                System.out.println("1. Dinero del Bolsillo");
                                System.out.println("2. Fecha");
                                System.out.print("Ingrese su opcion: ");
                                int opcion_4 = sc.nextInt();
                                System.out.println();
                                switch (opcion_4) {
                                    case 1:
                                        System.out.print("Ingrese el dinero del bolsillo: ");
                                        double dinero = sc.nextDouble();
                                        ((Cliente) persona.get(num_persona)).setDineroBolsillo(dinero);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese el año de su compra: ");
                                        int ano = sc.nextInt();
                                        System.out.print("Ingrese el mes de su compra: ");
                                        int mes = sc.nextInt();
                                        System.out.print("Ingrese el dia de su compra: ");
                                        int dia = sc.nextInt();
                                        Calendar c = new GregorianCalendar(ano, mes, dia);
                                        ((Cliente) persona.get(num_persona)).setPrimeraCompra(c);
                                        break;
                                }
                            }
                        }
                        break;
                }
                System.out.println("Persona Modificada!");
                break;
            case 3:
                System.out.println("-> Eliminar");
                for (int i = 0; i < persona.size(); i++) {
                    System.out.println(i + ". " + persona.get(i));
                }
                System.out.print("Ingrese el numero de la persona: ");
                int num_per = sc.nextInt();
                persona.remove(num_per);
                System.out.println("Persona Eliminada!");
                break;
        }
    }

    public static void Producto() {
        System.out.println("-> Producto");
        System.out.println("1. Crear");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.print("Ingrese su opcion: ");
        int opcion4 = sc.nextInt();
        System.out.println();
        switch (opcion4) {
            case 1:
                System.out.println("-> Crear");
                System.out.print("Ingrese el año de su emision: ");
                int ano = sc.nextInt();
                System.out.print("Ingrese el mes de su emision: ");
                int mes = sc.nextInt();
                System.out.print("Ingrese el dia de su emision: ");
                int dia = sc.nextInt();
                Calendar c = new GregorianCalendar(ano, mes, dia);
                System.out.print("Ingrese la vida util: ");
                int vida = sc.nextInt();
                System.out.print("Ingrese el precio: ");
                double precio = sc.nextDouble();
                System.out.print("Ingrese el tamaño: ");
                double tamaño = sc.nextDouble();
                System.out.print("Ingrese la descripcion: ");
                String descripcion = sc.next();
                System.out.print("Ingrese el nombre: ");
                String nombre = sc.next();
                System.out.print("Ingrese el numero de productos: ");
                int cantidad = sc.nextInt();
                Producto p = new Producto(c, precio, tamaño, descripcion, nombre, cantidad, vida);
                producto.add(p);
                System.out.println("Producto Creado!");
                break;
            case 2:
                System.out.println("-> Modificar");
                for (int i = 0; i < producto.size(); i++) {
                    System.out.println(i + ". " + producto.get(i));
                }
                System.out.print("Ingrese el numero del producto: ");
                int num_pro = sc.nextInt();
                System.out.println();
                System.out.println("-> Modificar");
                System.out.println("1. Fecha");
                System.out.println("2. Vida Util");
                System.out.println("3. Precio");
                System.out.println("4. Tamaño");
                System.out.println("5. Descripcion");
                System.out.println("6. Nombre");
                System.out.println("7. Numero de Productos");
                System.out.print("Ingrese su opcion: ");
                int num_opcion = sc.nextInt();
                System.out.println();
                switch (num_opcion) {
                    case 1:
                        System.out.print("Ingrese el año de su emision: ");
                        int ano2 = sc.nextInt();
                        System.out.print("Ingrese el mes de su emision: ");
                        int mes2 = sc.nextInt();
                        System.out.print("Ingrese el dia de su emision: ");
                        int dia2 = sc.nextInt();
                        Calendar c2 = new GregorianCalendar(ano2, mes2, dia2);
                        producto.get(num_pro).setFechaEmision(c2);
                        break;
                    case 2:
                        System.out.print("Ingrese la vida util: ");
                        int vida2 = sc.nextInt();
                        producto.get(num_pro).setVidaUtil(vida2);
                        break;
                    case 3:
                        System.out.print("Ingrese el precio: ");
                        double precio2 = sc.nextDouble();
                        producto.get(num_pro).setPrecio(precio2);
                        break;
                    case 4:
                        System.out.print("Ingrese el tamaño: ");
                        double tamano2 = sc.nextDouble();
                        producto.get(num_pro).setTamano(tamano2);
                        break;
                    case 5:
                        System.out.print("Ingrese la descripcion: ");
                        String descripcion2 = sc.next();
                        producto.get(num_pro).setDescripcion(descripcion2);
                        break;
                    case 6:
                        System.out.print("Ingrese el nombre: ");
                        String nombre2 = sc.next();
                        producto.get(num_pro).setNombreProducto(nombre2);
                        break;
                    case 7:
                        System.out.print("Ingrese el numero de productos: ");
                        int cantidad2 = sc.nextInt();
                        producto.get(num_pro).setNumeroProductos(cantidad2);
                        break;
                }
                System.out.println("Producto Modificado!");
                break;
            case 3:
                System.out.println("-> Eliminacion");
                for (int i = 0; i < producto.size(); i++) {
                    System.out.println(i + ". " + producto.get(i));
                }
                System.out.print("Ingrese su opcion: ");
                int op = sc.nextInt();
                producto.remove(op);
                System.out.println("Producto Eliminado");
                break;
        }
    }
}
