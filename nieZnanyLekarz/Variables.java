package nieZnanyLekarz;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Variables {
    JFrame frame_loginScreen = new JFrame("Login to nieZnany Lekarz");
    JFrame frame_selectDoctorSpeciality = new JFrame("Doctor speciality - nieZnany Lekarz");
    JTextField textField_username = new JTextField("admin");
    JPasswordField textField_password = new JPasswordField("123");
    JButton button_submit = new JButton("Log in");
    JButton button_backUp = new JButton("Back");

    private String[] array_userAndPassword = {"admin", "123", "tgrabarczyk@nzl.pl", "tgpass", "mjazdzewska@nzl.pl", "mjpass", "kturski@nzl.pl", "ktpass"};
    List<String> list_userAndPassword = new ArrayList<>(Arrays.asList(array_userAndPassword));

    String[] array_nieZnanyLekarzDoctors = {"Internist", "Oncologist", "Cardiologist"};
    List<String> list_nieZnanyLekarzDoctors = new ArrayList<>(Arrays.asList(array_nieZnanyLekarzDoctors));

    JButton[] button_doctorSpecialization = new JButton[list_nieZnanyLekarzDoctors.size()];
    JFrame[] frame_nieZnanyLekarzSpecialist = new JFrame[list_nieZnanyLekarzDoctors.size()];

    String[] array_internistIcons = {"nieZnanyLekarz/doctorPictures/internista1st.jpg", "nieZnanyLekarz/doctorPictures/internista2nd.jpg", "nieZnanyLekarz/doctorPictures/pediatra1st.jpg", "nieZnanyLekarz/doctorPictures/pediatra2nd.jpg", "nieZnanyLekarz/doctorPictures/onkolog1st.jpg"};
    private String[] array_internistaNames = {"Jan Smith", "Pawel Smith", "Marcin Smith", "Grzegorz Smith", "Krystian Smith"};
    List<String> list_internistaNames = new ArrayList<>(Arrays.asList(array_internistaNames));
    JLabel[] label_internistaNames = new JLabel[list_internistaNames.size()];
    JButton[] button_internistaNames = new JButton[list_internistaNames.size()];

    String[] array_oncologistIcons = {"nieZnanyLekarz/doctorPictures/onkolog1st.jpg", "nieZnanyLekarz/doctorPictures/onkolog2nd.jpg"};
    private String[] array_onkologNames = {"Aleksander Smith", "Adam Smith"};
    List<String> list_onkologNames = new ArrayList<>(Arrays.asList(array_onkologNames));
    JLabel[] label_onkologNames = new JLabel[list_onkologNames.size()];
    JButton[] button_onkologNames = new JButton[list_onkologNames.size()];










}
