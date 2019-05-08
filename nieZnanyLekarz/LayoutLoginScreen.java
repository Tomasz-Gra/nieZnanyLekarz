package nieZnanyLekarz;

import java.io.IOException;

class LayoutLoginScreen extends Layouts {

    void drawLoginScreen() throws IOException {
        launchReader();

        frame_loginScreen.add(textField_username);
        frame_loginScreen.add(textField_password);
        frame_loginScreen.add(button_submit);
        button_submit.setFocusPainted(false);

        setGeneralLayout(frame_loginScreen, 300, 180, 3);
    }

}
