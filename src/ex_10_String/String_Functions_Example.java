package ex_10_String;

public class String_Functions_Example {
    public static void main(String[] args) {
        String name="Java";
        System.out.println(name.length());// Determines the total length of the string
        System.out.println(name.charAt(1));// CharAt works with index in index[1] 'a'
        //is present so it prints a
        System.out.println(name.concat("home"));// Add the home value with Java
        System.out.println(name.equals("Java"));// Returns true because it matches
        //with String
        System.out.println(name.equalsIgnoreCase("java"));// Returns true
        // because it ignores the case only matches with string value
        System.out.println(name.indexOf("v"));// index of v is at 2
        System.out.println(name.replace("Java","Home"));// replaces
        // the String value Java with Home
        //Split function
        String name_r="PonvannanPaulraj";
        String[] split=name_r.split("a");//split will be stored in array and string
        // will be spllited with given value
        System.out.println(split[0]);//O/P:Ponv
        System.out.println(split[1]);//nn
        System.out.println(split[2]);//nP
        System.out.println(split[3]);//ulr
        System.out.println(split[4]);//j


        String name5="Ranjar";
        System.out.println(name5.startsWith("R"));// This is true because the string starts
        //with R
        System.out.println(name5.endsWith("r")); //This is true because the string ends
        //with r

        String name8=" Ponvan ";
        System.out.println(name8.trim());// Remove the spaces in the string

        String name_8="raja";
        System.out.println(name_8.compareTo("raja"));// it compares with the String if both
        // are equal then it returns true i.e. 0 otherwise it returns false

        String name9="Ponvannn";
        System.out.println(name9.compareToIgnoreCase("ponvannn"));

        String name10="School";
        System.out.println(name10.substring(1,5));// substring is it starts with beginindex value and ends
        // with endIndexvalue-1.

        String _s1="null";
        String _s2="pull";
        String result=_s1+_s2;
        System.out.println(result);// it will add both the strings

        String n="Null";
        //System.out.println(n.indexOf("l"));// it will returns 2 value
        //System.out.println(n.lastIndexOf("l"));// it will returns 3 value last index
        // value of l
        System.out.println(n.indexOf("a"));// if we get index of char which is not presented
        // in string then it returns -1 value.









    }

}
