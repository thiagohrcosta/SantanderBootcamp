public class Main {
  public static void main(String[] args) {

    Gerente gerente = new Gerente();
    gerente.setNome("Apollo Creed");
    gerente.setSalario(5000.0);

    Supervisor supervisor = new Supervisor();
    supervisor.setNome("Rocky Balboa");
    supervisor.setSalario(3500.0);

    Atendente atendente = new Atendente();
    atendente.setNome("John Doe");
    atendente.setSalario(1500.0);

    System.out.println("O imposto pago pelo gerente " + gerente.getNome() + " é de: " + gerente.calculaImposto());
    System.out.println("O imposto pago pelo supervisor " + supervisor.getNome() + " é de: " + supervisor.calculaImposto());
    System.out.println("O imposto pago pelo atendente " +atendente.getNome() + " é de: " + atendente.calculaImposto());
  }
}
