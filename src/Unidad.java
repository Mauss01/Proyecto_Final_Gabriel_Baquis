/**
 *
 * @author gabri
 */
public class Unidad {
    private String Nombre;
    private int cantidad;
    private int costo;
    private String tipo;
    private int poder;

    public Unidad() {
    }
    
    
    public Unidad(String Nombre,int cantidad,int costo, String tipo, int poder){
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.costo = costo;
        this.tipo = tipo;
        this.poder = poder + calcularPoder();
    }
    public Unidad(Unidad unidad) {
        this.Nombre = unidad.Nombre;
        this.cantidad = unidad.cantidad;
        this.costo = unidad.costo;
        this.tipo = unidad.tipo;
        this.poder = unidad.poder;
    }
    
    private int calcularPoder() {
        int multiplicador;
        switch (tipo.toLowerCase()) {
            case "infanteria":
                multiplicador = 1; 
                break;
            case "caballeria":
                multiplicador = 2; 
                break;
            case "artilleria":
                multiplicador = 4; 
                break;
            case "mago":
                multiplicador = 5; 
                break;
            default:
                multiplicador = 0; 
                break;
        }        
        return (int) (cantidad * multiplicador);
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Tipo: " + tipo + ", Cantidad: " + cantidad + ", Poder: " + poder;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }        
}
