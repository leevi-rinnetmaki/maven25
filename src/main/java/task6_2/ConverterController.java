package task6_2;

public class ConverterController {
    ConverterModel model;
    ConverterView view;

    public ConverterController(ConverterModel model, ConverterView view) {
        this.model = model;
        this.view = view;
    }

    public void convert(){
        double value = Double.parseDouble(view.getValue());
        String convert = view.radioLeft();
        String converted = view.radioRight();
        view.setCOnverted(Double.toString(model.convert(value, convert, converted)));
    }
}
