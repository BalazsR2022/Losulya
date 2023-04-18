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
            System.out.println("Műkodik");
        });


    }
}
