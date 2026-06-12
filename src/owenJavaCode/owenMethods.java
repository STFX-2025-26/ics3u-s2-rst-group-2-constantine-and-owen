package owenJavaCode;

public class owenMethods {

    public static void main(String[] args) {
     
    }
    
    /**
     * Description: Core controller method that handles the business logic. 
     * It accepts the raw item quantities AND the local prices directly from the GUI.
     * Parameters:  double startingCash - The user's total budget
     * int numApples - Quantity of apples
     * int numCarrots - Quantity of carrots
     * int numCorn - Quantity of corn
     * int numLettuce - Quantity of lettuce
     * int numBlueberries - Quantity of blueberries
     * double priceApple - Cost of an apple passed from GUI
     * double priceCarrot - Cost of a carrot passed from GUI
     * double priceCorn - Cost of corn passed from GUI
     * double priceLettuce - Cost of lettuce passed from GUI
     * double priceBlueberry - Cost of blueberries passed from GUI
     * Return Type: String - The multi-line summary report or an error message
     */
    static String calculateChange(double startingCash, int numApples, int numCarrots, 
                                  int numCorn, int numLettuce, int numBlueberries,
                                  double priceApple, double priceCarrot, double priceCorn, 
                                  double priceLettuce, double priceBlueberry) {
        
        // Calculate Total Cost using the prices passed in from the GUI parameters
        double totalCost = (numApples * priceApple) + 
                           (numCarrots * priceCarrot) + 
                           (numCorn * priceCorn) + 
                           (numLettuce * priceLettuce) + 
                           (numBlueberries * priceBlueberry);

        // Check if user has enough money
        if (totalCost > startingCash) {
            return "Error: You do not have enough money!\n" +
                   "Total Cost: $" + totalCost + "\nStarting Cash: $" + startingCash;
        }

        double changeLeft = startingCash - totalCost;
        int totalCents = getAmountOfCents(changeLeft);
        
        return buildChangeOutput(totalCost, changeLeft, totalCents);
    }

    /**
     * Description: Converts a decimal currency value into a standard integer representing total cents.
     * Parameters:  double changeLeft - The remaining money in dollar format (e.g., 12.34)
     * Return Type: int - The equivalent total amount in cents (e.g., 1234)
     */
    static int getAmountOfCents(double changeLeft) {
        return (int) Math.round(changeLeft * 100);
    }

    /**
     * Description: Breaks down a raw amount of cents into specific currency denominations 
     * and glues them into a single string.
     * Parameters:  double totalCost - The total cost of the gathered produce
     * double changeLeft - The total remaining cash left over
     * int cents - The remaining change converted entirely into cents
     * Return Type: String - The final multi-line text block ready for the GUI's JTextArea
     */
    static String buildChangeOutput(double totalCost, double changeLeft, int cents) {
        int fiveDollars = cents / 500;
        cents %= 500;

        int toonies = cents / 200;
        cents %= 200;

        int loonies = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        return "Total Cost: $" + totalCost + "\n" +
               "Remaining Change: $" + changeLeft + "\n" +
               "-----------------------------------\n" +
               "Change breakdown:\n" +
               "$5 Bills: " + fiveDollars + "\n" +
               "Toonies:   " + toonies + "\n" +
               "Loonies:   " + loonies + "\n" +
               "Quarters:  " + quarters + "\n" +
               "Dimes:     " + dimes + "\n" +
               "Nickels:   " + nickels + "\n" +
               "Pennies:   " + pennies;
    }
}