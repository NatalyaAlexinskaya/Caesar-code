package com.company;

public class Alphabet {
    private static final int n = 33;
    private static char[] upper =
            {'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М','Н','О','П','Р',
                    'С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

    private static char[] lower= {'а','б','в','г','д','е','ё','ж',
            'з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};

    public String decryption(String text, int k) {
        StringBuilder dec = new StringBuilder();

        for(int i = 0; i < text.length(); ++i){
            char c = text.charAt(i);

            if (findIndLower(c) == -1 && findIndUpper(c) == -1){
                dec.append(c);
            } else if(findIndLower(c) == -1){
                int x = (findIndUpper(c)-k+n)%n;
                dec.append(upper[x]);
            } else if (findIndUpper(c) == -1) {
                int x = (findIndLower(c)-k+n)%n;
                dec.append(lower[x]);
            }
        }
        return dec.toString();
    }

    private static int findIndUpper(char c){
        int rez = -1;

        for(int i=0; i<upper.length; i++){
            if(c == upper[i]) rez = i;
        }
        return rez;
    }

    private static int findIndLower(char c){
        int rez = -1;

        for(int i=0; i<lower.length; i++){
            if(c == lower[i]) rez = i;
        }
        return rez;
    }
}
