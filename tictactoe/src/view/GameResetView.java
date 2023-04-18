package view;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.RowGameController;
import model.RowGameModel;

public class GameResetView extends JButton implements View {
    public GameResetView(RowGameController controller) {
        super("Undo");
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.undoMove();
            }
        });
    }

    @Override
    public void update(RowGameModel model) {
        this.setEnabled(model.movesLeft != 9 && model.getFinalResult() == null);
    }
}
