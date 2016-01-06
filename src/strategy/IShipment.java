package strategy;

/**
 * Created by Michael on 11/18/2015.
 */
public interface IShipment {
    double calculate(double miles, double weight, DeliverType deliveryType);

}
