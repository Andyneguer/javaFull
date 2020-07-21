import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    public JLabel label1;
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bp, b0, bc, bs, br, bi, bm, bd, bb;
    public JTextField texto;
    private double numero = 0.0;
    private double resultado = 0.0;
    private String comp = "";
    private String calcular;

    public Calculadora() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label1 = new JLabel("CALCULADORA");
        getContentPane().setBackground(new Color(0, 102, 0));
        label1.setBounds(135, 20, 600, 30);
        label1.setFont(new Font("Arial", 3, 30));
        label1.setForeground(new Color(255, 255, 255));
        add(label1);

        texto = new JTextField();
        texto.setBounds(20, 80, 460, 80);
        texto.setFont(new Font("Arial", 3, 20));
        texto.setForeground(new Color(0, 0, 0, 255));
        add(texto);

        b1 = new JButton("1");
        b1.setBounds(20, 200, 140, 40);
        b1.setFont(new Font("Arial", 3, 20));
        b1.setForeground(new Color(0, 0, 0, 255));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("2");
        b2.setBounds(180, 200, 140, 40);
        b2.setFont(new Font("Arial", 3, 20));
        b2.setForeground(new Color(0, 0, 0, 255));
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("3");
        b3.setBounds(340, 200, 140, 40);
        b3.setFont(new Font("Arial", 3, 20));
        b3.setForeground(new Color(0, 0, 0, 255));
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("4");
        b4.setBounds(20, 250, 140, 40);
        b4.setFont(new Font("Arial", 3, 20));
        b4.setForeground(new Color(0, 0, 0, 255));
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("5");
        b5.setBounds(180, 250, 140, 40);
        b5.setFont(new Font("Arial", 3, 20));
        b5.setForeground(new Color(0, 0, 0, 255));
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("6");
        b6.setBounds(340, 250, 140, 40);
        b6.setFont(new Font("Arial", 3, 20));
        b6.setForeground(new Color(0, 0, 0, 255));
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("7");
        b7.setBounds(20, 300, 140, 40);
        b7.setFont(new Font("Arial", 3, 20));
        b7.setForeground(new Color(0, 0, 0, 255));
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("8");
        b8.setBounds(180, 300, 140, 40);
        b8.setFont(new Font("Arial", 3, 20));
        b8.setForeground(new Color(0, 0, 0, 255));
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("9");
        b9.setBounds(340, 300, 140, 40);
        b9.setFont(new Font("Arial", 3, 20));
        b9.setForeground(new Color(0, 0, 0, 255));
        b9.addActionListener(this);
        add(b9);

        bp = new JButton(".");
        bp.setBounds(20, 350, 140, 40);
        bp.setFont(new Font("Arial", 3, 20));
        bp.setForeground(new Color(0, 0, 0, 255));
        bp.addActionListener(this);
        add(bp);

        b0 = new JButton("0");
        b0.setBounds(180, 350, 140, 40);
        b0.setFont(new Font("Arial", 3, 20));
        b0.setForeground(new Color(0, 0, 0, 255));
        b0.addActionListener(this);
        add(b0);

        bc = new JButton("CE");
        bc.setBounds(340, 350, 140, 40);
        bc.setFont(new Font("Arial", 3, 20));
        bc.setForeground(new Color(0, 0, 0, 255));
        bc.addActionListener(this);
        add(bc);

        bs = new JButton("+");
        bs.setBounds(20, 400, 140, 40);
        bs.setFont(new Font("Arial", 3, 20));
        bs.setForeground(new Color(0, 0, 0, 255));
        bs.addActionListener(this);
        add(bs);

        br = new JButton("-");
        br.setBounds(180, 400, 140, 40);
        br.setFont(new Font("Arial", 3, 20));
        br.setForeground(new Color(0, 0, 0, 255));
        br.addActionListener(this);
        add(br);

        bi = new JButton("=");
        bi.setBounds(340, 400, 140, 40);
        bi.setFont(new Font("Arial", 3, 20));
        bi.setForeground(new Color(0, 0, 0, 255));
        bi.addActionListener(this);
        add(bi);

        bm = new JButton("*");
        bm.setBounds(20, 450, 140, 40);
        bm.setFont(new Font("Arial", 3, 20));
        bm.setForeground(new Color(0, 0, 0, 255));
        bm.addActionListener(this);
        add(bm);

        bd = new JButton("/");
        bd.setBounds(180, 450, 140, 40);
        bd.setFont(new Font("Arial", 3, 20));
        bd.setForeground(new Color(0, 0, 0, 255));
        bd.addActionListener(this);
        add(bd);

        bb = new JButton("C");
        bb.setBounds(340, 450, 140, 40);
        bb.setFont(new Font("Arial", 3, 20));
        bb.setForeground(new Color(0, 0, 0, 255));
        bb.addActionListener(this);
        add(bb);
    }

    public void actionPerformed(ActionEvent ab) {
        if (ab.getSource() == b0) {
            calcular = texto.getText();
            texto.setText(calcular + "0");
        }

        if (ab.getSource() == b1) {
            calcular = texto.getText();
            texto.setText(calcular + "1");
        }

        if (ab.getSource() == b2) {
            calcular = texto.getText();
            texto.setText(calcular + "2");
        }

        if (ab.getSource() == b3) {
            calcular = texto.getText();
            texto.setText(calcular + "3");
        }

        if (ab.getSource() == b4) {
            calcular = texto.getText();
            texto.setText(calcular + "4");
        }

        if (ab.getSource() == b5) {
            calcular = texto.getText();
            texto.setText(calcular + "5");
        }

        if (ab.getSource() == b6) {
            calcular = texto.getText();
            texto.setText(calcular + "6");
        }

        if (ab.getSource() == b7) {
            calcular = texto.getText();
            texto.setText(calcular + "7");
        }

        if (ab.getSource() == b8) {
            calcular = texto.getText();
            texto.setText(calcular + "8");
        }

        if (ab.getSource() == b9) {
            calcular = texto.getText();
            texto.setText(calcular + "9");
        }

        if (ab.getSource() == bp) {
            calcular = texto.getText();
            texto.setText(calcular + ".");
        }

        if (ab.getSource() == bs){
            FuncionSuma();
        }

        if (ab.getSource() == br){
            FuncionResta();
        }

        if (ab.getSource() == bm){
            FuncionMultiplicacion();
        }

        if (ab.getSource() == bd){
            FuncionDivision();
        }

        if (ab.getSource() == bi){
            FuncionIgualdad();
        }

        if (ab.getSource() == bb){
            resultado = 0.0;
            numero = 0.0;
            comp = "";
            calcular = "";
            texto.setText("");
        }
    }

    public void FuncionSuma(){
        if(texto.getText() == ""){
            texto.setText("0");
        }

        numero = Double.parseDouble(texto.getText());

        if(comp == "-"){
            resultado = (resultado - numero);
            texto.setText("0");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            texto.setText("0");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            texto.setText("0");
        }

        comp = "+";
        numero = Double.parseDouble(texto.getText());
        resultado = (resultado + numero);
        texto.setText("");
    }

    public void FuncionResta(){
        numero = Double.parseDouble(texto.getText());

        if(comp == "+"){
            resultado = (resultado + numero);
            texto.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            texto.setText("");
        } else if(comp == "/"){
            resultado = (resultado / numero);
            texto.setText("");
        }

        comp = "-";
        numero = Double.parseDouble(texto.getText());
        resultado = (numero - resultado);
        texto.setText("");
    }

    public void FuncionMultiplicacion(){
        if(texto.getText() == ""){
            texto.setText("1");
        }

        numero = Double.parseDouble(texto.getText());

        if(comp == "+"){
            resultado = (resultado + numero);
            texto.setText("1");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            texto.setText("1");
        } else if (comp == "/"){
            resultado = (resultado / numero);
            texto.setText("1");
        }

        if(resultado == 0.0){
            resultado = 1.0;
        }

        comp = "*";
        numero = Double.parseDouble(texto.getText());
        resultado = (resultado * numero);
        texto.setText("");
    }

    public void FuncionDivision(){
        numero = Double.parseDouble(texto.getText());

        if(comp == "+"){
            resultado = (resultado + numero);
            texto.setText("");
        } else if(comp == "-"){
            resultado = (resultado - numero);
            texto.setText("");
        } else if(comp == "*"){
            resultado = (resultado * numero);
            texto.setText("");
        }

        if(resultado == 0.0){
            resultado = 1.0;
        }

        comp = "/";
        numero = Double.parseDouble(texto.getText());
        resultado = (numero / resultado);
        texto.setText("");
    }

    public void FuncionIgualdad(){
        numero = Double.parseDouble(texto.getText());

        if(comp == "+"){
            resultado = (resultado + numero);
            texto.setText("" + resultado);
        } else if(comp == "-"){
            resultado = (resultado - numero);
            texto.setText("" + resultado);
        } else if(comp == "*"){
            resultado = (resultado * numero);
            texto.setText("" + resultado);
        } else if (comp == "/"){
            resultado = (resultado / numero);
            texto.setText("" + resultado);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setBounds(0, 0, 515, 550);
        calculadora.setResizable(false);
        calculadora.setLocationRelativeTo(null);
        calculadora.setVisible(true);
    }
}
