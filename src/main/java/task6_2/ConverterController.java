package task6_2;

public class ConverterController {
    ConverterModel model;
    ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view = view;
    }

    public void convert(){
        try {
            double value = Double.parseDouble(view.getValue());
            String convert = view.radioLeft();
            String converted = view.radioRight();
            view.setCOnverted(String.format("%.2f", model.convert(value, convert, converted)));
            view.setErrorLabel("");

        }catch (Exception e){
            view.setErrorLabel("ERROR");
            System.out.println("ERROR " + e.getMessage());
        }
    }
}