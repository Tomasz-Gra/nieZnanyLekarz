package nieZnanyLekarz;

import javax.swing.*;
import java.awt.*;
import java.util.List;

class LayoutDoctorSpeciality extends LayoutIndividualDoctor {

    private void setLayoutNieZnanyLekarzFrame(JFrame nieZnanyLekarzFrame, List<String> doctorNamesList) {
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

    // Add button to be able to back up to doctor speciality window
    private void backUpButton() {
        button_backUp.setVisible(true);
        button_backUp.addActionListener(e1 -> {
            for (int i = 0; i < array_nieZnanyLekarzDoctors.length; i++)
                frame_nieZnanyLekarzSpecialist[i].dispose();
            setLayoutDoctorSpeciality();
        });
    }

    // Wybór specjalizacji lekarza - Internista, Onkolog itd
    private void createButtonsDoctorSpecializations(int specializationIterator) {
        button_doctorSpecialization[specializationIterator] = new JButton();
        button_doctorSpecialization[specializationIterator].setVisible(true);
        button_doctorSpecialization[specializationIterator].setText(list_nieZnanyLekarzDoctors.get(specializationIterator));
        frame_selectDoctorSpeciality.add(button_doctorSpecialization[specializationIterator]);
    }

    void setLayoutDoctorSpeciality() {
        // Pokaż okno wyboru specjalizacji lekarza
        setGeneralLayout(frame_selectDoctorSpeciality, 300, 70 * list_nieZnanyLekarzDoctors.size(), list_nieZnanyLekarzDoctors.size());

        if(!setLayoutDocSpecialityAlreadyExecuted) { // prevent doing it in loop (adding buttons every time Back Up is clicked)
            for (int numOfDoc = 0; numOfDoc < list_nieZnanyLekarzDoctors.size(); numOfDoc++) {
                frame_nieZnanyLekarzSpecialist[numOfDoc] = new JFrame(list_nieZnanyLekarzDoctors.get(numOfDoc));
                createButtonsDoctorSpecializations(numOfDoc);
            }
            setLayoutDocSpecialityAlreadyExecuted = true;
        }

        // Set layouts for specializations
        createListOfDoctorNames();

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            button_doctorSpecialization[i].addActionListener(e -> {
                frame_selectDoctorSpeciality.dispose();
                setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[finalI], listOfDoctorNames.get(finalI));
                backUpButton();
            });
        }

    }
}
