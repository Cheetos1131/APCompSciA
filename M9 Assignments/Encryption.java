public class Encryption {
    final static char alphabet[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static String encryptMessage(String message, int shiftKey) {
        int length = message.length();
        String output = "";

        for(int i = 0; i < length; i++) {
            if(message.charAt(i) != ' ') {
                int letterNumber = letterFinder(message.charAt(i));
                if(((letterNumber + shiftKey) >= 0) && ((letterNumber + shiftKey) < 26)) {
                    output += letterChange((letterNumber + shiftKey));
                }
                if((letterNumber + shiftKey) >= 26) {
                    output += letterChange((letterNumber + shiftKey) - 26);
                }
            }
            else {
                output += ' ';
            }
        }
        return output;
    }

    public static int letterFinder(char letter) {
        int position = 0;
        for(int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == letter) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static char letterChange(int j) {
        char newLetter = ' ';
        newLetter = alphabet[j];
        return newLetter;
    }
}