import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setSize(1000,1000);

        frame.setVisible(true);
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Passenger Management System", new PassengerManagementV());
        tabbedPane.addTab("Flight Management System", new FlightManagementV());



        frame.add(tabbedPane);








    }
}