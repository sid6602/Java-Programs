public class SwitchCase2 {
    public static void main(String[] args)
    {
        String month = "April";
        String season = "";

        switch (month) {
            case "January":
                season = "Winter";
                break;
            case "April":
                season = "Spring";
                break;
            case "August":
                season = "Monsoon";
                break;
            case "November":
                season = "Autumn";
                break;
            default:
                System.out.println("Please enter a valid month...");
                break;
        }
        System.out.println(season);
    }
}