package nieZnanyLekarz;

import javax.swing.*;

class LayoutDoctorSpeciality extends LayoutIndividualDoctor {

    // Add button to be able to back up to doctor speciality window
    private void backUpButton() {
        button_backUp.setVisible(true);
        button_backUp.addActionListener(e1 -> {
            // Dispose individual doctor speciality and show doctor speciality window
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

        button_doctorSpecialization[0].addActionListener(e -> {
            frame_selectDoctorSpeciality.dispose();
            setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[0], list_internistsNames);
            backUpButton();
        });

        button_doctorSpecialization[1].addActionListener(e -> {
            frame_selectDoctorSpeciality.dispose();
            setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[1], list_oncologistsNames);
            backUpButton();
        });

        button_doctorSpecialization[2].addActionListener(e -> {
            frame_selectDoctorSpeciality.dispose();
            setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[2], list_cardiologistsNames);
            backUpButton();
        });

    }
}
