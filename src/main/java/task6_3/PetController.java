package task6_3;

//lmao
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PetController {
    PetView view;
    PetModel model;

    public PetController(PetView view, PetModel model) {
        this.view = view;
        this.model = model;
    }

    public void move(double[] cordinates) {
        //model.setCordinates(new double[]{model.getCordinates()[0] + Math.min(cordinates[0]-model.getCordinates()[0], 1), model.getCordinates()[1] + Math.min(cordinates[1]-model.getCordinates()[1], 1)});
        model.setCordinates(cordinates);
        view.move();
    }
}