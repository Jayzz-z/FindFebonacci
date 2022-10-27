//ReverseString using StringBuilder.

public static void main(String[] arg) {

// declaring variable

         String input = "Independent";

         // creating StringBuilder object

        StringBuilder stringBuildervarible = new StringBuilder();

        // append a string into StringBuilder stringBuildervarible

        //append is inbuilt method to append the data

        stringBuildervarible.append(input);

        // reverse is inbuilt method in StringBuilder to use reverse the string 

        stringBuildervarible.reverse();

        // print reversed String

        System.out.println( "Reversed String  : " +stringBuildervarible);

}
