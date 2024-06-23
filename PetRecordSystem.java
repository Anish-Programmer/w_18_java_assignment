package w_18_java_assignment;
//importing packages and class
import javax.swing.JFrame;
public class PetRecordSystem{

    //instance variables
    private JFrame frame;

    //constructor
    public PetRecordSystem(){


        //creating obect of JFrame
        frame = new JFrame("Pet Record System");
        frame.setLocationRelativeTo(frame);
        frame.setLayout(null);
        frame.setBounds(300,150,750,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        frame.setVisible(true);
    }


    //main method
    public static void main(String[] args){

        //object of class
        new PetRecordSystem();
    }

}