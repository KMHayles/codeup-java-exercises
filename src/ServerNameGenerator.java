public class ServerNameGenerator {

    private static String[] nouns = {
            "Assumption",
            "Chasuble",
            "Corps",
            "Cutting",
            "Doughnut",
            "Forehead",
            "Future",
            "Gel",
            "Mobile",
            "Playground",
    };

    private static String[] adjectives = {
            "actual",
            "savory",
            "gabby",
            "freezing",
            "illegal",
            "clean",
            "childlike",
            "two",
            "cut",
            "therapeutic",
    };

    public static String returnRandomElement(String[] strs){
    int randomIndex = (int) (Math.random() * strs.length);
    return strs[randomIndex];
    }

    public static String generateRandomServerName(){
        String randomNoun = returnRandomElement(nouns);
        String randomAdjective = returnRandomElement(adjectives);
        return String.format("%s-%s", randomAdjective, randomNoun);

    }




    public static void main(String[] args) {
//        String randomNoun = returnRandomElement(nouns);
//        String randomAdjective = returnRandomElement(adjectives);
//        System.out.printf("%s-%s", randomAdjective, randomNoun);
        System.out.println(generateRandomServerName());
    }



}

