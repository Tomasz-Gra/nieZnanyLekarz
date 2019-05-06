package nieZnanyLekarz;

import javax.swing.*;
import java.awt.*;
import java.util.List;

class LayoutIndividualDoctor extends LayoutLoginScreen {

    private void addDates (JButton[] dateButton, List<String> dateList, JFrame dateFrame) {
        for (int i = 0; i < dateList.size(); i++) {
            dateButton[i] = new JButton();
            dateButton[i].setFocusPainted(false);
            dateButton[i].setVisible(true);
            dateButton[i].setText(dateList.get(i));
            dateFrame.add(dateButton[i]);
        }
    }

    private void addCalendarsForDoctors(List<String> doctorList, JFrame doctorFrame, JButton[] arrayDoctorButton, int doctorNumber, int arrayDoctorSpecialization, JButton[] datesForDoctor) {
        addDates(datesForDoctor, doctorList, doctorFrame);
        arrayDoctorButton[doctorNumber].addActionListener(e -> {
                    frame_nieZnanyLekarzSpecialist[arrayDoctorSpecialization].dispose();
                    setDateLayout(doctorFrame, 300, 50 * doctorList.size(), doctorList.size());
                }

        );
    }

    private void addButtonsForIndividualDoctor(List<String> individualDoctorName, List<String> individualDoctorIcon, int doctorSpeciality, JButton[] doctorButton) {

        for (int buttonIterator = 0; buttonIterator < individualDoctorName.size(); buttonIterator ++) {
            doctorButton[buttonIterator] = new JButton();
            doctorButton[buttonIterator].setVisible(true);
            doctorButton[buttonIterator].setToolTipText(individualDoctorName.get(buttonIterator));

            Icon icon_internist = new ImageIcon(individualDoctorIcon.get(buttonIterator));
            doctorButton[buttonIterator].setIcon(icon_internist);

            frame_nieZnanyLekarzSpecialist[doctorSpeciality].add(doctorButton[buttonIterator]);
        }
    }


    private void setLayoutDoctors() {
        addButtonsForIndividualDoctor(list_internistsNames, list_internistsIcons, 0, button_internistsNames);
        addButtonsForIndividualDoctor(list_oncologistsNames, list_oncologistsIcons, 1, button_oncologistsNames);
        addButtonsForIndividualDoctor(list_cardiologistsNames, list_cardiologistsIcons, 2, button_cardiologistsNames);


        addCalendarsForDoctors(list_datesFirstInternist, frame_dates_firstInternist, button_internistsNames, 0,0, button_dates_firstInternist);
        addCalendarsForDoctors(list_datesSecondInternist, frame_dates_secondInternist, button_internistsNames, 1,0, button_dates_secondInternist);
        addCalendarsForDoctors(list_datesThirdInternist, frame_dates_thirdInternist, button_internistsNames, 2,0, button_dates_thirdInternist);
        addCalendarsForDoctors(list_datesFourthInternist, frame_dates_fourthInternist, button_internistsNames, 3,0, button_dates_fourthInternist);

        addCalendarsForDoctors(list_datesFirstOncologist, frame_dates_firstOncologist, button_oncologistsNames, 0,1, button_dates_firstOncologist);
        addCalendarsForDoctors(list_datesSecondOncologist, frame_dates_secondOncologist, button_oncologistsNames, 1,1, button_dates_secondOncologist);
        addCalendarsForDoctors(list_datesThirdOncologist, frame_dates_thirdOncologist, button_oncologistsNames, 2,1, button_dates_thirdOncologist);
        addCalendarsForDoctors(list_datesFourthOncologist, frame_dates_fourthOncologist, button_oncologistsNames, 3,1, button_dates_fourthOncologist);


        addCalendarsForDoctors(list_datesFirstCardiologist, frame_dates_firstCardiologist, button_cardiologistsNames, 0,2, button_dates_firstCardiologist);
        addCalendarsForDoctors(list_datesSecondCardiologist, frame_dates_secondCardiologist, button_cardiologistsNames, 1,2, button_dates_secondCardiologist);
        addCalendarsForDoctors(list_datesThirdCardiologist, frame_dates_thirdCardiologist, button_cardiologistsNames, 2,2, button_dates_thirdCardiologist);
        addCalendarsForDoctors(list_datesFourthCardiologist, frame_dates_fourthCardiologist, button_cardiologistsNames, 3,2, button_dates_fourthCardiologist);

    }

    void setLayoutNieZnanyLekarzFrame(JFrame nieZnanyLekarzFrame, List<String> doctorNamesList) {
        if(!setLayoutDoctorsAlreadyExecuted) { // prevent doing it in loop (adding buttons every time Back Up is clicked)
            setLayoutDoctors();
            setLayoutDoctorsAlreadyExecuted = true;
        }

        nieZnanyLekarzFrame.setLayout(new GridLayout(1,1));
        nieZnanyLekarzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nieZnanyLekarzFrame.setSize(105 * doctorNamesList.size() + 105, 140);
        nieZnanyLekarzFrame.setLocationRelativeTo(null);
        nieZnanyLekarzFrame.add(button_backUp);
        nieZnanyLekarzFrame.setVisible(true);
    }
}
