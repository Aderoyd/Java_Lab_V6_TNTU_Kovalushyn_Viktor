import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class LineIntersectionApp extends JFrame {
    private ArrayList<Line> lines = new ArrayList<>();

    public LineIntersectionApp() {
        setTitle("Line Intersection Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initMenu();
        initUI();
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem restartItem = new JMenuItem("Restart");
        JMenuItem exitItem = new JMenuItem("Exit");

        restartItem.addActionListener(e -> restart());
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(restartItem);
        fileMenu.add(exitItem);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem helpItem = new JMenuItem("Help Contents");
        JMenuItem aboutItem = new JMenuItem("About");

        helpItem.addActionListener(e -> showHelp());
        aboutItem.addActionListener(e -> showAbout());

        helpMenu.add(helpItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    private void initUI() {
        JPanel panel = new JPanel();
        JTextField x1Field = new JTextField(5);
        JTextField y1Field = new JTextField(5);
        JTextField x2Field = new JTextField(5);
        JTextField y2Field = new JTextField(5);
        JButton addButton = new JButton("Add Line");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int x1 = Integer.parseInt(x1Field.getText());
                    int y1 = Integer.parseInt(y1Field.getText());
                    int x2 = Integer.parseInt(x2Field.getText());
                    int y2 = Integer.parseInt(y2Field.getText());
                    lines.add(new Line(new Point(x1, y1), new Point(x2, y2)));
                    repaint();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(LineIntersectionApp.this, "Invalid input! Please enter numeric values.");
                }
            }
        });

        panel.add(new JLabel("X1:"));
        panel.add(x1Field);
        panel.add(new JLabel("Y1:"));
        panel.add(y1Field);
        panel.add(new JLabel("X2:"));
        panel.add(x2Field);
        panel.add(new JLabel("Y2:"));
        panel.add(y2Field);
        panel.add(addButton);

        add(panel, BorderLayout.NORTH);

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
    }

    private void restart() {
        lines.clear();
        repaint();
    }

    private void showHelp() {
        JOptionPane.showMessageDialog(this, "For help you must calling creator or smth another, TRY RESTART ANYWAY!!!");
    }

    private void showAbout() {
        JOptionPane.showMessageDialog(this, "Line builder");
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            for (Line line : lines) {
                g2d.draw(new Line2D.Double(line.getA().x, line.getA().y, line.getB().x, line.getB().y));
            }

            for (int i = 0; i < lines.size(); i++) {
                for (int j = i + 1; j < lines.size(); j++) {
                    if (lines.get(i).intersects(lines.get(j))) {
                        g2d.setColor(Color.RED);
                        g2d.draw(new Line2D.Double(lines.get(i).getA().x, lines.get(i).getA().y, lines.get(i).getB().x, lines.get(i).getB().y));
                        g2d.draw(new Line2D.Double(lines.get(j).getA().x, lines.get(j).getA().y, lines.get(j).getB().x, lines.get(j).getB().y));
                        g2d.setColor(Color.BLACK);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LineIntersectionApp app = new LineIntersectionApp();
            app.setVisible(true);
        });
    }
}