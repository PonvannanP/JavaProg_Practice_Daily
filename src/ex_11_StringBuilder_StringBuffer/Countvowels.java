package ex_11_StringBuilder_StringBuffer;

public class Countvowels {
    public static void main(String[] args) {
        String input="Java";
        int vowels=0;
        int consonants=0;

        input=input.toLowerCase();// Input to convert to Lowercase
        System.out.println(input);

        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels=vowels+1;// vowels count will increase by 1
                consonants=consonants+1;// consonants count will increase by 1
            }

            System.out.println("Number of vowels: "+vowels);// no.of vowewls will be printed
            System.out.println("Number of consonants: "+consonants);// no.of consonants will
            // be printed
        }
    }
}
