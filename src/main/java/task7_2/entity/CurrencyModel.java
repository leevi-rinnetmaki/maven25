package task7_2.entity;

public class CurrencyModel {

    String abbreviation;
    String name;
    double conversion_rate;

    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getConversion_rate() {
        return conversion_rate;
    }

    public CurrencyModel(String abbreviation, String name, double conversion_rate) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversion_rate = conversion_rate;
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