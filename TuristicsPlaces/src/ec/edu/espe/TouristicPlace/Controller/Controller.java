package ec.edu.espe.controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class Controller {

    public void save(TouristicPlace touristicplace) {
        TouristicPlace[] touristicplace = new TouristicPlace[FileManager.countLines(" touristicplace ")];
        String[] rows = new String[FileManager.countLines("touristicplace")];
        read(rows, touristicplace);
        if (find(touristicplace, touristicplace.getName()) != -1) {
            JOptionPane.showMessageDialog(null, "touristicplace -> " + touristicplace.getName() + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = touristicplace.getName() + "," + touristicplace.gettype() + "," + touristicplace.getlongitude() + "," + touristicplace.getlatitude()  + "," + touristicplace.getdistance()
                    + "," + touristicplace.getLongitudeStart() + "," + touristicplace.getLatitudeStart();
            FileManager.save(data, "touristicplace");
        }
    }

    public void read(String[] data, TouristicPlace[] touristicplace) {

        FileManager.read("turisticplace", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForTouristicPlace = data[i].split(",");

            //building an object with the splitted data
            String name = dataForTouristicPlace[0];
            String type = dataForTouristicPlace[1];
            float latitude = Float.parseFloat(dataForTouristicPlace[2]);
            float longitude = Float.parseFloat(dataForTouristicPlace[3]);
            float distance = Float.parseFloat(dataForTouristicPlace[4]);
            float LatitudeStart = Float.parseFloat(dataForTouristicPlace[5]);
            float LongitudeStart = Float.parseFloat(dataForTouristicPlace[6]);

            touristicplace[i] = new TouristicPlace(name, type, longitude, latitude, distance, LongitudeStart, LatitudeStart);
        }
    }

    public int find(TouristicPlace[] touristicplace, String name) {
        for (int i = 0; i < touristicplace.length; i++) {
            if (name.equals(touristicplace[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populateTouristicPlaceTable(JTable jTable, TouristicPlace[] touristicplace) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[touristicplace.length];
        for (int i = 0; i < touristicplace.length; i++) {
            rowData[0] = touristicplace[i].getName();
            rowData[1] = touristicplace[i].gettype();
            rowData[2] = touristicplace[i].getlatitude();
            rowData[3] = touristicplace[i].getlongitude();
            rowData[4] = touristicplace[i].getdistance();
            rowData[5] = touristicplace[i].getLatitudeStart();
            rowData[6] = touristicplace[i].getLongitudeStart();
            model.addRow(rowData);
        }

    }

    public static double distanciaCoord(double lat1, double lng1, double lat2, double lng2) {
        //double radioTierra = 3958.75;//en millas  
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        double distancia = radioTierra * va2;

        return distancia;
    }
}
