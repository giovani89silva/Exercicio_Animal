package POO;

     
public class Executando_Carro {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Chevrolet", "Celta", 2005, false, "Branco");
        Carro carro2 = new Carro("Nissan", "March", 2019, true);

        System.out.println("Carro 1 = " + carro1.toString());
        System.out.println("Mandei pintar o Celta");
        carro1.setCor = ("Vermelho");
        System.out.println("Carro 1 = " + carro1.toString());
        System.out.println("Carro 2 = " + carro2.toString());

        carro2.Parar();
        System.out.println(carro2.VoltouAndar());

        System.out.println("Qual o carro mais novo?");
        if (carro1.getAno() > carro2.getAno()) {
            System.out.println("Carro 1 Ã© o mais novo");
        } else {
            System.out.println("Carro 2 Ã© o mais novo");
        }


    }

}
