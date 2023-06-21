/*Write a Java program to convert a string to lowercase.
Write a Java program to replace spaces with underscores.
Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
Write a Java program to detect double and triple spaces in a string.
Write a program to format the following letter using escape sequence characters.*/
public class j6 {
    
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

         //Problem 2
        String text = "To My Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        

        // Problem 4
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

    }
}

    

