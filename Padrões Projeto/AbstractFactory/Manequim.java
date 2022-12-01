public class Manequim {
    RoupaTronco tronco;
    RoupaPernas perna;
    RoupaPes pes;

    public Manequim(FactoryRoupa trajeRoupa) {
        this.tronco = trajeRoupa.criaRoupaTronco();
        this.perna = trajeRoupa.criaRoupaPernas();
        this.pes = trajeRoupa.criaRoupaPes();
    }

    public void colocarRoupa(FactoryRoupa trajeRoupa) {
        System.out.println("Manequim está com a roupa");
        this.tronco = trajeRoupa.criaRoupaTronco();
        this.perna = trajeRoupa.criaRoupaPernas();
        this.pes = trajeRoupa.criaRoupaPes();
    }

}