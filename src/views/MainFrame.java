package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MainFrame extends JFrame{
    InputPanel perimeterPanel;
    InputPanel longPanel;
    JButton calcButton;
    InputPanel weightPanel;

    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();

       
    }
    private void initComponent(){
        this.perimeterPanel = new InputPanel("Kerület");
        this.longPanel = new InputPanel("Hossz");
        this.calcButton = new JButton("Számít");
        this.weightPanel = new InputPanel("Súly");
    }
    private void addComponent (){
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(this.perimeterPanel);
        this.add(this.longPanel);
        this.add(this.calcButton);
        this.add(this.weightPanel);

    }
    private void setFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(400,300);
        this.pack();
        this.setVisible(true);

    }
    public InputPanel getPerimeterPanel() {
        return perimeterPanel;
    }
    public InputPanel getLongPanel() {
        return longPanel;
    }
    public JButton getCalcButton() {
        return calcButton;
    }
    public InputPanel getWeightPanel() {
        return weightPanel;
    }

    
    
}
