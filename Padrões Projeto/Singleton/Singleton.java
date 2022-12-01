public class Singleton {
    
    private static Singleton instance = null;

    public static Singleton getSingleton(){
        if(instance == null){
            System.out.println("Instância criada com sucesso.");
            instance = new Singleton();
        }else{
            System.out.println("Instância já criada anteriormente!");
        }
        return instance;
    }
}