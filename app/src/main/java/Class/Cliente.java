package Class;

public class Cliente {
    private String[] nombre={"Jacinta","Sermieh"};
    private int[] salario={45000,55000};

    public Cliente() {
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getSalario() {
        return salario;
    }

    public void setSalario(int[] salario) {
        this.salario = salario;
    }
}
