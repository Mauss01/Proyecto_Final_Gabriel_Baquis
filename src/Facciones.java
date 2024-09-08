import java.util.ArrayList;
/**
 *
 * @author gabri
 */
public class Facciones {
    private String nombre;
    private ArrayList<Unidad> unidades;
    private int recursos;
    private int dinero;
    private int ataque;
    private int defensa;
    private boolean esEnemigo;
    
    public Facciones(String nombre, int recursos, int dinero, int ataque, int defensa) {
        this.unidades = new ArrayList<>(); 
        this.nombre = nombre;
        this.recursos = recursos;
        this.dinero = dinero;
        this.ataque = ataque;
        this.defensa = defensa;
        this.esEnemigo = false;
    }

    public Facciones(String nombre, ArrayList<Unidad> unidades, int recursos, int dinero, int ataque, int defensa, boolean esEnemigo) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.recursos = recursos;
        this.dinero = dinero;
        this.ataque = ataque;
        this.defensa = defensa;
        this.esEnemigo = esEnemigo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public boolean isEsEnemigo() {
        return esEnemigo;
    }

    public void setEsEnemigo(boolean esEnemigo) {
        this.esEnemigo = esEnemigo;
    }
    @Override
    public String toString(){
        return  nombre; 
    }
}
