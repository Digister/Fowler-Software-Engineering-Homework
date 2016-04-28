/**
 * Created by D062427 on 28.04.2016.
 */
abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented){
        return 1;
    }

}
