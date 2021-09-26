package Class;

public class Jarron {
    private String[] material={"Cerámica","Porcelana","Vidrio"};
    private int precio;
    private int costoAdicional;

    public Jarron() {
    }

    public String[] getMaterial() {
        return material;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(int costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public int calcularCosto(int precio, int costo){
        int resultado=precio+costo;
        return resultado;
    }
}

