package demoguiswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Maringa on 14.05.2017.
 */
public class MyApp extends JFrame {
    //menu controls
    private JMenuBar menuBar;
    private JMenu menu;

    private JMenuItem question, inputName;

    //MAIN panel controls
    private JPanel mainPnl;
    private JPanel firstPnl;
    private JPanel secondPnl;
    private JPanel thirdPnl;

    // text fields
    private JTextField firstTxtFld;
    private JTextField secondTxtFld;
    private JTextField thirdTxtFld;

    // buttons
    private JButton firstBut;
    private JButton thirdBut;

    //Labels
    private JLabel secondLbl;


    public MyApp(String title) throws HeadlessException {
        super(title);
        this.setLocation(100, 100);
        this.setSize(600, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void createMenu() {
        this.menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        this.menu = new JMenu("Message");

        this.question = new JMenuItem("Question");
        this.inputName = new JMenuItem("Input Name");

        menu.add(question);
        menu.add(inputName);

        menuBar.add(menu);

        this.setJMenuBar(menuBar);
        this.pack();
    }

    void createVisual() {
        this.mainPnl = new JPanel();
        mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.Y_AXIS));

        this.firstPnl = new JPanel();
        // firstPnl.setBackground(Color.MAGENTA);
        this.firstTxtFld = new JTextField(15);
        this.firstBut = new JButton("Get_User_Name");
        firstPnl.add(firstTxtFld);
        firstPnl.add(firstBut);
        firstPnl.setLayout(new FlowLayout(0, 10, 10));

        this.secondPnl = new JPanel();
        //secondPnl.setBackground(Color.ORANGE);
        this.secondLbl = new JLabel("Result:");
        this.secondTxtFld = new JTextField(20);
        secondPnl.add(secondLbl);
        secondPnl.add(secondTxtFld);
        secondPnl.setLayout(new FlowLayout(0, 10, 10));


        this.thirdPnl = new JPanel();
        //thirdPnl.setBackground(Color.CYAN);
        this.thirdTxtFld = new JTextField(15);
        this.thirdBut = new JButton("Get_Comp_Name");
        thirdPnl.add(thirdTxtFld);
        thirdPnl.add(thirdBut);
        thirdPnl.setLayout(new FlowLayout(0, 10, 10));

        mainPnl.add(firstPnl);
        mainPnl.add(secondPnl);
        mainPnl.add(thirdPnl);

        this.add(mainPnl);
        this.pack();
    }

    void buttonActions() {
        firstBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstTxtFld.setText(System.getProperty("user.name"));
            }
        });

        thirdBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    thirdTxtFld.setText(InetAddress.getLocalHost().getHostName());
                } catch (UnknownHostException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    void menuActions() {
        question.addActionListener(e -> JOptionPane.showMessageDialog(null,
                "You are ready to undergo the text"));

        inputName.addActionListener(e -> {
            JDialog nameDialog = new JDialog();
            nameDialog.setTitle("Enter the user name");
            nameDialog.setLocation(200,200);

            JTextField dialogTxtFld = new JTextField(10);
            JButton dialogBut = new JButton("OK");

            nameDialog.add(dialogTxtFld);
            nameDialog.add(dialogBut);

            nameDialog.setLayout(new FlowLayout(0,10,10));
            nameDialog.pack();
            nameDialog.setVisible(true);

            dialogBut.addActionListener(e1 -> {
                nameDialog.dispose();
                secondTxtFld.setText(dialogTxtFld.getText());
            });
        });
    }


}
