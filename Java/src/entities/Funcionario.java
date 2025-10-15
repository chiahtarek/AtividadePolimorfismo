package entities;

public class Funcionario {
   private String nome; 
   private int horas;
   private Double valor_hora;

   public String getNome() {
    return nome;
   }
   public void setNome(String nome) {
    this.nome = nome;
   }
   public int getHoras() {
    return horas;
   }
   public void setHoras(int horas) {
    this.horas = horas;
   }
   public Double getValor_hora() {
    return valor_hora;
   }
   public void setValor_hora(Double valor_hora) {
    this.valor_hora = valor_hora;
   }
   public Funcionario(String nome, int horas, Double valor_hora) {
    this.nome = nome;
    this.horas = horas;
    this.valor_hora = valor_hora;
   }
   public Double pagamento(){
    return horas * valor_hora; 
   }

}
