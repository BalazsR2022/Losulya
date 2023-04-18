package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension; //ezt magától nem ajánlja fel. Ha valamit nem ajánl fel, jo eséllyel awt-s csomagban van.
//kezdetben volt az awt, aztán a swing- minden operációs rendszer ugyanúgy néz ki, ha ebben programozunk, aztán az swt-n projekt, IBM-től, és a JavaFx- a Swing leváltására találták ki, kivették a jávából.

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;

        public InputPanel() {
            this.initComponent();
            this.setupComponent();
            this.addComponent();
            this.setupPanel();
            

        }
        public InputPanel(String text) {
            this.initComponent();
            this.setupComponent();
            this.label.setText(text);
            this.setupPanel();

        }
        private void setupComponent(){
           
            this.label.setPreferredSize(new Dimension(100,27));
            this.field.setPreferredSize(new Dimension(100,27));
        

        }
       private void setupPanel(){
        this.setBorder(new EmptyBorder(5,10,5,10));

       }

        private void initComponent(){
            this.label = new JLabel();
            this.field = new JTextField();
            this.addComponent();
        }

        public void setLabel(String text){

            this.label.setText(text);
        }

        public void setValue(String text){
            this.field.setText(text);
        }

        public String getValue(){
            return this.field.getText();
        }
        private void addComponent(){
            this.setLayout(new BoxLayout(this,BoxLayout.LINE_AXIS));
            this.add(this.label);
            this.add(this.field);
            
        }
    }
    
    

