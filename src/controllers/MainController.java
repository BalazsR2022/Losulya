package controllers;

import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    public MainController() {
        this.mainFrame = new MainFrame();
        handleEvents();
    }
   
    private void handleEvents(){
        this.mainFrame.getCalcButton().addActionListener(e -> {
            
            this.startCalc();
        });


    }
    private void startCalc(){
        System.out.println("Mukodik");
        double perimeter = Double.parseDouble(
            this.mainFrame.getPerimeterPanel().getValue()
        );
       double length = Double.parseDouble(
        this.mainFrame.getLongPanel().getValue()
       );
       Double weight = calcWeight(perimeter, length);
       this.mainFrame.getWeightPanel().setValue(weight.toString());
    }
    private double calcWeight(double perimeter, double length){
        double weight =(perimeter * perimeter * length) /11877;

        return weight;
    }
}
