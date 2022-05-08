public class Decryption {
    
    public static String decryptMessage(String message, int key) {
        int length = message.length();
        String output = "";

        for(int i = 0; i < length; i++) {
            if(message.charAt(i) != ' ') {
                int letterNumber = Encryption.letterFinder(message.charAt(i));
                if(((letterNumber - key) >= 0) && ((letterNumber - key) < 26)) {
                    output += Encryption.letterChange((letterNumber - key));
                }
                if((letterNumber - key) < 0) {
                    output += Encryption.letterChange((letterNumber - key) + 26);
                }
            }
            else {
                output += ' ';
            }
        }
        return output;
    }
}