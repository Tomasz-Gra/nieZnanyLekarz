package nieZnanyLekarz;

import javax.swing.*;

class LayoutDoctorSpeciality extends LayoutIndividualDoctor {

    // Add button to be able to back up to doctor speciality window
    private void backUpButton() {
        button_backUp.setBounds(10, 160, 100, 50);
        button_backUp.setVisible(true);
        button_backUp.addActionListener(e1 -> {
            // Dispose individual doctor speciality and show doctor speciality window
            for (int i = 0; i < array_nieZnanyLekarzDoctors.length; i++)
                frame_nieZnanyLekarzSpecialist[i].dispose();
            setLayoutDoctorSpeciality();
        });
    }

    // Wybór specjalizacji lekarza - Internista, Onkolog itd
    private void createButtonsDoctorSpecializations(int specializationIterator, int yPosition) {
        button_doctorSpecialization[specializationIterator] = new JButton();
        button_doctorSpecialization[specializationIterator].setBounds(10, yPosition, 300, 60);
        button_doctorSpecialization[specializationIterator].setVisible(true);
        button_doctorSpecialization[specializationIterator].setText(list_nieZnanyLekarzDoctors.get(specializationIterator));
        frame_selectDoctorSpeciality.add(button_doctorSpecialization[specializationIterator]);
    }

    void setLayoutDoctorSpeciality() {
        // Pokaż okno wyboru specjalizacji lekarza
        setGeneralLayout(frame_selectDoctorSpeciality, 335, 70 * list_nieZnanyLekarzDoctors.size() + 45);

        int yAxis = 10;

        for (int numOfDoc = 0; numOfDoc < list_nieZnanyLekarzDoctors.size(); numOfDoc++) {
            frame_nieZnanyLekarzSpecialist[numOfDoc] = new JFrame(list_nieZnanyLekarzDoctors.get(numOfDoc));

            createButtonsDoctorSpecializations(numOfDoc, yAxis);

            yAxis += 70;
        }

        button_doctorSpecialization[0].addActionListener(e -> {
            frame_selectDoctorSpeciality.dispose();
            setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[0], list_internistaNames);
            backUpButton();
        });

        button_doctorSpecialization[1].addActionListener(e -> {
            frame_selectDoctorSpeciality.dispose();
            setLayoutNieZnanyLekarzFrame(frame_nieZnanyLekarzSpecialist[1], list_onkologNames);
            backUpButton();
        });

    }
}
