package nieZnanyLekarz;

import javax.swing.*;

class LayoutDoctorSpeciality extends LayoutIndividualDoctor {
    void setLayoutSecondWindow() {
        setLayout(selectDoctorSpeciality, 335, 70 * nieZnanyLekarzDoctorsList.size() + 45, false);

        int y = 10;

        for (int numOfDoc = 0; numOfDoc < nieZnanyLekarzDoctorsList.size(); numOfDoc++) {
            nieZnanyLekarzSpecjalista[numOfDoc] = new JFrame(nieZnanyLekarzDoctorsList.get(numOfDoc));

            numberOfDoc[numOfDoc] = new JButton();
            numberOfDoc[numOfDoc].setBounds(10, y, 300, 60);
            numberOfDoc[numOfDoc].setVisible(true);
            numberOfDoc[numOfDoc].setText(nieZnanyLekarzDoctorsList.get(numOfDoc));
            selectDoctorSpeciality.add(numberOfDoc[numOfDoc]);

            int finalNumOfDoc = numOfDoc;
            numberOfDoc[numOfDoc].addActionListener(e -> {
                selectDoctorSpeciality.dispose();
                System.out.println(numberOfDoc[finalNumOfDoc].getText()); // print name of doctor to console
                setLayoutNieZnanyLekarzFrame(nieZnanyLekarzSpecjalista[finalNumOfDoc]);

                backUp.setBounds(10, 130, 100, 50);
                backUp.setVisible(true);
                backUp.addActionListener(e1 -> setLayoutSecondWindow());
            });

            y += 70;
        }
    }
}
