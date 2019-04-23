class DoctorAppointment extends LayoutDoctorSpeciality {

    void showLoginScreen() {
        drawLoginScreen();

        submit.addActionListener(e -> {
            for (int i = 0; i < userAndPassword.size(); i = i + 2) {
                if ((username.getText().equals(userAndPassword.get(i)) && password.getText().equals(userAndPassword.get(i + 1)))) {
                    setLayoutSecondWindow();
                    firstWindow.dispose();
                /*
                } else if ((!username.getText().equals(userAndPassword.get(i)) && !password.getText().equals(userAndPassword.get(i + 1)))) {
                        JOptionPane.showMessageDialog(null, "Login and/or password is invalid!");
                        break;
                */
                }
            }
        });


    }
}
