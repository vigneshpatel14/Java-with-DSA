import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame {
    public MouseEventDemo() {
// Set frame properties
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setVisible(true);
// Add mouse event listeners using adapter classes
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
    }
    // Adapter class for mouse events
    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            displayEvent("Mouse Clicked", e);
        }
        @Override
        public void mousePressed(MouseEvent e) {
            displayEvent("Mouse Pressed", e);
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            displayEvent("Mouse Released", e);
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            displayEvent("Mouse Entered", e);
        }
        @Override
        public void mouseExited(MouseEvent e) {
            displayEvent("Mouse Exited", e);
        }
    }
    // Adapter class for mouse motion events
    class MyMouseMotionListener extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            displayEvent("Mouse Moved", e);
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            displayEvent("Mouse Dragged", e);
        }
    }
    // Display the event name at the center of the window
    private void displayEvent(String eventName, MouseEvent e) {
        Graphics g = getGraphics();
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawString(eventName, getWidth() / 2, getHeight() / 2);
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
