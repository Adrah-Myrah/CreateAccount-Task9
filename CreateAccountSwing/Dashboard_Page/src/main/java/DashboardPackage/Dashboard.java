package DashboardPackage;

import java.sql.Connection;
import javax.swing.*;
import java.awt.*;

public class Dashboard {

    static JPanel mainDashboard;
    static JLabel label;

    static {

        Dashboard1();
    }


    public static JPanel Dashboard1(){
        mainDashboard = new JPanel();
        mainDashboard.setPreferredSize(new Dimension(1000,800));
        label = new JLabel("WELCOME TO DASHBOARD");
        label.setFont(new Font("Arial",Font.BOLD,40));
        mainDashboard.add(label);
        return mainDashboard;
    }

    public static void main(String[] args) {
        new Dashboard();
    }

}
