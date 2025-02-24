package task6_3;

public class PetModel {
    private double[] cordinates;
    private double[] mouse;
    private double[] vektor;
    private PetController controller;
    private PetView view;

    public PetModel(double[] cordinates, double[] mouse, double[] vektor, PetController controller, PetView view) {
        this.cordinates = cordinates;
        this.mouse = mouse;
        this.vektor = vektor;
        this.controller = controller;
        this.view = view;
    }

    public double[] getCordinates() {
        return cordinates;
    }

    public void setCordinates(double[] cordinates) {
        this.cordinates = cordinates;
    }

    public double[] getMouse() {
        return mouse;
    }

    public void setMouse(double[] mouse) {
        this.mouse = mouse;
    }

    public double[] getVektor() {
        return vektor;
    }

    public void setVektor(double[] vektor) {
        this.vektor = vektor;
    }

    public void calculateVektor() {
        setVektor(new double[] {getMouse()[0]-getCordinates()[0], getMouse()[1]-getCordinates()[1]});
    }

    public void walk(double[] cordinates) {
        if(cordinates[0]>this.cordinates[0]){
            this.cordinates[0]+=Math.min(cordinates[0]-this.cordinates[0], 1);
        }else if(cordinates[0]<this.cordinates[0]){
            this.cordinates[0]+=Math.max(cordinates[0]-this.cordinates[0], -1);
        }
        if(cordinates[1]>this.cordinates[1]){
            this.cordinates[1]+=Math.min(cordinates[1]-this.cordinates[1], 1);
        }else if(cordinates[1]<this.cordinates[1]){
            this.cordinates[1]+=Math.max(cordinates[1]-this.cordinates[1], -1);
        }
        view.move();
    }
}
