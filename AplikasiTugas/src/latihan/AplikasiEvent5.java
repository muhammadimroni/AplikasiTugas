/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author LENOVO B41
 */
import javax.swing.*;
import java.awt.event.*;

class AplikasiEvent5 extends JFrame{
JLabel lblnama=new JLabel("Nama");
JTextField txnama=new JTextField(20);
JLabel lblnim=new JLabel("NIM");
JTextField txnim=new JTextField(7);
JLabel lblkelamin=new JLabel("Jenis Kelamin");
JRadioButton pria=new JRadioButton("Pria");
JRadioButton wanita=new JRadioButton("Wanita");
ButtonGroup kelompok=new ButtonGroup();
JButton cetak=new JButton("Cetak");
JTextArea hasil=new JTextArea();
AplikasiEvent5()
{
setTitle("Event Sederhana");
setLocation(300,100);
setSize(300,320);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
void KomponenVisual()
{
getContentPane().setLayout(null);
getContentPane().add(lblnama);
lblnama.setBounds(10,10,80,20);
getContentPane().add(txnama);
txnama.setBounds(105,10,175,20);
getContentPane().add(lblnim);
lblnim.setBounds(10,33,80,20);
getContentPane().add(txnim);
txnim.setBounds(105,33,70,20);
getContentPane().add(lblkelamin);
lblkelamin.setBounds(10,56,80,20);
kelompok.add(pria);
kelompok.add(wanita);
getContentPane().add(pria);
pria.setBounds(105,56,50,20);
getContentPane().add(wanita);
wanita.setBounds(160,56,70,20);
getContentPane().add(cetak);
cetak.setBounds(10,80,270,20);
getContentPane().add(hasil);
hasil.setBounds(10,105,270,150);
setVisible(true);
}
void AksiReaksi()
{
cetak.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil.append(txnama.getText()+"\n");
hasil.append(txnim.getText()+"\n");
if(pria.isSelected()==true)
{
hasil.append(pria.getText()+"\n");
}
else
{
hasil.append(wanita.getText()+"\n");
}
}
});
}
public static void main(String args[])
{
AplikasiEvent5 e5=new AplikasiEvent5();
e5.KomponenVisual();
e5.AksiReaksi();
}
}