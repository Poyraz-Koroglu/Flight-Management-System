import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FlightManagementV extends JPanel {
    public FlightManagementV(){

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,3));
        JPanel subpanel4 = new JPanel();
        JPanel subpanel5 = new JPanel();
        JPanel subpanel6 = new JPanel();
        JPanel subpanel7 = new JPanel();
        panel2.add(subpanel4);
        panel2.add(subpanel5);
        panel2.add(subpanel6);
        panel2.add(subpanel7);

        subpanel4.setLayout(new GridLayout(3,4));
        subpanel4.add(new JLabel("Departure"));
        subpanel4.add(new JLabel("Landing"));
        subpanel4.add(new JLabel("Departure Date"));
        subpanel4.add(new JLabel("Return Date"));
        subpanel4.add(new JTextField());
        subpanel4.add(new JTextField());
        subpanel4.add(new JTextField());
        subpanel4.add(new JTextField());
        subpanel4.add(new JButton("Add Flight"));
        subpanel4.add(new JButton("Remove Flight"));

        ArrayList<String> flights = new ArrayList<>();
        JList allflights = new JList(flights.toArray());
        allflights.setPreferredSize(new Dimension(250,250));
        subpanel5.add(allflights);

        subpanel6.setLayout(new GridLayout(3,4));
        subpanel6.add(new JLabel("Passenger ID"));
        subpanel6.add(new JLabel("Ticket price"));
        subpanel6.add(new JTextField());
        JTextField ticketPrice = new JTextField();
        ticketPrice.setPreferredSize(new Dimension(90,30));
        ticketPrice.setEditable(false);
        subpanel6.add(ticketPrice);
        subpanel6.add(new JButton("Buy ticket"));
        subpanel6.add(new JButton("Cancel ticket"));

        subpanel7.setLayout(new GridLayout(1,1));
        ArrayList<String> tickets = new ArrayList<>();
        JList manageTickets = new JList(tickets.toArray());
        manageTickets.setPreferredSize(new Dimension(60,100));
        subpanel7.add(manageTickets);




        add(panel2,BorderLayout.CENTER);









    }

}
