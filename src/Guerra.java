/**
 *
 * @author gabri
 */
public class Guerra {
    private int daño;
    private int recursos;
    private int honor;
    
    public Guerra(int daño,int recursos, int honor){
        this.daño= daño;
        this.recursos = recursos;
        this.honor = honor;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getRecursos() {
        return recursos;
    }

    public void setRecursos(int recursos) {
        this.recursos = recursos;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }
}
