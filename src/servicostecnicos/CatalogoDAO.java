package servicostecnicos;

import dominio.CatalogoDeExpressao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author marcussouza
 */
public class CatalogoDAO {

    private static CatalogoDAO instance;
    
    public static CatalogoDAO getInstance(){
        
        if(instance == null)
            return new CatalogoDAO();
        else
            return instance;
    }
    
    public boolean salvarCatalogo(CatalogoDeExpressao catalogo) {
        File catalagoFile = new File("Catalogo de Expressao.txt");
        try {
            FileOutputStream fileOutput = new FileOutputStream(catalagoFile);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(catalogo);
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public CatalogoDeExpressao readCollection() throws FileNotFoundException, IOException, ClassNotFoundException {
        File catalagoFile = new File("Catalogo de Expressao.txt");
        FileInputStream fileInput = new FileInputStream(catalagoFile);
        
        if(catalagoFile.length() == 0)
            return null;
        
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
        CatalogoDeExpressao catalogo = (CatalogoDeExpressao) objectInputStream.readObject();
        return catalogo;
    }
    
}
