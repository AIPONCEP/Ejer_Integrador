package postnet;
/**
 * Definimos ticket con sus atributos
 * @author 1dam Ana Isabel Ponce Pérez
 */
class Ticket {
  
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;
    
/** 
 * constructor ticket
 * @param nombreApellido
 * @param montoTotal
 * @param montoPorCuota 
 */
    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    // GETS

    public String getNombreApellido() {
        return nombreApellido;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    //SETS
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }
    
    
    
}
