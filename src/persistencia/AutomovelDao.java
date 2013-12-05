package persistencia;

import classes.Automovel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;




public class AutomovelDao {
         
    private static ArrayList<Automovel> lista = new ArrayList<Automovel>();    
    
    public static void addAutomovel(Automovel auto){
           abrir();    
           lista.add(auto);
           salvar();      
}
   
    public static Automovel getAutomovel (String placa){
        abrir();
    int pos = -1;
    
    for (int i = 0; i < lista.size(); i++){
        
        if (lista.get(i).getPlaca().equals(placa))
            pos = i;
            }
    if (pos == -1)
     
        return null;
                        else 
                            return lista.get(pos);           
    }
      
     public static boolean removerAutomovel(String placa){
         abrir();
        
        int posicao = localizar(placa);
        if (posicao != -1)
        {
            lista.remove(posicao);
            salvar();
            return true;
        }
        else
            return false;
    
        
    }
     
     public static void atualizarAutomovel (Automovel auto){
            abrir();
            
            int posicao = localizar(auto.getPlaca());
        
            lista.remove(posicao);
        
            lista.add(posicao,auto);
        salvar();
         }
        
     
    
          private static int localizar(String placa)
    {
        int pos = -1;
        for(int i =0;i<lista.size();i++)
        {
            if(lista.get(i).getPlaca().equals(placa))
                pos = i;
        }
        
        return pos;
    }
    
     public static ArrayList<Automovel> getTodosAutomoveis()
    { abrir();
    
        return lista;
    }

    private static void abrir(){
             
             File f = new File("Automoveis.dat");
                            
             if (!f.exists()){
                 
                 try {
                   f.createNewFile();
                   salvar();
                 } catch (IOException ex) {
                     Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
                 }
              
             }
             
            ObjectInputStream in = null;
           
           
        try {       
            in = new ObjectInputStream(new FileInputStream("Automoveis.dat"));
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {         
        
            lista = (ArrayList<Automovel>)in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {        
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        }
             
         private static void salvar(){
             ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Automoveis.dat"));
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {                                       
            out.writeObject(lista);
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {        
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(AutomovelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
             
         }
   
         
}
