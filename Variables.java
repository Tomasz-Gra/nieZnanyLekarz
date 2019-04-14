import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Variables {
    JFrame firstWindow = new JFrame("Login to nieZnany Lekarz");
    JFrame selectDoctorSpeciality = new JFrame("Doctor speciality - nieZnany Lekarz");
    JFrame messageWindow = new JFrame("Message");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JButton submit = new JButton("Log in");
    JButton backUp = new JButton("Back");

    private String[] userAndPasswordArray = {"admin", "password", "tgrabarczyk@nzl.pl", "tgpass", "mjazdzewska@nzl.pl", "mjpass", "kturski@nzl.pl", "ktpass"};
    private String[] nieZnanyLekarzDoctors = {"Internista", "Onkolog", "Pediatra", "Ginekolog"};

    List<String> userAndPassword = new ArrayList<>(Arrays.asList(userAndPasswordArray));
    List<String> nieZnanyLekarzDoctorsList = new ArrayList<>(Arrays.asList(nieZnanyLekarzDoctors));

    JButton[] numberOfDoc = new JButton[nieZnanyLekarzDoctorsList.size()];
    JFrame nieZnanyLekarzInternista = new JFrame("Internista");
    JFrame nieZnanyLekarzOnkolog = new JFrame("Onkolog");
    JFrame nieZnanyLekarzPediatra = new JFrame("Pediatra");
    JFrame nieZnanyLekarzGinekolog = new JFrame("Ginekolog");

}
