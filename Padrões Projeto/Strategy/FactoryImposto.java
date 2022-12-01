public class FactoryImposto {
    
    private static FactoryImposto factory = null;
    public static FactoryImposto getFactory() {
        if (factory == null) {
            factory = new FactoryImposto();
        }
        return factory;
    }

    public Imposto getImposto(String tipo, double valor){
        switch (tipo) {
            case "ICMS":
                return new ICMS(valor);
            case "IPI":
                return new IPI(valor);
        }
        return null;
    }

}