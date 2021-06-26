public class Carro {

    public Integer capacity = 5;

    public int removePassenger(){
        return capacity -= 1;
    }
    public int addPassenger(){
        return capacity += 1;
    }
}
