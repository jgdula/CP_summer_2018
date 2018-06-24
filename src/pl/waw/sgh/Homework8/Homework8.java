package pl.waw.sgh.Homework8;

import pl.waw.sgh.bank.ui.CustomerUI;

public class Homework8 {

    public Homework8() {
        CustomerUI startUI = new CustomerUI();
        try {
            startUI.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
