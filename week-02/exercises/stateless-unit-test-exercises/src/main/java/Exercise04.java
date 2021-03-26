public class Exercise04 {

    // TESTING AN INSTANCE
    // (testing non-static methods)

    // 1. Read the calculateTotalCost JavaDocs.
    // 2. Review Exercise04Test.
    // 3. Implement calculateTotalCost.
    // 4. Tests are incomplete. Complete them to verify all scenarios.

    /**
     * Calculates the cost to the customer give an item price and the quantity purchased.
     * Negative price or quantity results in 0.0 cost.
     * Volume discounts apply.
     * 1 - 15 items: no discount
     * 16 - 25 items: 5% discount
     * 26 - 50 items: 10% discount
     * 51 - 75 items: 15% discount
     * Greater than 75 items: 22% discount
     *
     * @param price    the price of a single item
     * @param quantity the number of items to purchase
     * @return the total cost with volume discounts applied
     */
    public double calculateTotalCost(double price, int quantity) {
        int discountCase = 0;
        if (quantity >= 1 && quantity <= 15) {
            switchCase = 1;
        }
        if (quantity >= 16 && quantity <= 25) {
            switchCase = 2;
        }
        if (quantity >= 26 && quantity <= 50) {
            switchCase = 3;
        }
        if (quantity >= 51 && quantity <= 74) {
            switchCase = 4;
        }
        if (quantity >= 76) {
            switchCase = 5;
        }
        switch (discountCase) {
            case 1:
                cost = price * quantity;
            case 2:
                cost = (price * quantity) * 0.95;
            case 3:
                cost = (price * quantity) * 0.90;
            case 4:
                cost = (price * quantity) * 0.85;
            case 5:
                cost(price * quantity) * 0.75;

        }
        return cost;
    }

}
