/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author chadj
 */
public class DesktopUtil {

    public File file;
    public String absoluteFilePath = "C:/Users/Public/LivreExpress";
    public String fileName = "/utils.txt";
    private String id = "0", admin = "0", nom = "0";

    public DesktopUtil() {
        this.checkIsFileExist();
    }

    public void checkIsFileExist() {
        File fileDossier = new File(this.absoluteFilePath);
        if (!fileDossier.exists()) {
            try {
                fileDossier.mkdir();
                Path path = (Path) Paths.get(fileDossier.getPath() + this.fileName);
                File isFileExist = new File(fileDossier.getPath() + this.fileName);
                if (!isFileExist.exists()) {
                    Files.createFile(path);
                }
                removeData();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }

    public boolean isLogIn() {
        return !this.getId().equals("0");
    }

    public String getId() {
        return this.getValue(0);
    }

    public String getAdmin() {
        return this.getValue(2);
    }

    public String getNom() {
        return this.getValue(1);
    }

    public String getValue(int position) {
        String val = "0";
        File fileExist = new File(this.absoluteFilePath + this.fileName);
        if (fileExist.exists()) {
            try {
                int i = 0;
                for (String ligne : Files.readAllLines(fileExist.toPath())) {
                    if (i == position) {
                        val = ligne;
                        break;
                    }
                    i++;
                }
            } catch (IOException ex) {
                System.out.println("getValue : " + ex);
            }
        }
        return val;
    }

    public void writeData(int id, String nom, String profil) {
        ArrayList liste = new ArrayList();
        liste.add(id);
        liste.add(nom);
        liste.add(profil);
        writeInFile(liste);
    }

    public void removeData() {
        ArrayList liste = new ArrayList();
        liste.add("0");
        liste.add("0");
        liste.add("0");
        writeInFile(liste);
    }

    public void writeInFile(ArrayList array) {
        File fileExist = new File(this.absoluteFilePath + this.fileName);
        if (fileExist.exists()) {
            try (BufferedWriter buffwriter = new BufferedWriter(new FileWriter(fileExist))) {
                for (int i = 0; i < array.size(); i++) {
                    buffwriter.write(array.get(i).toString());
                    buffwriter.newLine();
                }
            } catch (Exception e) {
                System.out.println("write file " + e);
            }
        }
    }

}
