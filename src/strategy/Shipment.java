package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public interface Shipment {
    double calculate(double miles, double weight, String deliveryType);
}
