package campos;

public class CampoPredefinido extends Campo {

    private String[] valores;

    public CampoPredefinido(String etiqueta, String... valores) {
        super(etiqueta);
        this.valores = valores;
    }

    @Override
    public boolean condicion(){
        for (String valor : valores) {
            if (getDato().toLowerCase().equals(valor.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
