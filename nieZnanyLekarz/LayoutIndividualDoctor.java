package nieZnanyLekarz;

import javax.swing.*;
import java.util.List;

class LayoutIndividualDoctor extends LayoutLoginScreen {

    private void addLabelsAndButtonsForIndividualDoctor(List<String> individualDoctorName, JLabel[] doctorLabel, int doctorSpeciality, JButton[] doctorButton) {

        int xPosition = 10; // set position of X axis

        for (int labelAndButtonIterator = 0; labelAndButtonIterator < individualDoctorName.size(); labelAndButtonIterator++) {
            doctorLabel[labelAndButtonIterator] = new JLabel();
            doctorLabel[labelAndButtonIterator].setBounds(xPosition, 10, 100, 20);
            doctorLabel[labelAndButtonIterator].setHorizontalAlignment(SwingConstants.CENTER);
            doctorLabel[labelAndButtonIterator].setVisible(true);
            doctorLabel[labelAndButtonIterator].setText(individualDoctorName.get(labelAndButtonIterator));

            doctorButton[labelAndButtonIterator] = new JButton();
            doctorButton[labelAndButtonIterator].setBounds(xPosition, 40, 100, 100);
            doctorButton[labelAndButtonIterator].setVisible(true);

            frame_nieZnanyLekarzSpecialist[doctorSpeciality].add(doctorLabel[labelAndButtonIterator]);
            frame_nieZnanyLekarzSpecialist[doctorSpeciality].add(doctorButton[labelAndButtonIterator]);

            xPosition += 110;
        }
    }

    private void setLayoutDoctors() {
        addLabelsAndButtonsForIndividualDoctor(list_internistaNames, label_internistaNames, 0, button_internistaNames);
        addLabelsAndButtonsForIndividualDoctor(list_onkologNames, label_onkologNames, 1, button_onkologNames);

        for (int internistIterator = 0; internistIterator < button_internistaNames.length; internistIterator++) {
            Icon icon_internist = new ImageIcon(array_internistIcons[internistIterator]);
            button_internistaNames[internistIterator].setIcon(icon_internist);

            int finalI = internistIterator + 1;
            button_internistaNames[internistIterator].addActionListener(e -> JOptionPane.showMessageDialog(null, finalI + "." + " Internist Calendar", "Calendar: ", JOptionPane.INFORMATION_MESSAGE));
        }

        for (int oncologistIterator = 0; oncologistIterator < button_onkologNames.length; oncologistIterator++) {
            Icon icon_internist = new ImageIcon(array_oncologistIcons[oncologistIterator]);
            button_onkologNames[oncologistIterator].setIcon(icon_internist);

            int finalI = oncologistIterator + 1;
            button_onkologNames[oncologistIterator].addActionListener(e -> JOptionPane.showMessageDialog(null, finalI + "." + " Oncologist Calendar", "Calendar: ", JOptionPane.INFORMATION_MESSAGE));
        }
    }

    void setLayoutNieZnanyLekarzFrame(JFrame nieZnanyLekarzFrame, List<String> doctorNamesList) {
        setLayoutDoctors();

        nieZnanyLekarzFrame.setLayout(null);
        nieZnanyLekarzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nieZnanyLekarzFrame.setSize(115 * doctorNamesList.size() + 15, 260);
        nieZnanyLekarzFrame.setLocationRelativeTo(null);
        nieZnanyLekarzFrame.add(button_backUp);
        nieZnanyLekarzFrame.setVisible(true);
    }
}
