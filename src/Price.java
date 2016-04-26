/**
 * Created by mincekara on 26.04.2016.
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    abstract int getFrequentRenterPoints(int daysRented);
}
