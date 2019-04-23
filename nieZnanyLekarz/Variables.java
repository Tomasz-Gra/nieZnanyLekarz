package nieZnanyLekarz;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Variables {
    JFrame firstWindow = new JFrame("Login to nieZnany Lekarz");
    JFrame selectDoctorSpeciality = new JFrame("Doctor speciality - nieZnany Lekarz");
    JTextField username = new JTextField("admin");
    JPasswordField password = new JPasswordField("123");
    JButton submit = new JButton("Log in");
    JButton backUp = new JButton("Back");

    private String[] userAndPasswordArray = {"admin", "123", "tgrabarczyk@nzl.pl", "tgpass", "mjazdzewska@nzl.pl", "mjpass", "kturski@nzl.pl", "ktpass"};
    private String[] nieZnanyLekarzDoctorsArray = {"Internista", "Onkolog", "Pediatra", "Ginekolog"};
    List<String> userAndPassword = new ArrayList<>(Arrays.asList(userAndPasswordArray));
    List<String> nieZnanyLekarzDoctorsList = new ArrayList<>(Arrays.asList(nieZnanyLekarzDoctorsArray));


    private String[] labelsArrayInternista = {"Jan Internista", "Anna Internista"};
    List<String> labelListInternista = new ArrayList<>(Arrays.asList(labelsArrayInternista));

    private String[] labelsArrayOnkolog = {"Jan Onkolog", "Anna Onkolog"};
    List<String> labelListOnkolog = new ArrayList<>(Arrays.asList(labelsArrayOnkolog));

    private String[] labelsArrayPediatra = {"Jan Pediatra", "Anna Pediatra"};
    List<String> labelListPediatra = new ArrayList<>(Arrays.asList(labelsArrayPediatra));

    private String[] labelsArrayGinekolog = {"Jan Ginekolog", "Anna Ginekolog"};
    List<String> labelListGinekolog = new ArrayList<>(Arrays.asList(labelsArrayGinekolog));

    JButton[] numberOfDoc = new JButton[nieZnanyLekarzDoctorsList.size()];
    JFrame[] nieZnanyLekarzSpecjalista = new JFrame[nieZnanyLekarzDoctorsList.size()];



    JLabel[] labelsInternista = new JLabel[labelListInternista.size()];
    JLabel[] labelsOnkolog = new JLabel[labelListOnkolog.size()];
    JLabel[] labelsPediatra = new JLabel[labelListPediatra.size()];
    JLabel[] labelsGinekolog = new JLabel[labelListGinekolog.size()];

}
