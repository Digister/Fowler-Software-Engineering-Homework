/**
 * Created by D062427 on 28.04.2016.
 */
class NewReleasePrice extends Price{
    int getPriceCode(){
        return Movie.NEW_RELEASE;
    }
    double getCharge(int daysRented){
        return daysRented * 3;
    }
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2: 1;
    }

}
