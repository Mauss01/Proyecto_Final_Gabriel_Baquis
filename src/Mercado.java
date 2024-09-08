/**
 *
 * @author gabri
 */
public class Mercado {
    private String nombre;
    private int cantidad;
    private int valor;
    private String tienda;
    
    public Mercado(String nombre, int cantidad, int valor, String tienda){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.valor=valor;
        this.tienda=tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
}
