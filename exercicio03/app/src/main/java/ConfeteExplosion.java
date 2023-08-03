import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ConfeteExplosion {

    public static void main(String[] args) {
        showConfeteExplosion();
    }

    public static void showConfeteExplosion() {
        JFrame frame = new JFrame("Confete Explosion");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawConfete(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

        // Animação das partículas de confete
        for (int i = 0; i < 100; i++) {
            moveConfete(panel.getGraphics(), panel.getWidth(), panel.getHeight());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void drawConfete(Graphics g) {
        Random random = new Random();
        int x = random.nextInt(800); // Coordenada X aleatória dentro da largura da janela
        int y = random.nextInt(600); // Coordenada Y aleatória dentro da altura da janela

        // Desenha uma partícula de confete como um retângulo colorido
        g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        g.fillRect(x, y, 10, 10);
    }

    private static void moveConfete(Graphics g, int width, int height) {
        for (int i = 0; i < 20; i++) {
            drawConfete(g);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}