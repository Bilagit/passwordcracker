import java.util.Scanner;

public class App {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle méthode voulez-vous utiliser ? : ");
        String choix = sc.nextLine();
        PasswordCracker cracker = Fabrique.getInstance(choix);
        System.out.print("Entrez le hash : ");
        String hash = sc.nextLine();
        String reponse = cracker.crackPassword(hash);
        if (!reponse.equals("")) {
            System.out.println("Mot de passe :" + reponse);
        }
        sc.close();
   } 
}



//0x31f7a65e315586ac198bd798b6629ce4903d0899476d5741a9f32e2e521b6a66

//0x3bc3f91d74181dbc1e1ca1aa1310885a6999baa7459064eea2e71ac37750d733