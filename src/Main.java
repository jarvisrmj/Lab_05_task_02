public class Main
{
    public static void main(String[] args)
    {
        int birthMonth = 6;

        System.out.println();

        {


            System.out.println("Enter your birthday month.");

            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println(("Your birthday month is ") + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month");
            }

        }
    }
}