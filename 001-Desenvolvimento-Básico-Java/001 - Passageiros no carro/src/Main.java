public class Main {

    public static void main(String[] args){
        Carro carro = new Carro();

        System.out.println("Existem " + carro.capacity + " pessoas no carro" );
        carro.removePassenger();
        System.out.println("Existem " + carro.capacity + " pessoas no carro" );
        carro.addPassenger();
        System.out.println("Existem " + carro.capacity + " pessoas no carro" );




    }
}
