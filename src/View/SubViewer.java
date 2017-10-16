package View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SubViewer extends Viewer {

    private final GiaoDienChinhView parentView;
    private final SubViewer thisView;

    public SubViewer(GiaoDienChinhView parent) {
        super();
        parentView = parent;
        thisView = this;
        initListenner();
    }

    private void initListenner() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisView.setVisible(false);
                parentView.setVisible(true);
                parentView.setEnabled(true);
            }
        });
    }

}
