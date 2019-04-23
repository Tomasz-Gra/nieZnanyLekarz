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

    private String[] userAndPasswordArray = {"admin", "123", "tgrabarczyk@nzl.pl", "tgpass", "mjazdzewska@nzl.pl", "mjpass", "kturski@nzl.pl", "ktpass"};
    private String[] nieZnanyLekarzDoctorsArray = {"Internista", "Onkolog", "Pediatra", "Ginekolog", "Kardiolog", "Ortopeda", "Urolog"};
    private String[] nieZnanyLekarzDoctorsLabelsArray = {"Jan Kowalski", "Anna Kawowa", "Tomasz Sufitowski", "Marcin Palek", "Anna Kalendar"};

    List<String> userAndPassword = new ArrayList<>(Arrays.asList(userAndPasswordArray));
    List<String> nieZnanyLekarzDoctorsList = new ArrayList<>(Arrays.asList(nieZnanyLekarzDoctorsArray));
    List<String> nieZnanyLekarzDoctorsLabelList = new ArrayList<>(Arrays.asList(nieZnanyLekarzDoctorsLabelsArray));

    JButton[] numberOfDoc = new JButton[nieZnanyLekarzDoctorsList.size()];
    JFrame[] nieZnanyLekarzSpecjalista = new JFrame[nieZnanyLekarzDoctorsList.size()];

    JLabel[] nieZnanyLekarzDoctorLabels = new JLabel[nieZnanyLekarzDoctorsLabelList.size()];
}
