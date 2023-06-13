public class j5 {
    public static void main(String[] args) {
        String name = "gaurav";
        int value = name.length();
        String lstring = name.toLowerCase();
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        System.out.println(lstring);
        System.out.println(value);
        String nontrimmedstring = "    Gaurav   ";
        System.out.println(nontrimmedstring);
        String trimmedstring = nontrimmedstring.trim();
        System.out.println(trimmedstring);
        System.out.println(name.substring(3)); //System.out.println( 0/1/2/3/4/5);
        System.out.println(name.substring(1,6)); //Gaurav = 0,1,2,3,4,5........
        System.out.println(name.replace('G','a'));  //old char=G and new char = a;
        System.out.println(name.replace("Gau","Sau"));
        System.out.println(name.replace("G","Sau"));
        System.out.println(name.startsWith("Ga"));
        System.out.println(name.endsWith("av"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("r"));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("a",3));
        System.out.println(name.equals("gaurav"));
        System.out.println(name.equalsIgnoreCase("gaurav"));





    }
}    