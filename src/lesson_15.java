public class lesson_15 {

    public static void main(String[] args) {


        String inputString = "As kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";


        // All the characters that do not belong to-
        // a-z, A-Z, 0-9, *space*

        //INITIALIZE

        // POSITIVE scenario

        int counter = 0;

        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);
            char[] characterArray = {characterToCheck};

            String stringToCheck = new String(characterArray);


            if (stringToCheck.matches("[^a-zA-Z0-9\\s]")){
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
                counter++;
            }

        }
        //PRINT the result when we have gone throught all the iterations in the loop
        System.out.println(String.format("There were %d occurences", counter));



        //NEGATIVE scenario

        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);
            char[] characterArray = {characterToCheck};

            String stringToCheck = new String(characterArray);


            if (stringToCheck.matches("[\\.\\,\\:\\?]")){
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
                counter++;
            }

        }
        //PRINT the result when we have gone throught all the iterations in the loop
        System.out.println(String.format("There were %d occurences", counter));









    }
}
