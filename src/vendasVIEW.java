import javax.swing.JFrame;
import javax.swing.JLabel;

public class vendasVIEW extends JFrame {

    public vendasVIEW() {
        setTitle("Tela de Vendas");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Produtos Vendidos", JLabel.CENTER);
        add(label);
    }
}