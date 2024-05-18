import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash{
    public static String sha256Hash(String mot){
        String hash = null;
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(mot.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();
            
            hash = String.format("0x%064x", new BigInteger(1, digest));
        } catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
        return hash;
    }
}