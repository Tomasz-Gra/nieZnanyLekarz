package nieZnanyLekarz;

import javax.swing.*;

class LayoutIndividualDoctor extends LayoutLoginScreen{
    private void setLayoutDoctors() {
        addLabelsToDoctors(labelListInternista, labelsInternista, 0);
        addLabelsToDoctors(labelListOnkolog, labelsOnkolog, 1);
        addLabelsToDoctors(labelListPediatra, labelsPediatra, 2);
        addLabelsToDoctors(labelListGinekolog, labelsGinekolog, 3);
    }

    void setLayoutNieZnanyLekarzFrame(JFrame nieZnanyLekarzFrame) {

        setLayoutDoctors();

        nieZnanyLekarzFrame.setLayout(null);
        nieZnanyLekarzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nieZnanyLekarzFrame.setSize(300, 300);
        nieZnanyLekarzFrame.setLocationRelativeTo(null);
        nieZnanyLekarzFrame.add(backUp);
        nieZnanyLekarzFrame.setVisible(true);
    }
}
