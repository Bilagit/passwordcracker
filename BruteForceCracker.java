public class BruteForceCracker extends PasswordCracker {
    String lettres[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}; 
    public String crackPassword(String hash){
        String chaine = "";
        String h = "";
        for (String lettre : lettres) {
            chaine = lettre;
            h = Hash.sha256Hash(chaine);
            if (h.equals(hash)) {
                System.out.println("Mot de passe trouvé");
                return chaine;
            }
            for (String lettre2 : lettres) {
                chaine = lettre + lettre2;
                h = Hash.sha256Hash(chaine);
                if (h.equals(hash)) {
                    System.out.println("Mot de passe trouvé");
                    return chaine;
                }
                for (String lettre3 : lettres) {
                    chaine = lettre + lettre2 + lettre3;
                    h = Hash.sha256Hash(chaine);
                    if (h.equals(hash)) {
                        System.out.println("Mot de passe trouvé");
                        return chaine;
                    }
                    for (String lettre4 : lettres) {
                        chaine = lettre + lettre2 + lettre3 + lettre4;
                        h = Hash.sha256Hash(chaine);
                        if (h.equals(hash)) {
                            System.out.println("Mot de passe trouvé");
                            return chaine;
                        }
                        for (String lettre5 : lettres) {
                            chaine = lettre + lettre2 + lettre3 + lettre4 + lettre5;
                            h = Hash.sha256Hash(chaine);
                            if (h.equals(hash)) {
                                System.out.println("Mot de passe trouvé");
                                return chaine;
                            }
                            for (String lettre6 : lettres) {
                                chaine = lettre + lettre2 + lettre3 + lettre4 + lettre5 + lettre6;
                                h = Hash.sha256Hash(chaine);
                                if (h.equals(hash)) {
                                    System.out.println("Mot de passe trouvé");
                                    return chaine;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Mot de passe non trouvé");
        return "";
    }
}

