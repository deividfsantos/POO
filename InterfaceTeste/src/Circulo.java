public class Circulo implements AreaCalculavel {

    private double raio;

    public double calculaArea(){
        return Math.PI*Math.pow(raio, 2);
    }


}
