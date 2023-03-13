package com.example.libros.DAO;

import com.example.libros.MLDlibros;

import java.util.ArrayList;
import java.util.List;

public interface MLD_DAO {


    ArrayList<MLDlibros> MLD_getAllLibro();

    List<Integer> MLD_BookById(int id);

    List<String> MLD_BooksByCategory(String cat);

    void MLD_saveLibros(MLDlibros estante);

    void MLD_deleteLibros(MLDlibros estante);
}
