package AccountPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DashboardPackage.Dashboard;

public class Login_SignUp {

    JFrame mainFrame;
    JPanel LogContainer,LogForm,signUpForm,cardPanel;
    CardLayout cardLayout;
    static JLabel  userName,email,password,firstName,middleName,lastName;
    static JTextField enterUser,enterFirst,enterMiddle,enterLast,enterMail,enterPassword;
    JButton LoginButton,SignUpButton,CreateButton,BackButton;

    {
        Log();
    }

    public JFrame Log(){
        mainFrame = new JFrame("Welcome");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(new Dimension(1500,900));
        mainFrame.setLocationRelativeTo(null);
        mainFrame.add(this.Panel1());
        mainFrame.setVisible(true);
        return mainFrame;
    }

    public JPanel Panel1(){
        LogContainer = new JPanel();

        LogContainer.setBackground(new Color(48, 25, 52 ));
        LogContainer.setPreferredSize(new Dimension(650,550));
        LogContainer.setLayout(new GridBagLayout());


        LogContainer.add(this.addToCardLayout());

        return LogContainer;
    }

    public JPanel Panel2(){
        LogForm = new JPanel();
        LogForm.setPreferredSize(new Dimension(400,500));
        LogForm.setBackground(new Color(177,156,217));
        LogForm.setLayout(new BoxLayout(LogForm,BoxLayout.Y_AXIS));
        LogForm.setBorder(BorderFactory.createEmptyBorder(100,80,100,80));

        userName = new JLabel("User Name:");
        userName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        userName.setMaximumSize(new Dimension(Integer.MAX_VALUE, userName.getPreferredSize().height));
        userName.setFont(new Font("Arial",Font.BOLD,20));
        enterUser = new JTextField(20);
        enterUser.setMaximumSize(new Dimension(500,30));
        LogForm.add(userName);
        LogForm.add(Box.createVerticalStrut(5));
        LogForm.add(enterUser);

        LogForm.add(Box.createVerticalStrut(15));

        email = new JLabel("E-mail:");
        email.setAlignmentX(Component.RIGHT_ALIGNMENT);
        email.setMaximumSize(new Dimension(Integer.MAX_VALUE, email.getPreferredSize().height));
        email.setFont(new Font("Arial",Font.BOLD,20));
        enterMail = new JTextField(20);
        enterMail.setMaximumSize(new Dimension(500,30));
        LogForm.add(email);
        LogForm.add(Box.createVerticalStrut(5));
        LogForm.add(enterMail);

        LogForm.add(Box.createVerticalStrut(15));

        password = new JLabel("Password:");
        password.setAlignmentX(Component.RIGHT_ALIGNMENT);
        password.setMaximumSize(new Dimension(Integer.MAX_VALUE, password.getPreferredSize().height));
        password.setFont(new Font("Arial",Font.BOLD,20));
        enterPassword = new JTextField(20);
        enterPassword.setMaximumSize(new Dimension(500,30));
        LogForm.add(password);
        LogForm.add(Box.createVerticalStrut(5));
        LogForm.add(enterPassword);
        LogForm.add(Box.createVerticalStrut(20));

        LoginButton = new JButton("Login");
        LoginButton.setBackground(Color.WHITE);
        LoginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "DashBoard");
                userInfo.saveLogin();
            }
        });
        //LoginButton.add(Box.createVerticalStrut(5));

        SignUpButton = new JButton("SignUp");
        SignUpButton.setBackground(Color.WHITE);
        //SignUpButton.add(Box.createVerticalStrut(5));
        SignUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        SignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "SignUp");

            }
        });

        LogForm.add(LoginButton);
        LogForm.add(Box.createVerticalStrut(5));
        LogForm.add(SignUpButton);

        return LogForm;
    }

    public JPanel SignUpPanel(){

        signUpForm = new JPanel();
        signUpForm.setPreferredSize(new Dimension(400,500));
        signUpForm.setBackground(new Color(177,156,217));
        signUpForm.setLayout(new BoxLayout(signUpForm,BoxLayout.Y_AXIS));
        signUpForm.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));

        firstName = new JLabel("First Name:");
        firstName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        firstName.setMaximumSize(new Dimension(Integer.MAX_VALUE, firstName.getPreferredSize().height));
        firstName.setFont(new Font("Arial",Font.BOLD,20));
        enterFirst = new JTextField(20);
        enterFirst.setMaximumSize(new Dimension(500,30));
        signUpForm.add(firstName);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(enterFirst);

        signUpForm.add(Box.createVerticalStrut(15));

        middleName = new JLabel("Middle Name:");
        middleName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        middleName.setMaximumSize(new Dimension(Integer.MAX_VALUE, middleName.getPreferredSize().height));
        middleName.setFont(new Font("Arial",Font.BOLD,20));
        enterMiddle = new JTextField(20);
        enterMiddle.setMaximumSize(new Dimension(500,30));
        signUpForm.add(middleName);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(enterMiddle);

        signUpForm.add(Box.createVerticalStrut(15));

        lastName = new JLabel("Last Name:");
        lastName.setAlignmentX(Component.RIGHT_ALIGNMENT);
        lastName.setMaximumSize(new Dimension(Integer.MAX_VALUE, middleName.getPreferredSize().height));
        lastName.setFont(new Font("Arial",Font.BOLD,20));
        enterLast = new JTextField(20);
        enterLast.setMaximumSize(new Dimension(500,30));
        signUpForm.add(lastName);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(enterLast);

        signUpForm.add(Box.createVerticalStrut(15));

        email = new JLabel("E-mail:");
        email.setAlignmentX(Component.RIGHT_ALIGNMENT);
        email.setMaximumSize(new Dimension(Integer.MAX_VALUE, email.getPreferredSize().height));
        email.setFont(new Font("Arial",Font.BOLD,20));
        enterMail = new JTextField(20);
        enterMail.setMaximumSize(new Dimension(500,30));
        signUpForm.add(email);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(enterMail);

        signUpForm.add(Box.createVerticalStrut(15));

        password = new JLabel("Password:");
        password.setAlignmentX(Component.RIGHT_ALIGNMENT);
        password.setMaximumSize(new Dimension(Integer.MAX_VALUE, password.getPreferredSize().height));
        password.setFont(new Font("Arial",Font.BOLD,20));
        enterPassword = new JPasswordField(20);
        enterPassword.setMaximumSize(new Dimension(500,30));
        signUpForm.add(password);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(enterPassword);
        signUpForm.add(Box.createVerticalStrut(20));

        CreateButton = new JButton("Create Account");
        CreateButton.setBackground(Color.WHITE);
        CreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "DashBoard");
            }
        });

        BackButton = new JButton("Back");
        BackButton.setBackground(Color.WHITE);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");

            }
        });

        signUpForm.add(BackButton);
        signUpForm.add(Box.createVerticalStrut(5));
        signUpForm.add(CreateButton);

        return signUpForm;
    }


    public JPanel addToCardLayout(){
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        cardPanel.add(Panel2(), "Login");
        cardPanel.add(SignUpPanel(),"SignUp");
        cardPanel.add(Dashboard.Dashboard1(),"DashBoard");

        return cardPanel;
    }

    public static void main(String[] args) {
        new Login_SignUp();
    }
}

