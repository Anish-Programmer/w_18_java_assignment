package w_18_java_assignment;

//importing packages and class
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel; //importing JPanel
import javax.swing.JTextField;
import javax.swing.JButton;

public class PetRecordSystem {

    // instance variables
    private JFrame frame; // Jframe instance variable
    private JLabel lblTitle; // JLabel : title
     // JPanel for cat info
    private JPanel pnlCatInfo;
    private JLabel lblCatInfo;
    private JLabel lblPetId;
    private JTextField txtPetId;
    private JLabel lblCatName;
    private JTextField txtCatName;
    private JLabel lblCatAge;
    private JTextField txtCatAge;
    private JLabel lblCatOwner;
    private JTextField txtCatOwner;
    private JButton btnAddCat;
    //for dog info
    private JPanel pnlDogInfo; 
    private JLabel lblDogInfo;
    private JLabel lblDogPetId;
    private JTextField txtDogPetId;
    private JLabel lblDogName;
    private JTextField txtDogName;
    private JLabel lblDogBreed;
    private JTextField txtDogBreed;
    private JLabel lblDogOwner;
    private JTextField txtDogOwner;
    private JLabel lblDogVaccinationDate;
    private JTextField txtDogVaccinationDate;
    private JButton btnAddDog;
    //for vaccinate dog
    private JPanel pnlVaccinateDog;
    private JLabel lblVaccinateDogPetId;
    private JTextField txtVaccinateDogPetId;
    private JLabel lblVaccinateDate;
    private JTextField txtVaccinateDate;
    private JButton btnVaccinateDog;
    //for two pet method
    private JPanel pnlTwoPetMethods;
    private JLabel lblTwoPetMethodsPetId;
    private JTextField txtTwoMethodsPetId;
    private JButton btnTwoPetMethodsDisplayInfo;
    private JButton btnTwoPetMethodsMakeSound;




    // constructor
    public PetRecordSystem() {

        //cat Info

        // creating the the object of JPanel : pnlCatInfo
        pnlCatInfo = new JPanel();
        pnlCatInfo.setBounds(25, 100, 250, 300);
        // pnlCatInfo.setBackground(Color.green);
        pnlCatInfo.setLayout(null);

        // creating the object fot JLabel : lblCatInfo
        lblCatInfo = new JLabel("Cat Info");
        lblCatInfo.setBounds(50, 15, 100, 25);

        // crating the object for JLabel : lblPetId
        lblPetId = new JLabel("Pet Id:");
        lblPetId.setBounds(5, 55, 50, 25);

        // creating the object fot txtPetId
        txtPetId = new JTextField();
        txtPetId.setBounds(60, 55, 125, 25);

        // creating the object for lbl cat name
        lblCatName = new JLabel("Name:");
        lblCatName.setBounds(5, 100, 150, 25);

        // creating the object of txt field cat name
        txtCatName = new JTextField();
        txtCatName.setBounds(60, 100, 125, 25);

        // creating object for lbl cat age
        lblCatAge = new JLabel("Age:");
        lblCatAge.setBounds(5, 150, 150, 25);

        // creating object of text txt cat age
        txtCatAge = new JTextField();
        txtCatAge.setBounds(60, 150, 125, 25);

        // creating object of JLabel cat owner
        lblCatOwner = new JLabel("Owner:");
        lblCatOwner.setBounds(5, 200, 150, 25);

        // creating object fot txt cat owner
        txtCatOwner = new JTextField();
        txtCatOwner.setBounds(60, 200, 125, 25);

        //creating object for btn Add cat
        btnAddCat = new JButton("Add Cat");
        btnAddCat.setBounds(30,250,120,25);
        btnAddCat.setBackground(Color.lightGray);


        //Dog info

        //creating object of DofInfo panel
        pnlDogInfo = new JPanel();
        pnlDogInfo.setLayout(null);
        pnlDogInfo.setBounds(300,100,250,330);
        // pnlDogInfo.setBackground(Color.pink);

        lblDogInfo = new JLabel("Dog Info:"); //constructor
        lblDogInfo.setBounds(50, 15, 100, 25);

        lblDogPetId = new JLabel("Pet Id:");
        lblDogPetId.setBounds(5, 55, 50, 25);

        txtDogPetId = new JTextField();
        txtDogPetId.setBounds(110, 55, 120, 25);

        lblDogName = new JLabel("Name:");
        lblDogName.setBounds(5, 100, 150, 25);

        txtDogName = new JTextField();
        txtDogName.setBounds(110, 100, 120, 25);

        lblDogBreed = new JLabel("Breed:");
        lblDogBreed.setBounds(5, 150, 150, 25);

        txtDogBreed = new JTextField();
        txtDogBreed.setBounds(110, 150, 120, 25);

        lblDogOwner = new JLabel("Owner:");
        lblDogOwner.setBounds(5, 200, 150, 25);

        txtDogOwner = new JTextField();
        txtDogOwner.setBounds(110, 200, 120, 25);

        lblDogVaccinationDate = new JLabel("Vaccination Date:");
        lblDogVaccinationDate.setBounds(5,250,125,25);

        txtDogVaccinationDate = new JTextField();
        txtDogVaccinationDate.setBounds(110,250,120,25);

        btnAddDog = new JButton("Add Dog");
        btnAddDog.setBounds(55,290,125,25);
        btnAddDog.setBackground(Color.lightGray);


        //for vaccinate dog 
        //creating  constructor
        pnlVaccinateDog = new JPanel();
        pnlVaccinateDog.setLayout(null);
        pnlVaccinateDog.setBounds(570,180,210,180);
        pnlVaccinateDog.setBackground(Color.LIGHT_GRAY);

        //creating object of lblVaccinateDog
        lblVaccinateDogPetId = new JLabel("Pet Id:");
        lblVaccinateDogPetId.setBounds(50,15,150,25);

        //creating constructor
        txtVaccinateDogPetId = new JTextField();
        txtVaccinateDogPetId.setBounds(100,15,105,25);

        //creating constructor
        lblVaccinateDate = new JLabel("Vaccinate Date:");
        lblVaccinateDate.setBounds(0,70,105,25);

        txtVaccinateDate = new JTextField();
        txtVaccinateDate.setBounds(100,70,105,25);

        //creating constructor
        btnVaccinateDog = new JButton("Vaccinate Dog");
        btnVaccinateDog.setBounds(45,125,125,30);
        btnVaccinateDog.setBackground(Color.GRAY);

        //for two pet methods
        //creating constructor
        pnlTwoPetMethods = new JPanel();
        pnlTwoPetMethods.setLayout(null);
        pnlTwoPetMethods.setBounds(50,440,460,130);
        pnlTwoPetMethods.setBackground(Color.lightGray);

        //creating constrctors
        lblTwoPetMethodsPetId = new JLabel("Pet Id:");
        lblTwoPetMethodsPetId.setBounds(130,25,95,25);
        

        //creating constructors
        txtTwoMethodsPetId = new JTextField();
        txtTwoMethodsPetId.setBounds(190,25,120,25);

        //creating constructors
        btnTwoPetMethodsDisplayInfo =new JButton("Display Info");
        btnTwoPetMethodsDisplayInfo.setBounds(5,70,125,30);
        btnTwoPetMethodsDisplayInfo.setBackground(Color.white);

        //creating constructors
        btnTwoPetMethodsMakeSound = new JButton("Make Sound");
        btnTwoPetMethodsMakeSound.setBounds(330,70,125,30);
        btnTwoPetMethodsMakeSound.setBackground(Color.white);






        // creating obect of JFrame
        frame = new JFrame("Pet Record System");
        frame.setLocationRelativeTo(frame);
        frame.setLayout(null);
        frame.setBounds(300, 150, 800, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating object of JLabel : lblTitle
        lblTitle = new JLabel();
        lblTitle.setText("Pet Record System"); // lblTitle : text
        lblTitle.setBounds(310, 50, 200, 30); // lblTitle : location in JFrame
        lblTitle.setFont(new Font("Arial", Font.BOLD, 15)); // lblTitle : setting font size

        frame.add(lblTitle); // adding lblTitle :in frame
        frame.add(pnlCatInfo); // adding pnlCatInfo
        frame.add(pnlDogInfo); //adding pnlDogInfo
        frame.add(pnlVaccinateDog); //adding pnlVaccinateDog
        frame.add(pnlTwoPetMethods); //adding two pet methods

        // adding into pnlCatInfo Jpanel
        pnlCatInfo.add(lblCatInfo);
        pnlCatInfo.add(lblPetId);
        pnlCatInfo.add(txtPetId);
        pnlCatInfo.add(lblCatName);
        pnlCatInfo.add(txtCatName);
        pnlCatInfo.add(lblCatAge);
        pnlCatInfo.add(txtCatAge);
        pnlCatInfo.add(lblCatOwner);
        pnlCatInfo.add(txtCatOwner);
        pnlCatInfo.add(btnAddCat);
        //for pnlDogInfo
        pnlDogInfo.add(lblDogInfo);
        pnlDogInfo.add(lblDogPetId);
        pnlDogInfo.add(txtDogPetId);
        pnlDogInfo.add(lblDogName);
        pnlDogInfo.add(txtDogName);
        pnlDogInfo.add(lblDogBreed);
        pnlDogInfo.add(txtDogBreed);
        pnlDogInfo.add(lblDogOwner);
        pnlDogInfo.add(txtDogOwner);
        pnlDogInfo.add(lblDogVaccinationDate);
        pnlDogInfo.add(txtDogVaccinationDate);
        pnlDogInfo.add(btnAddDog);
        //for vaccinate dog
        pnlVaccinateDog.add(lblVaccinateDogPetId);
        pnlVaccinateDog.add(txtVaccinateDogPetId);
        pnlVaccinateDog.add(lblVaccinateDate);
        pnlVaccinateDog.add(txtVaccinateDate);
        pnlVaccinateDog.add(btnVaccinateDog);
        //for two pet methods
        pnlTwoPetMethods.add(lblTwoPetMethodsPetId);
        pnlTwoPetMethods.add(txtTwoMethodsPetId);
        pnlTwoPetMethods.add(btnTwoPetMethodsDisplayInfo);
        pnlTwoPetMethods.add(btnTwoPetMethodsMakeSound);




        //visibility of JFrame ->true
        frame.setVisible(true);
    }

    // main method
    public static void main(String[] args) {

        // object of class
        new PetRecordSystem();
    }

}