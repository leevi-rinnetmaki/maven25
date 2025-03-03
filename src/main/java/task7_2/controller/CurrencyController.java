package task7_2.controller;

import task7_2.dao.CurrencyDao;
import task7_2.entity.CurrencyModel;
import task7_2.view.CurrencyView;
import java.util.*;


public class CurrencyController {
    CurrencyModel model;
    CurrencyView view;
    CurrencyDao dao;
    public List<CurrencyModel> currensies;

    public CurrencyController(CurrencyView view, CurrencyDao dao) {
        this.view = view;
        this.dao = dao;
        currensies = dao.getAllCurrencies();
        //System.out.println(currensies.get(0).getAbbreviation());
        //view.addCurrency(currensies.get(0).getAbbreviation());
        //view.addCurrency("test");

    }

    public void convert(){
        try {
            double value = Double.parseDouble(view.getValue());
            double convert = (double)view.radioLeft();
            double converted = (double)view.radioRight();
            //view.setCOnverted(String.format("%.2f", model.convert(value, convert, converted)));
            view.setCOnverted(String.format("%.2f", value/convert*converted));
            //System.out.println(value/convert*converted);
            view.setErrorLabel("");

        }catch (Exception e){
            view.setErrorLabel("ERROR");
            System.out.println("ERROR " + e.getMessage());
        }
    }


}