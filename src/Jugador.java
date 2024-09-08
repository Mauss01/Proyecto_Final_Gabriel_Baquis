import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class Jugador {
    static Scanner sc = new Scanner (System.in);
    static Inventario inventario = new Inventario();
    private Facciones razaSeleccionada;
    private ArrayList<Unidad> unidades;
    private int recursos;
    private int dinero;
    private int ataque;
    private int defensa;
    private int honor;
    private ArrayList<Facciones> enemigos;
     private ArrayList<Facciones> alianzas;
    
    public Jugador() {
        this.razaSeleccionada = null; 
        this.unidades = new ArrayList<>();
        this.recursos = 0;
        this.dinero = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.honor = 0;
        this.enemigos = new ArrayList<>();
        this.alianzas = new ArrayList<>();
    }
    public Facciones getRazaSeleccionada() {
        return razaSeleccionada;
    }

    public void setRazaSeleccionada(Facciones razaSeleccionada) {
        this.razaSeleccionada = razaSeleccionada;
        this.unidades = razaSeleccionada.getUnidades();
        this.recursos = razaSeleccionada.getRecursos();
        this.dinero = razaSeleccionada.getDinero();
        this.ataque = razaSeleccionada.getAtaque();
        this.defensa = razaSeleccionada.getDefensa();
    }

    public ArrayList<Unidad> getUnidades() {
        return unidades;
    }

    public void setUnidades(ArrayList<Unidad> unidades) {
        this.unidades = unidades;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public ArrayList<Facciones> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Facciones> enemigos) {
        this.enemigos = enemigos;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public ArrayList<Facciones> getAlianzas() {
        return alianzas;
    }

    public void setAlianzas(ArrayList<Facciones> alianzas) {
        this.alianzas = alianzas;
    }
    
    public void restarDinero(int cantidad){
        dinero = dinero - cantidad;
    }
    public void aumentarDinero(int cantidad){
        dinero = dinero + cantidad;
    }
    public void aumentarataque(int cantidad){
        ataque = ataque + cantidad;
    }
    public void aumentardefensa(int cantidad){
        defensa = defensa + cantidad;
    }
    public void restardefensa(int cantidad){
        defensa = defensa - cantidad;
    }
    void venderUnidades(Jugador jugador) {
        ArrayList<Unidad> unidadesJugador = getUnidades();

        if (unidadesJugador.isEmpty()) {
            System.out.println("No tienes unidades para vender.");
            return;
        }

        System.out.println("-- Vender unidades --");
        for (int i = 0; i < unidadesJugador.size(); i++) {
            Unidad unidad = unidadesJugador.get(i);
            System.out.println((i + 1) + ") " + unidad.getNombre() + " - Cantidad: " + unidad.getCantidad());
        }
        System.out.println("0) Salir.");

        System.out.print("Seleccione el numero de la unidad que desea vender: ");
        int seleccion = sc.nextInt();

        if (seleccion >= 1 && seleccion <= unidadesJugador.size()) {
            Unidad unidadSeleccionada = unidadesJugador.get(seleccion - 1);
            unidadesJugador.remove(unidadSeleccionada);
            int ganancia = unidadSeleccionada.getCosto() / 2; 
            aumentarDinero(ganancia);
            System.out.println("Vendiste " + unidadSeleccionada.getNombre() + ". Dinero ganado: " + ganancia + ". Dinero actual: " + getDinero());
        } else {
            if (seleccion == 0) {
                Pantalla.Mercado(jugador, inventario);
            }
            System.out.println("Seleccion no válida.");
        }
    }
    public void hacerAlianza(Facciones faccion) {
        alianzas.add(faccion);
        enemigos.remove(faccion); 
    }

    void aumentarHonor(int i) {
        honor = honor + i;
    }

    void aumentarRecursos(int recur) {
        recursos = recursos + recur;
    }
}
