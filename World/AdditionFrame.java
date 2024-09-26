package World;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionFrame extends JFrame {

    private JPanel panel;

    private JLabel l1;

    private JLabel l2;

    private JLabel l3;

    private JTextField t1;

    private JTextField t2;

    private JButton b1;


    public void initComponents(){//to set the position
        panel.setLayout(null);//element position
        l1.setBounds(50,50,100,20);
        t1.setBounds(170,50,100,20);
        l2.setBounds(50,150,100,20);
        t2.setBounds(170,150,100,20);
        b1.setBounds(100,200,100,40);
        l3.setBounds(50,250,200,20);

        panel.add(l1);//here panel is the container
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);
        panel.add(l3);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());//it returns the string value this is the user inputted value which is int
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                l3.setText(" Sum of "+a+ " and "+b+ " is " +c);

            }
        });//button have a function addactionlistener who work the event handling

           }

    public AdditionFrame(){
        initComponents();
        setContentPane(panel);//In jframe has to the panel
        setSize(400,400);
        setVisible(true);//setvisible is the function of jframe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the program after clicking the cross button

    }

}
