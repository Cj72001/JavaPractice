public class App {
    public static void main(String[] args) throws Exception {
        

    System.out.println("Levels for 'LEVEL ENUM': ");
    
    for(Level le:Level.values()){
        System.out.println(le);
    }

    String respuesta = "m";
    Level l = Level.NO_LEVEL;
    
    if(respuesta.equals("e")){
        l = Level.EASY;
    }
    else if(respuesta.equals("m")){
        l = Level.MEDIUM;
    }
    else{
        l = Level.HIGH;
    }
    

    switch(l){
        case EASY:
        System.out.println("Welcome to the easy level");
        break;

        case MEDIUM:
        System.out.println("Welcome to the medium level");
        break;

        case HIGH:
        System.out.println("Welcome to the high level");
        break;
    }

    }
}
