/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aluguelautomoveis.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Locadora de Veículo
 */
public class Utils {

    public static String DateToStr(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.format(data);
    }

    public static Date StrToDate(String data) throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        return formatador.parse(data);
    }
}
