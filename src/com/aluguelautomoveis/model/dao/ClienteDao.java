package com.aluguelautomoveis.model.dao;

import com.aluguelautomoveis.model.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDao {

    private static ArrayList<Cliente> lista = new ArrayList<Cliente>();

    public static void addCliente(Cliente cliente) {
        abrir();
        lista.add(cliente);
        salvar();
    }

    public static Cliente getCliente(String cpf) {
        abrir();
        int pos = -1;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getCpf().equals(cpf)) {
                pos = i;
            }
        }
        if (pos == -1) {
            return null;
        } else {
            return lista.get(pos);
        }
    }

    public static boolean removerCliente(String cpf) {
        abrir();

        int posicao = localizar(cpf);
        if (posicao != -1) {
            lista.remove(posicao);
            salvar();
            return true;
        } else {
            return false;
        }

    }

    public static void atualizarCliente(Cliente cliente) {
        abrir();

        int posicao = localizar(cliente.getCpf());

        lista.remove(posicao);

        lista.add(posicao, cliente);
        salvar();
    }

    private static int localizar(String cpf) {
        int pos = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCpf().equals(cpf)) {
                pos = i;
            }
        }

        return pos;
    }

    public static ArrayList<Cliente> getTodosClientes() {
        abrir();

        return lista;
    }

    private static void abrir() {

        File f = new File("Clientes.dat");

        if (!f.exists()) {

            try {
                f.createNewFile();
                salvar();
            } catch (IOException ex) {
                Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("Clientes.dat"));
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            lista = (ArrayList<Cliente>) in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void salvar() {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Clientes.dat"));
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.writeObject(lista);
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
