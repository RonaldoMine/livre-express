package Main;

import App.Application;
import Views.GesCom_Menu;
import Views.GesCom_SignUp;
import Views.Launcher_GesCom;

public class GesCom_Main {

    static Launcher_GesCom l = new Launcher_GesCom();
    static GesCom_SignUp s = new GesCom_SignUp();
    static GesCom_Menu menu = new GesCom_Menu();

    public static void main(String[] args) {
        l.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                l.progressBar.setValue(i);
                if (i < 40) {
                    Thread.sleep(50);
                }
                if (i >= 40 && i < 50) {
                    l.labText.setText("Connexion a la base de données....");
                    Thread.sleep(100);
                    Application.getDB();
                } else if (i >= 50 && i < 80) {
                    l.labText.setText("Chargement des données....");
                    Thread.sleep(300);
                } else {
                    Thread.sleep(0);
                }
                if (i == 100) {
                    l.dispose();
                    checker();
                }

            }
        } catch (Exception ex) {

        }
    }

    private static void checker() {
        if (Application.getDU().isLogIn()) {
           menu.setVisible(true);
        } else {
            s.setVisible(true);
        }
    }
}
