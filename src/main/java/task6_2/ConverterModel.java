package task6_2;

public class ConverterModel {
    enum Currency {
        dollar,
        euro,
        pound,
    }

    private double dollar= 1.0;
    private double euro= 1.04;
    private double pound= 1.26;

    public double convert(double value, String convert, String converted){
        double a=1;
        double b=1;

        switch(convert){
            case "$":
                a=dollar;
                break;
            case "€":
                a=euro;
                break;
            case "£":
                a=pound;
                break;
        }
        switch(converted){
            case "$":
                b=dollar;
                break;
            case "€":
                b=euro;
                break;
            case "£":
                b=pound;
                break;
        }
        return value*b/a;
    }
}