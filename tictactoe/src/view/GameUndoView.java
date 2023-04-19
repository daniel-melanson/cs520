package view;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.RowGameController;
import model.RowGameModel;

/**
 * The GameUndoView class undos the last move made when clicked and visualizes
 * whether a move can be undone or not.
 *
 * NOTE) For the Composite design pattern, this class is-a Component (i.e.
 * View).
 */
public class GameUndoView extends JButton implements View {
    public GameUndoView(RowGameController controller) {
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
