


public class SciFiName   
{

    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        String sciFiFirst = firstName.substring(0,3).toLowerCase() + lastName.substring(0,2).toLowerCase();
        String sciFiLast = city.substring(0,2).toLowerCase() + school.substring(0,3).toLowerCase();
        int ra = (int)(Math.random() * relativeName1.length());
        int ra2 = (int)(Math.random() * relativeName2.length());
        String origin = relativeName1.substring(ra).toLowerCase() + relativeName2.substring(ra2).toLowerCase();
        System.out.println("Hello " + sciFiFirst.substring(0,1).toUpperCase() + sciFiFirst + " " + sciFiLast.substring(0,1).toUpperCase()+
                           sciFiLast + " of " + origin.substring(0,1).toUpperCase() + origin + ". Welcome!");
    }           
}
