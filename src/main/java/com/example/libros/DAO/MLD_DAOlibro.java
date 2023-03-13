package com.example.libros.DAO;

import com.example.libros.MLDlibros;

import java.util.ArrayList;
import java.util.List;

public class MLD_DAOlibro implements MLD_DAO {
    ArrayList<MLDlibros> biblio = new ArrayList<>();

    public MLD_DAOlibro(){
        biblio.add(new MLDlibros(1, "Fantasia","Rueda Del Tiempo","Robert Jordan",false));
        biblio.add(new MLDlibros(2,"Terror","It","Stephen King", false));
        biblio.add(new MLDlibros(3, "Romance","Red Queen","Victoria Aveyard", false));
    }

    @Override
    public ArrayList<MLDlibros> MLD_getAllLibro(){
        return biblio;
    }

    @Override
    public List<Integer> MLD_BookById(int id){
        List<Integer> libroID = new ArrayList<>();

        for (MLDlibros b : biblio) {
            if(b.getMLD_id_libros() == id){
                libroID.add(b.getMLD_id_libros());
            }
        }
        return  libroID;
    }

    @Override
    public List<String> MLD_BooksByCategory(String cat){
        List<String> libroCat = new ArrayList<>();

        for (MLDlibros b : biblio){
            if(b.getMLD_categoria().equals(cat)){
                libroCat.add(b.getMLD_categoria());
            }
        }
        return libroCat;
    }

    @Override
    public void MLD_saveLibros(MLDlibros estante) {
        biblio.add(estante);
    }

    @Override
    public void MLD_deleteLibros(MLDlibros estante){
        biblio.remove(estante);
    }

}
