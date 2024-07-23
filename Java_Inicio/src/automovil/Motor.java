package automovil;

public class Motor {
    private double cilindrada;
    private TipoMotor tipo;

    public Motor(){

    }

    public Motor(TipoMotor tipo, double cilindrada) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
