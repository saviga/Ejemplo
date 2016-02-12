public class DadoNombres {
    static int num;
    static String[] Nombres ={"Pepe","Tífani","Andrea","Julian","Norma","Adrián"};
    public static void main(String[] args) {
        dameUnNombre();
    }
    //cambio1
    public static void dameUnNombre(){
        
        num= (int) (Math.random()*6);
        System.out.print(num);
        System.out.print(Nombres[num]);
        System.out.println("Hola creo que esta muy bien")
    }
}
