package nieZnanyLekarz;

import javax.swing.*;
import java.util.List;

class Layouts extends Variables {

    void setLayout(JFrame frame, int width, int height, boolean resize) {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(resize);
        frame.setVisible(true);
    }

    void addLabelsToDoctors(List<String> doctorList, JLabel[] doctorLabel, int doctorSpeciality) {
        int counter = 10;
        for (int labelCounter = 0; labelCounter < doctorList.size(); labelCounter++) {
            doctorLabel[labelCounter] = new JLabel();
            doctorLabel[labelCounter].setBounds(counter, 10, 100, 20);
            doctorLabel[labelCounter].setVisible(true);
            doctorLabel[labelCounter].setText(doctorList.get(labelCounter));
            nieZnanyLekarzSpecjalista[doctorSpeciality].add(doctorLabel[labelCounter]);

            counter += 120;
        }
    }
}
