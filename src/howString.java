public class howString {

    public static void main(String[] args){

        String original = "aasdfaa SDFSDKF AFK    ";
        System.out.println(original);

        String s01 = original.toLowerCase();
        System.out.println("- " + s01 + "-");

        String s02 = original.toUpperCase();
        System.out.println("- " + s02 + "-");

        String s03 = original.trim();
        System.out.println("- " + s03 + "-");

        String s04 = original.substring(2); // vai pegar o caractere 2 em diante
        System.out.println("- " + s04 + "-");

        String s05 = original.substring(2, 9); // vai pegar o caractere dois até o 8 (limite 9)
        System.out.println("- " + s05 + "-");

        String s06 = original.replace("a", "x");
        System.out.println("- " + s06 + " -");

        String s07 = original.replace("aa", "wx");
        System.out.println("- " + s07 + " -");

        int i = original.indexOf("aa");
        System.out.println("- " + i + " -");

        int j = original.lastIndexOf("aa");
        System.out.println("- " + j + " -");

        String[] s08 = original.split(" "); // o split gera um vetor com as partes que foram separadas pelo espaço, recortando-as.
        System.out.println("- " + s08[0] + "\n" + s08[1] + " -");

    }

}
