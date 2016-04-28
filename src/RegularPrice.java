/**
 * Created by D062427 on 28.04.2016.
 */
public class RegularPrice extends Price{
    int getPriceCode(){
        return Movie.REGULAR;
    }

    double getCharge(int daysRented){
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }


}
