/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiariap.latihanmvc.controller;

import edu.rizkiariap.latihanmvc.model.PelangganModel;
import edu.rizkiariap.latihanmvc.view.PlangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Guntur Maulana I
 */
public class PelangganController {
    
   private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
   
   
   
   public void resetForm(PlangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelpon().getText();
       
       if (nama.equals("") && email.equals("") && notelepon.equals("")) {
           
       }else{
       
       model.resetForm();
       }
   }
   
   public void simpanForm(PlangganView view){
       String nama = view.getTextNama().getText();
       String email = view.getTextEmail().getText();
       String notelepon = view.getTextNoTelpon().getText();
       
       if (nama.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
           
       }else if(email.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "Email Masih Kosong");
            
       }else if(notelepon.trim().equals("")) {
           JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
             
       }else{
           model.simpanForm();
       }
   }
}
