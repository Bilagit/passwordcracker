import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DictionnaryCracker extends PasswordCracker {
    public String crackPassword(String hash){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\Bila\\Desktop\\JAVA\\design patterns\\PasswordCracker\\mots.txt"));
            while (sc.hasNextLine()) {
                String mot = sc.nextLine();
                String h = Hash.sha256Hash(mot);
                if (hash.equals(h)) {
                    System.out.println("Mot de passe cracké !");
                    sc.close();
                    return mot;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mot de passe non trouvé");
        sc.close();
        return "";
    }
}
