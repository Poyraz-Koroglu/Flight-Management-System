import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class PassengerManagementV extends JPanel {

    public PassengerManagementV() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,1));
        JPanel subpanel1 = new JPanel();
        JPanel subpanel2 = new JPanel();
        JPanel subpanel3 = new JPanel();
        panel1.add(subpanel1);
        panel1.add(subpanel2);
        panel1.add(subpanel3);

        ArrayList<String> passengers = new ArrayList<>();
        JList allpassengers = new JList(passengers.toArray());
        allpassengers.setPreferredSize(new Dimension(400,200));
        subpanel1.add(allpassengers);

        subpanel2.setLayout(new GridLayout(2,5));
        subpanel2.add(new JLabel("Name"));
        subpanel2.add(new JLabel("Surname"));
        subpanel2.add(new JLabel("Passenger Type"));
        subpanel2.add(new JLabel("Luggage Count"));
        subpanel2.add(new JLabel("Year of Birth"));
        subpanel2.add(new JTextField());
        subpanel2.add(new JTextField());
        String[] passengerType = {"Family","Business Class", "Economy Class"};
        subpanel2.add(new JComboBox<>(passengerType));
        subpanel2.add(new JTextField());
        subpanel2.add(new JTextField());

        subpanel3.setLayout(new GridLayout(3,1));
        subpanel3.add(new JButton("add user"));
        subpanel3.add(new JButton("remove user"));
        subpanel3.add(new JButton("update user"));

        add(panel1,BorderLayout.CENTER);
        add(allpassengers,BorderLayout.NORTH);

    }
}