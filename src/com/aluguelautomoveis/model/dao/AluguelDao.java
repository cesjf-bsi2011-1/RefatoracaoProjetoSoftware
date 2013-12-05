package com.aluguelautomoveis.model.dao;

import java.util.ArrayList;
import com.aluguelautomoveis.model.Aluguel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AluguelDao {

    private static ArrayList<Aluguel> lista = new ArrayList<Aluguel>();

    public static void addAluguel(Aluguel aluguel) {
        abrir();
        lista.add(aluguel);
        salvar();
    }

    public static Aluguel getAluguel(double numero) {
        abrir();
        int pos = -1;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getNumero() == (numero)) {
                pos = i;
            }

        }
        if (pos == -1) {
            return null;
        } else {
            return lista.get(pos);
        }
    }

    public static boolean ConfirmaDevolucao(double numero) {
        abrir();

        int posicao = localizar(numero);
        if (posicao != -1) {
            lista.remove(posicao);
            salvar();
            return true;
        } else {
            return false;
        }

    }

    public static ArrayList<Aluguel> getTodosAlugueis() {
        abrir();
        return lista;
    }

    private static int localizar(double numero) {
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumero() == (numero)) {
                pos = i;
            }
        }

        return pos;
    }

    private static void abrir() {

        File f = new File("Alugueis.dat");

        if (!f.exists()) {

            try {
                f.createNewFile();
                salvar();
            } catch (IOException ex) {
                Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("Alugueis.dat"));
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            lista = (ArrayList<Aluguel>) in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void salvar() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Alugueis.dat"));
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.writeObject(lista);
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(AluguelDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
