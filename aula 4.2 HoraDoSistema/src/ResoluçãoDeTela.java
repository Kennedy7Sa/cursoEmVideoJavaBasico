import java.awt.*;

public class ResoluçãoDeTela {
    public static void main(String[] args) {
        //pegar a resolução da minha tela 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua maquina é : " + d.width + "x" + d.height);
    }
}
