package nieZnanyLekarz;

import javax.swing.*;
import java.awt.*;

class Layouts extends Variables {

    void setGeneralLayout(JFrame frame, int width, int height, int noOfRows) {
        frame.setLayout(new GridLayout(noOfRows,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    void setDateLayout(JFrame frame, int width, int height, int numberOfRows) {
        frame.setLayout(new GridLayout(numberOfRows,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
