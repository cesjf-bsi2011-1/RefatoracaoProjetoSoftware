
package com.aluguelautomoveis.model.dao;

import com.aluguelautomoveis.model.Funcionario;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FuncionarioDao {
   
    private static ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
    
    public static void addFuncionario(Funcionario funcionario){
           abrir();
           lista.add(funcionario);
           salvar();
}
    
    public static Funcionario getFuncionario (String cpf){
        abrir();
    int pos = -1;
    
    for (int i = 0; i < lista.size(); i++){
        
        if (lista.get(i).getCpf().equals(cpf))
            pos = i;
            }
    if (pos == -1)
         
        return null;
                        else 
                            return lista.get(pos);               
    }
    
    public static boolean removerFuncionario(String cpf){
         abrir();
         
        int posicao = localizar(cpf);
        if (posicao != -1)
        {
            lista.remove(posicao);
            salvar();
            return true;
        }
        else
            return false;
    
       }
    
    public static void atualizarFuncionario (Funcionario funcionario){
            abrir();
            
            int posicao = localizar(funcionario.getCpf());
        
            lista.remove(posicao);
        
            lista.add(posicao,funcionario);
        salvar();
         }
    
    private static int localizar(String cpf)
    {
        int pos = -1;
        for(int i =0;i<lista.size();i++)
        {
            if(lista.get(i).getCpf().equals(cpf))
                pos = i;
        }
        
        return pos;
    }
    
    public static ArrayList<Funcionario> getTodosFuncionario()
    { abrir();
    
        return lista;
    }
    
    private static void abrir(){
                  
             File f = new File("Funcionario.dat");
                           
             if (!f.exists()){
                       
                 try {
                   f.createNewFile();
                   salvar();
                 } catch (IOException ex) {
                     Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
       
            ObjectInputStream in = null;
         
                              
        try {
            in = new ObjectInputStream(new FileInputStream("Funcionario.dat"));
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            lista = (ArrayList<Funcionario>)in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
        }
             
    
    private static void salvar(){
             ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Funcionario.dat"));
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {                                       
            out.writeObject(lista);
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {        
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
             
         }

    public static boolean getTodosFuncionario(WindowEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
