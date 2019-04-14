import javax.swing.*;


class Layouts extends Variables {

    private void setLayout(JFrame frame, int width, int height, boolean resize) {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(resize);
        frame.setVisible(true);
    }

    private void setLayoutNieZnanyLekarzFrame(JFrame nieZnanyLekarzFrame) {
        backUp.setBounds(10, 10, 100, 50);
        backUp.setVisible(true);
        backUp.addActionListener(e1 -> setLayoutSecondWindow());

        nieZnanyLekarzFrame.setLayout(null);
        nieZnanyLekarzFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nieZnanyLekarzFrame.setSize(300, 300);
        nieZnanyLekarzFrame.setLocationRelativeTo(null);
        nieZnanyLekarzFrame.add(backUp);
        nieZnanyLekarzFrame.setVisible(true);
    }

    private void setLayoutFirstWindow() {
        setLayout(firstWindow, 470, 130, false);
    }
    void setLayoutSecondWindow() {
        setLayout(selectDoctorSpeciality, 335, 70 * nieZnanyLekarzDoctorsList.size() + 45, false);

        int y = 10;

        for (int numOfDoc = 0; numOfDoc < nieZnanyLekarzDoctorsList.size(); numOfDoc++) {
            nieZnanyLekarzSpecjalista[numOfDoc] = new JFrame(nieZnanyLekarzDoctorsList.get(numOfDoc));

            numberOfDoc[numOfDoc] = new JButton();
            numberOfDoc[numOfDoc].setBounds(10, y, 300, 60);
            numberOfDoc[numOfDoc].setVisible(true);
            numberOfDoc[numOfDoc].setText(nieZnanyLekarzDoctorsList.get(numOfDoc));
            int finalNumOfDoc = numOfDoc;
            numberOfDoc[numOfDoc].addActionListener(e -> {
                selectDoctorSpeciality.dispose();
                setLayoutNieZnanyLekarzFrame(nieZnanyLekarzSpecjalista[finalNumOfDoc]);
            });
            selectDoctorSpeciality.add(numberOfDoc[numOfDoc]);
            y = y + 70;
        }

    }

    void setLayoutMessageWindow() {
        setLayout(messageWindow, 300, 100, false);
    }

    void drawLoginScreen() {
        username.setBounds(10, 10, 300, 30);
        password.setBounds(10,55, 300, 30);
        submit.setBounds(330, 20, 100, 50);
        firstWindow.add(username);
        firstWindow.add(password);
        firstWindow.add(submit);
        submit.setFocusPainted(false);

        setLayoutFirstWindow();
    }
}
