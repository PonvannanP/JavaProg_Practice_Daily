package ex_02_Java_Literals;

public class Char_Literal {
    public static void main(String[] args) {
        char del='\n';
        char tab_line='\t';
        char back_space='\b';
        char carraige_return='\r';
        System.out.println("Pramod"+'\n'+"Dutta");//\n will print to next line
        System.out.println("Pramod"+'\t'+"Dutta");// \t will provide space inbetween
        System.out.println("Pramod"+'\b'+"Dutta");// \b will delete space inbetween
        System.out.println("Pramod"+'\r'+"Dutta");// \r will delete the first word
    }
}
