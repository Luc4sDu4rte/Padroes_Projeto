public class TrajeFactoryCasual extends FactoryRoupa{
    
    @Override
    public RoupaTronco criaRoupaTronco() {
        // TODO Auto-generated method stub
        return new Camiseta();
    }

    @Override
    public RoupaPernas criaRoupaPernas() {
        // TODO Auto-generated method stub
        return new Bermuda();
    }

    @Override
    public RoupaPes criaRoupaPes() {
        // TODO Auto-generated method stub
        return new Tenis();
    }

}