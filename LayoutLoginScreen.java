class LayoutLoginScreen extends Layouts {

    private void setLayoutFirstWindow() {
        setLayout(firstWindow, 470, 130, false);
    }

    void drawLoginScreen() {
        username.setBounds(10, 10, 300, 30);
        password.setBounds(10,55, 300, 30);
        submit.setBounds(330, 20, 100, 50);
        firstWindow.add(username);
        firstWindow.add(password);
        firstWindow.add(submit);
        submit.setFocusPainted(false);

        setLayout(firstWindow, 470, 130, false);
    }

}
