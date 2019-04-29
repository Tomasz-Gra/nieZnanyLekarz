package nieZnanyLekarz;

class LayoutLoginScreen extends Layouts {

    void drawLoginScreen() {
        textField_username.setBounds(10, 10, 300, 30);
        textField_password.setBounds(10,55, 300, 30);
        button_submit.setBounds(330, 20, 100, 50);
        frame_loginScreen.add(textField_username);
        frame_loginScreen.add(textField_password);
        frame_loginScreen.add(button_submit);
        button_submit.setFocusPainted(false);

        setGeneralLayout(frame_loginScreen, 470, 130);
    }

}
