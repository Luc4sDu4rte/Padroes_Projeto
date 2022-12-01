public class TrajeFactoryFormal extends FactoryRoupa{

    @Override
    public RoupaTronco criaRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camisa();
    }
    @Override
    public RoupaPernas criaRoupaPernas() {
        // TODO Auto-generated method stub
        return new Calca();
    }

    @Override
    public RoupaPes criaRoupaPes() {
        // TODO Auto-generated method stub
        return new Sapato();
    }

}