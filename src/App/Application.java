package App;

import Database.Database;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

    public static Database db;
    public static DesktopUtil du;

    public static Database getDB() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }

    public static DesktopUtil getDU() {
        if (du == null) {
            du = new DesktopUtil();
        }
        return du;
    }

    public static String getAge(String age) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int date = Integer.parseInt(sdf.format(d));
        int ageEleve = Integer.parseInt(age);
        if ((date - ageEleve) > 1) {
            return date - ageEleve + " ans";
        }
        return date - ageEleve + " an";
    }

    /* Identifier le contenu d'un JDateChooser. 
    La méthode renvoie un String permettant d'identifier le contenu du JTextField associé au JDateChooser. */
    public static String donneContenuJDC(JDateChooser p_jdc) {
        /* On initialise le résultat comme "valide" */
        String resultat = "valide";
        /* si le Calendar du JDateChooser est "null" alors le contenu n'est "pas valide" ou "null" */
        if (p_jdc.getCalendar() == null) {
            /* On récupère le contenu du JTextField du JDateChooser */
            String contenu = ((JTextFieldDateEditor) p_jdc.getDateEditor()).getText();
            /* Si ce contenu est nul on modifie le résultat renvoyé comme "null" */
            if (contenu.equals("") == true) {
                resultat = "null";
            } /* Sinon on le spécifie comme "non valide" */ else {
                resultat = "non valide";
            }
        }
        /* on retourne le résultat */
        return resultat;
    }

    public static int arrondi(double f) {
        double scale = 1;
        return (int) (((f * scale) + 0.9d) / scale);

    }

    public static String getClasse(String classe) {
        String sql = "SELECT DISTINCT * FROM classe WHERE nom ='" + classe + "'";
        ResultSet rst = Application.getDB().executeQuery(sql);
        try {
            while (rst.next()) {
                return rst.getString("idLesClasses");
            }
        } catch (SQLException ex) {
        }
        return "";
    }

    public static int getIdEleve(String eleve) {
        int rep = 0;
        String sql = "SELECT id FROM eleve WHERE nom = '" + eleve + "'";
        ResultSet rst = Application.getDB().executeQuery(sql);
        try {
            while (rst.next()) {
                System.out.println(rst.getInt("id"));
                rep = rst.getInt("id");
            }
        } catch (SQLException ex) {
        }
        return rep;
    }
}
