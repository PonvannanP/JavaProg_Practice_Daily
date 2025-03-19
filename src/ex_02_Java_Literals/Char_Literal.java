package ex_02_Java_Literals;

public class Char_Literal {
    public static void main(String[] args) {
        char del='\n';
        char tab_line='\t';
        char back_space='\b';
        char carraige_return='\r';
        System.out.println("Pon"+'\n'+"van");//\n will print to next line
        System.out.println("Pon"+'\t'+"van");// \t will provide space inbetween
        System.out.println("Pon"+'\b'+"van");// \b will delete space inbetween
        System.out.println("Pon"+'\r'+"van");// \r will delete the first word
    }
}
