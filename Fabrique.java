public class Fabrique {
    public static PasswordCracker getInstance(String type){
        switch (type) {
            case "dictionnary":
                return new DictionnaryCracker();
            case "bruteforce":
                return new BruteForceCracker();    
            default:
                throw new IllegalArgumentException("Invalid cracker type: " + type);
        }
    }
}
