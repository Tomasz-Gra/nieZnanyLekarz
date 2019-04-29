package nieZnanyLekarz;

class DoctorAppointment extends LayoutDoctorSpeciality {

    void showLoginScreen() {
        drawLoginScreen();

        button_submit.addActionListener(e -> {
            for (int i = 0; i < list_userAndPassword.size(); i = i + 2) {
                if ((textField_username.getText().equals(list_userAndPassword.get(i)) && textField_password.getText().equals(list_userAndPassword.get(i + 1)))) {
                    setLayoutDoctorSpeciality();
                    frame_loginScreen.dispose();
                /*
                } else if ((!textField_username.getText().equals(userAndPassword.get(i)) && !textField_password.getText().equals(userAndPassword.get(i + 1)))) {
                        JOptionPane.showMessageDialog(null, "Login and/or textField_password is invalid!");
                        break;
                */
                }
            }
        });


    }
}
