package nieZnanyLekarz;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LoginScreen {
    private String[] array_userAndPassword          = {
                                                        "admin", "123",
                                                        "tgrabarczyk@nzl.pl", "tgpass",
                                                        "mjazdzewska@nzl.pl", "mjpass",
                                                        "kturski@nzl.pl", "ktpass"
                                                        };
    List<String> list_userAndPassword               = new ArrayList<>(Arrays.asList(array_userAndPassword));
} // Login Screen
class AllDoctors extends LoginScreen {
    String[] array_nieZnanyLekarzDoctors            = {
                                                        "Internist",
                                                        "Oncologist",
                                                        "Cardiologist"
                                                        };
    List<String> list_nieZnanyLekarzDoctors         = new ArrayList<>(Arrays.asList(array_nieZnanyLekarzDoctors));

    JButton[] button_doctorSpecialization           = new JButton[list_nieZnanyLekarzDoctors.size()];
    JFrame[] frame_nieZnanyLekarzSpecialist         = new JFrame[list_nieZnanyLekarzDoctors.size()];
} // All doctors specializations
class Internists extends AllDoctors{
    private String[] array_internistsNames          = {
                                                        "Internist 1 - Jan Smith",
                                                        "Internist 2 - Pawel Smith",
                                                        "Internist 3 - Marcin Smith",
                                                        "Internist 4 - Grzegorz Smith",
                                                        };
    List<String> list_internistsNames               = new ArrayList<>(Arrays.asList(array_internistsNames));

    private String[] array_internistsIcons          = {
                                                        "nieZnanyLekarz/doctorPictures/ginekolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/ginekolog2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista2nd.jpg"
                                                        };
    List<String> list_internistsIcons               = new ArrayList<>(Arrays.asList(array_internistsIcons));

    JButton[] button_internistsNames                = new JButton[list_internistsNames.size()];



} // Internists Information
class DatesInternist extends Internists {
    private String[] array_datesFirstInternist      = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstInternist           = new ArrayList<>(Arrays.asList(array_datesFirstInternist));
    JFrame frame_dates_firstInternist               = new JFrame("Calendar First Internist");
    JButton[] button_dates_firstInternist           = new JButton[list_datesFirstInternist.size()];


    private String[] array_datesSecondInternist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondInternist          = new ArrayList<>(Arrays.asList(array_datesSecondInternist));
    JFrame frame_dates_secondInternist              = new JFrame("Calendar Second Internist");
    JButton[] button_dates_secondInternist          = new JButton[list_datesSecondInternist.size()];


    private String[] array_datesThirdInternist      = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdInternist           = new ArrayList<>(Arrays.asList(array_datesThirdInternist));
    JFrame frame_dates_thirdInternist               = new JFrame("Calendar Third Internist");
    JButton[] button_dates_thirdInternist           = new JButton[list_datesThirdInternist.size()];

    private String[] array_datesFourthInternist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthInternist          = new ArrayList<>(Arrays.asList(array_datesFourthInternist));
    JFrame frame_dates_fourthInternist              = new JFrame("Calendar Fourth Internist");
    JButton[] button_dates_fourthInternist          = new JButton[list_datesFourthInternist.size()];


}
class Oncologists extends DatesInternist{
    private String[] array_oncologistsNames         = {
                                                        "Oncologist 1 - Marcin Smith",
                                                        "Oncologist 2 - Grzegorz Smith",
                                                        "Oncologist 3 - Krystian Smith",
                                                        "Oncologist 4 - Adrian Smith",
                                                        };
    List<String> list_oncologistsNames              = new ArrayList<>(Arrays.asList(array_oncologistsNames));

    private String[] array_oncologistsIcons         = {
                                                        "nieZnanyLekarz/doctorPictures/internista1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/internista2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog2nd.jpg"
                                                        };
    List<String> list_oncologistsIcons              = new ArrayList<>(Arrays.asList(array_oncologistsIcons));

    JButton[] button_oncologistsNames               = new JButton[list_oncologistsNames.size()];
} // Oncologists Information
class DatesOncologists extends Oncologists {
    private String[] array_datesFirstOncologist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstOncologist          = new ArrayList<>(Arrays.asList(array_datesFirstOncologist));
    JFrame frame_dates_firstOncologist              = new JFrame("Calendar First Oncologist");
    JButton[] button_dates_firstOncologist          = new JButton[list_datesFirstOncologist.size()];


    private String[] array_datesSecondOncologist    = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondOncologist         = new ArrayList<>(Arrays.asList(array_datesSecondOncologist));
    JFrame frame_dates_secondOncologist             = new JFrame("Calendar Second Oncologist");
    JButton[] button_dates_secondOncologist         = new JButton[list_datesSecondOncologist.size()];


    private String[] array_datesThirdOncologist     = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdOncologist          = new ArrayList<>(Arrays.asList(array_datesThirdOncologist));
    JFrame frame_dates_thirdOncologist              = new JFrame("Calendar Third Oncologist");
    JButton[] button_dates_thirdOncologist          = new JButton[list_datesThirdOncologist.size()];

    private String[] array_datesFourthOncologist    = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthOncologist         = new ArrayList<>(Arrays.asList(array_datesFourthOncologist));
    JFrame frame_dates_fourthOncologist             = new JFrame("Calendar Fourth Oncologist");
    JButton[] button_dates_fourthOncologist         = new JButton[list_datesFourthOncologist.size()];
}
class Cardiologists extends DatesOncologists {
    private String[] array_cardiologistsNames       = {
                                                        "Cardiologist 1 - Krystian Smith",
                                                        "Cardiologist 2 - Adrian Smith",
                                                        "Cardiologist 3 - Katarzyna Smith",
                                                        "Cardiologist 4 - Sonia Smith"
                                                        };
    List<String> list_cardiologistsNames            = new ArrayList<>(Arrays.asList(array_cardiologistsNames));

    private String[] array_cardiologistsIcons       = {
                                                        "nieZnanyLekarz/doctorPictures/onkolog1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/onkolog2nd.jpg",
                                                        "nieZnanyLekarz/doctorPictures/pediatra1st.jpg",
                                                        "nieZnanyLekarz/doctorPictures/pediatra2nd.jpg"
                                                        };
    List<String> list_cardiologistsIcons            = new ArrayList<>(Arrays.asList(array_cardiologistsIcons));

    JButton[] button_cardiologistsNames             = new JButton[list_cardiologistsNames.size()];
} // Cardiologists Information
class DatesCardiologists extends Cardiologists {
    private String[] array_datesFirstCardiologist   = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        "07.05.2019",
                                                        "08.05.2019",
                                                        "09.05.2019",
                                                        "10.05.2019"
                                                        };
    List<String> list_datesFirstCardiologist        = new ArrayList<>(Arrays.asList(array_datesFirstCardiologist));
    JFrame frame_dates_firstCardiologist            = new JFrame("Calendar First Cardiologist");
    JButton[] button_dates_firstCardiologist        = new JButton[list_datesFirstCardiologist.size()];


    private String[] array_datesSecondCardiologist  = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "06.05.2019",
                                                        };
    List<String> list_datesSecondCardiologist       = new ArrayList<>(Arrays.asList(array_datesSecondCardiologist));
    JFrame frame_dates_secondCardiologist           = new JFrame("Calendar Second Cardiologist");
    JButton[] button_dates_secondCardiologist       = new JButton[list_datesSecondCardiologist.size()];


    private String[] array_datesThirdCardiologist   = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019"
                                                        };
    List<String> list_datesThirdCardiologist        = new ArrayList<>(Arrays.asList(array_datesThirdCardiologist));
    JFrame frame_dates_thirdCardiologist            = new JFrame("Calendar Third Cardiologist");
    JButton[] button_dates_thirdCardiologist        = new JButton[list_datesThirdCardiologist.size()];

    private String[] array_datesFourthCardiologist  = {
                                                        "Back up",
                                                        "01.05.2019",
                                                        "02.05.2019",
                                                        "03.05.2019",
                                                        "16.05.2019",
                                                        "17.05.2019",
                                                        "18.05.2019",
                                                        "19.05.2019",
                                                        "21.05.2019",
                                                        "22.05.2019",
                                                        "23.05.2019",
                                                        "26.05.2019",
                                                        "27.05.2019"
                                                        };
    List<String> list_datesFourthCardiologist       = new ArrayList<>(Arrays.asList(array_datesFourthCardiologist));
    JFrame frame_dates_fourthCardiologist           = new JFrame("Calendar Fourth Cardiologist");
    JButton[] button_dates_fourthCardiologist       = new JButton[list_datesFourthCardiologist.size()];

}
class Variables extends DatesCardiologists {
    JFrame frame_loginScreen                        = new JFrame("Login to nieZnany Lekarz");
    JFrame frame_selectDoctorSpeciality             = new JFrame("Doctor speciality - nieZnany Lekarz");

    JTextField textField_username                   = new JTextField("admin");
    JPasswordField textField_password               = new JPasswordField("123");
    JButton button_submit                           = new JButton("Log in");
    JButton button_backUp                           = new JButton("Back");

    JButton button_backUp2                           = new JButton("Back");


    boolean setLayoutDocSpecialityAlreadyExecuted   = false;
    boolean setLayoutDoctorsAlreadyExecuted         = false;


} // Other Variables
