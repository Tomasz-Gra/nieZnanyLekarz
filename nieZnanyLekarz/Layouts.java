package nieZnanyLekarz;

import javax.swing.*;

class Layouts extends Variables {

    void setGeneralLayout(JFrame frame, int width, int height) {
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
