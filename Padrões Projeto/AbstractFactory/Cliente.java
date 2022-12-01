public class Cliente{
    public static void main(String[] args) {
        
    FactoryRoupa trajeRoupaFormal = new TrajeFactoryFormal();
    TrajeFactoryCasual trajeRoupaCasual = new TrajeFactoryCasual();
    Manequim manequim = new Manequim(trajeRoupaCasual);
    manequim.colocarRoupa(trajeRoupaCasual);
    }
    
}