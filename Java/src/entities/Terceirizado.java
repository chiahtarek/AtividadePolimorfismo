package entities;

public class Terceirizado extends Funcionario {
    Double adicional;

    public Terceirizado(String nome, int horas, Double valor_hora, Double adicional) {
        super(nome, horas, valor_hora);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    @Override
    public Double pagamento() {
        double ad = adicional * 1.1;
        return getHoras() * getValor_hora() + ad;
    }

}
