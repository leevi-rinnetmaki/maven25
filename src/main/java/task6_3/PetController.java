package task6_3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PetController {
    PetView view;

    public PetController(PetView petView) {
        this.view = petView;
    }

    public void test(){
        System.out.println("test");
    }

}
