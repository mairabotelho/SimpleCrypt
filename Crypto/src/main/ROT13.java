public class ROT13 {

    String alpha = "abcdefghijklmnopqrstuvwxyz";
    String rotated = rotate(alpha, 'n');

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }

    public String crypt(String text) throws UnsupportedOperationException {
        return text;
    }

    public String encrypt(String text) {
        String crypted = "";
        int index;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    index = alpha.indexOf(Character.toLowerCase(text.charAt(i)));
                    crypted += Character.toUpperCase(rotated.charAt(index));

                } else {
                    index = alpha.indexOf(text.charAt(i));
                    crypted += rotated.charAt(index);

                }
            } else {
               crypted += text.charAt(i);
            }
        }
        return crypted;
    }


    public String decrypt(String text) {
        return encrypt(text);
    }

    public static String rotate(String s, Character c) {
        return s.substring(s.indexOf(c)) + s.substring(0, s.indexOf(c));
    }
}