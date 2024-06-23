package w_18_java_assignment;
//importing packages and class
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
public class PetRecordSystem{

    //instance variables
    private JFrame frame; //Jframe instance variable
    private JLabel lblTitle; //JLabel  : title

    //constructor
    public PetRecordSystem(){


        //creating object of JLabel : lblTitle
        lblTitle = new JLabel();
        lblTitle.setText("Pet Record System"); //lblTitle : text
        lblTitle.setBounds(310,50,200,30); //lblTitle : location in JFrame
        lblTitle.setFont(new Font("Arial",Font.BOLD,15)); //lblTitle : setting font size


        //creating obect of JFrame
        frame = new JFrame("Pet Record System");
        frame.setLocationRelativeTo(frame);
        frame.setLayout(null);
        frame.setBounds(300,150,750,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(lblTitle); //adding lblTitle :in frame







        frame.setVisible(true);
    }


    //main method
    public static void main(String[] args){

        //object of class
        new PetRecordSystem();
    }

}