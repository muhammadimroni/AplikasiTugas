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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AplikasiPenyewaanSepeda extends JFrame{
    
 JLabel lblid=new JLabel("ID");
 JTextField txid=new JTextField(20);
 JButton tblcari=new JButton("Cari");
 
 JLabel lblnama=new JLabel("Nama");
 JTextField txnama= new JTextField(20);
 
 JLabel lbllama=new JLabel("Lama Penyewaan");
 JRadioButton waktuA=new JRadioButton("1 Hari");
 JRadioButton waktuB=new JRadioButton("3 Hari");
 ButtonGroup lamawaktu=new ButtonGroup();

 JLabel lblmerk=new JLabel("Merk Dan Type Sepeda :");
 
 JLabel lblpolygon=new JLabel("Polygon -");
 String[] polygon={" ","XQuarone EX-9","Collosus DHX","Xtrada 8","Sisiku D8","Syncline 7"};
 JComboBox cbpolygon=new JComboBox(polygon);
 
 JLabel lblwincycle=new JLabel("Win Cycle -");
 String[] wincycle={" ","BMX 20' Dirt Trasher","BMX 20' Firebird","BMX 20' Blade","Fixie"};
 JComboBox cbwincycle=new JComboBox(wincycle);
 
 JLabel lblthrill=new JLabel("Thrill -");
 String[] thrill={" ","Fervent","Ricochet","Ravage","Vanquish","Wreak"};
 JComboBox cbthrill=new JComboBox(thrill);
 
JButton cetak=new JButton("Cetak");
JTextArea hasil=new JTextArea();
 
 JButton tbllanjut=new JButton("Lanjut");
 
 JButton tblbatal=new JButton("Batal");
 
 JButton tblkeluar=new JButton("Keluar");
 
 JLabel lblsk=new JLabel("*Syarat dan Ketentuan Berlaku.");
 
 AplikasiPenyewaanSepeda(){
setTitle("Formulir Penyewaan SepedaKu");
setLocation(300,100);
setSize(400,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
 }
 void komponenVisual()
 {
     getContentPane().setLayout(null);
     getContentPane().add(lblid);
     lblid.setBounds(10,10,70,20);
     getContentPane().add(txid);
     txid.setBounds(75,10,100,20);
     getContentPane().add(tblcari);
     tblcari.setBounds(180,10,95,20);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,30,70,20);
     getContentPane().add(txnama);
     txnama.setBounds(75,30,200,20);
     getContentPane().add(waktuA);
     getContentPane().add(lbllama);
     lbllama.setBounds(10,50,110,20);
     waktuA.setBounds(120,50,70,20);
     getContentPane().add(waktuB);
     waktuB.setBounds(200,50,70,20);
     lamawaktu.add(waktuA);
     lamawaktu.add(waktuB);

     getContentPane().add(lblmerk);
     lblmerk.setBounds(10,80,150,20);
     
     getContentPane().add(lblpolygon);
     lblpolygon.setBounds(10,100,150,20);
     getContentPane().add(cbpolygon);
     cbpolygon.setBounds(135,100,140,20);
     
     getContentPane().add(lblwincycle);
     lblwincycle.setBounds(10,130,150,20);
     getContentPane().add(cbwincycle);
     cbwincycle.setBounds(135,130,140,20);
     
     getContentPane().add(lblthrill);
     lblthrill.setBounds(10,160,150,20);
     getContentPane().add(cbthrill);
     cbthrill.setBounds(135,160,140,20);
     
    getContentPane().add(cetak);
    cetak.setBounds(10,190,270,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,220,270,150);
     
     getContentPane().add(tbllanjut);
     tbllanjut.setBounds(10,380,90,20);
     
     getContentPane().add(tblbatal);
     tblbatal.setBounds(110,380,90,20);
     
     getContentPane().add(tblkeluar);
     tblkeluar.setBounds(210,380,90,20);

     getContentPane().add(lblsk);
     lblsk.setBounds(140,400,190,20);
     
     setVisible(true);
 }
void AksiReaksi()
{
cetak.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil.append(txid.getText()+"\n");
hasil.append(txnama.getText()+"\n");

if(waktuA.isSelected()==true)
{
hasil.append(waktuA.getText()+"\n");
}
else
{
hasil.append(waktuB.getText()+"\n");
}
}
});
}
public static void main(String args[])
{
  AplikasiPenyewaanSepeda baru = new AplikasiPenyewaanSepeda();
  baru.komponenVisual();
  baru.AksiReaksi();
}
}
