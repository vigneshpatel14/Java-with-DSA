package basics;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WEEK11 extends JFrame {
    private JLabel label;
    public WEEK11()
    {
        setTitle("mouse events");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel();
        add(label);
        addMouseListener(new MyMouseListener());
        setVisible(true);
    }
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mouseEntered(MouseEvent e){
            displayEvent("mouse Entered",e);
        }
        @Override
        public void mouseClicked(MouseEvent e){
            displayEvent("mouse clicked",e);
        }
        @Override
        public void mousePressed(MouseEvent e){
            displayEvent("mouse Pressed",e);
        }
        @Override
        public void mouseReleased(MouseEvent e){
            displayEvent("mouse Released",e);
        }
        @Override
        public void mouseExited(MouseEvent e){
            displayEvent("mouse Exited",e);
        }
        @Override
        public void mouseDragged(MouseEvent e){
            displayEvent("mouse Dragged",e);
        }
        @Override
        public void mouseMoved(MouseEvent e){
            displayEvent("mouse Moved",e);
        }
    }
    private void displayEvent(String eventName,MouseEvent e){
        label
                .setText(eventName);
    }
    public static void main(String [] args){
        new WEEK11();
    }

}
