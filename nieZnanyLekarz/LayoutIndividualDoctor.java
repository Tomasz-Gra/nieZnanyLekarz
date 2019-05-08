package nieZnanyLekarz;

import javax.swing.*;
import java.util.List;

class LayoutIndividualDoctor extends LayoutLoginScreen {

    private void addDates (JButton[] dateButton, List<String> dateList, JFrame dateFrame) {
        // Create buttons with dates
        for (int i = 0; i < dateList.size(); i++) {
            dateButton[i] = new JButton();
            dateButton[i].setFocusPainted(false);
            dateButton[i].setVisible(true);
            dateButton[i].setText(dateList.get(i));
            dateFrame.add(dateButton[i]);
        }
    }

    private void addCalendarsForDoctors(List<String> doctorList, JFrame doctorFrame, JButton[] arrayDoctorButton, int doctorNumber, int arrayDoctorSpecialization, JButton[] datesForDoctor) {
        // Create buttons with dates
        addDates(datesForDoctor, doctorList, doctorFrame);

        // Create calendar window
        arrayDoctorButton[doctorNumber].addActionListener(e -> {
                    frame_nieZnanyLekarzSpecialist[arrayDoctorSpecialization].dispose();
                    setDateLayout(doctorFrame, 300, 50 * doctorList.size(), doctorList.size());
                }
        );

        // Set first button to back up after clicking
        datesForDoctor[0].addActionListener( e -> {
            doctorFrame.dispose();
            frame_nieZnanyLekarzSpecialist[arrayDoctorSpecialization].setVisible(true);
        });

        // Set all buttons to return value of button
        for (int i = 1; i < doctorList.size(); i++) {
            int finalI = i;
            datesForDoctor[i].addActionListener(e -> {
                System.out.println("Date from: " + doctorFrame.getTitle() + ": " + datesForDoctor[finalI].getText());
            });
        }
    }

    private void addButtonsForIndividualDoctor(List<String> individualDoctorName, List<String> individualDoctorIcon, int doctorSpeciality, JButton[] doctorButton) {

        for (int buttonIterator = 0; buttonIterator < individualDoctorName.size(); buttonIterator ++) {
            // Create buttons for individual doctors
            doctorButton[buttonIterator] = new JButton();
            doctorButton[buttonIterator].setVisible(true);
            doctorButton[buttonIterator].setToolTipText(individualDoctorName.get(buttonIterator));

            // Add icons to buttons
            Icon icon_internist = new ImageIcon(individualDoctorIcon.get(buttonIterator));
            doctorButton[buttonIterator].setIcon(icon_internist);

            // Add individual doctor buttons to frame
            frame_nieZnanyLekarzSpecialist[doctorSpeciality].add(doctorButton[buttonIterator]);
        }
    }


    void setLayoutDoctors() {
        addButtonsForIndividualDoctor(list_internistsNames, list_internistsIcons, 0, button_internistsNames);
        addButtonsForIndividualDoctor(list_oncologistsNames, list_oncologistsIcons, 1, button_oncologistsNames);
        addButtonsForIndividualDoctor(list_cardiologistsNames, list_cardiologistsIcons, 2, button_cardiologistsNames);


        addCalendarsForDoctors(list_datesFirstInternist, frame_datesFirstInternist, button_internistsNames, 0,0, button_datesFirstInternist);
        addCalendarsForDoctors(list_datesSecondInternist, frame_datesSecondInternist, button_internistsNames, 1,0, button_datesSecondInternist);
        addCalendarsForDoctors(list_datesThirdInternist, frame_datesThirdInternist, button_internistsNames, 2,0, button_datesThirdInternist);
        addCalendarsForDoctors(list_datesFourthInternist, frame_datesFourthInternist, button_internistsNames, 3,0, button_datesFourthInternist);

        addCalendarsForDoctors(list_datesFirstOncologist, frame_datesFirstOncologist, button_oncologistsNames, 0,1, button_datesFirstOncologist);
        addCalendarsForDoctors(list_datesSecondOncologist, frame_datesSecondOncologist, button_oncologistsNames, 1,1, button_datesSecondOncologist);
        addCalendarsForDoctors(list_datesThirdOncologist, frame_datesThirdOncologist, button_oncologistsNames, 2,1, button_datesThirdOncologist);
        addCalendarsForDoctors(list_datesFourthOncologist, frame_datesFourthOncologist, button_oncologistsNames, 3,1, button_datesFourthOncologist);

        addCalendarsForDoctors(list_datesFirstCardiologist, frame_datesFirstCardiologist, button_cardiologistsNames, 0,2, button_datesFirstCardiologist);
        addCalendarsForDoctors(list_datesSecondCardiologist, frame_datesSecondCardiologist, button_cardiologistsNames, 1,2, button_datesSecondCardiologist);
        addCalendarsForDoctors(list_datesThirdCardiologist, frame_datesThirdCardiologist, button_cardiologistsNames, 2,2, button_datesThirdCardiologist);
        addCalendarsForDoctors(list_datesFourthCardiologist, frame_datesFourthCardiologist, button_cardiologistsNames, 3,2, button_datesFourthCardiologist);

    }
}
