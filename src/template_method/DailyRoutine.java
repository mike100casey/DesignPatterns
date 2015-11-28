package template_method;

/**
 * Created by Michael on 11/28/2015.
 */
public abstract class DailyRoutine {

    protected abstract String worker();
    protected abstract void getUp();
    protected abstract void eatBreakfast();
    protected abstract void returnHome();
    protected abstract void goToBed();

    public void routine(){
        String worker = worker();
        System.out.println("The daily routine for a " + worker + " is.");
        getUp();
        eatBreakfast();
        returnHome();
        goToBed();
    }
}
