/**
 *
 * @author gabri
 */
public class Inventario {
    private int Flores;
    private int Piedras_preciosas;
    private int madera;
    private int objetos_miticos;
    private int objetos_magicos;
    private int pociones;
    private int armaduras;
    private int armas;
    public Inventario (){
        
    }
    public Inventario(int Flores,int Piedras_preciosas, int madera, int objetos_miticos, int objetos_magicos, int pociones, int armaduras, int armas){
        this.Flores=0;
        this.Piedras_preciosas=0;
        this.madera=0;
        this.objetos_miticos=0;
        this.objetos_magicos=0;
        this.pociones=0;
        this.armaduras=0;
        this.armas=0;
    }

    public int getFlores() {
        return Flores;
    }

    public void setFlores(int Flores) {
        this.Flores = Flores;
    }

    public int getPiedras_preciosas() {
        return Piedras_preciosas;
    }

    public void setPiedras_preciosas(int Piedras_preciosas) {
        this.Piedras_preciosas = Piedras_preciosas;
    }

    public int getMadera() {
        return madera;
    }

    public void setMadera(int madera) {
        this.madera = madera;
    }

    public int getObjetos_miticos() {
        return objetos_miticos;
    }

    public void setObjetos_miticos(int objetos_miticos) {
        this.objetos_miticos = objetos_miticos;
    }

    public int getObjetos_magicos() {
        return objetos_magicos;
    }

    public void setObjetos_magicos(int objetos_magicos) {
        this.objetos_magicos = objetos_magicos;
    }

    public int getPociones() {
        return pociones;
    }

    public void setPociones(int pociones) {
        this.pociones = pociones;
    }

    public int getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(int armaduras) {
        this.armaduras = armaduras;
    }

    public int getArmas() {
        return armas;
    }

    public void setArmas(int armas) {
        this.armas = armas;
    }
    
    public void venderFlores(int cantidad) { 
        Flores = Flores - cantidad;
    }    
    public void agregarFlores(int cantidad) { 
        Flores = Flores + cantidad;
    }   
    public void venderMadera(int cantidad) { 
        madera = madera - cantidad;
    }    
    public void agregarMadera(int cantidad) { 
        madera = madera + cantidad;
    }
    public void venderObjetos_miticos(int cantidad) { 
        objetos_miticos = objetos_miticos - cantidad;
    }    
    public void agregarObjetos_miticos(int cantidad) { 
        objetos_miticos = objetos_miticos + cantidad;
    }
    public void venderObjetos_magicos(int cantidad) { 
        objetos_magicos = objetos_magicos - cantidad;
    }    
    public void agregarObjetos_magicos(int cantidad) { 
        objetos_magicos = objetos_magicos + cantidad;
    }
    public void venderPociones(int cantidad) { 
        pociones = pociones - cantidad;
    }    
    public void agregarPociones(int cantidad) { 
        pociones = pociones + cantidad;
    }
    public void venderArmaduras(int cantidad) { 
        armaduras = armaduras - cantidad;
    }    
    public void agregarArmaduras(int cantidad) { 
        armaduras = armaduras + cantidad;
    }
    public void venderArmas(int cantidad) { 
        armas = armas - cantidad;
    }    
    public void agregarArmas(int cantidad) { 
        armas = armas + cantidad;
    }
    public void venderPiedras_Preciosas(int cantidad) { 
        Piedras_preciosas = Piedras_preciosas - cantidad;
    }    
    public void agregarPiedras_Preciosas(int cantidad) { 
        Piedras_preciosas = Piedras_preciosas + cantidad;
    }
}
