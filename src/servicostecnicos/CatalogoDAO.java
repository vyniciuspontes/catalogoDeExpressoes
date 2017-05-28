package servicostecnicos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcussouza
 */
public class CatalogoDAO {

    private final String nomeArquivo = "catalogo.txt";

    private static CatalogoDAO instance;

    public static CatalogoDAO getInstance() {

        if (instance == null) {
            return new CatalogoDAO();
        } else {
            return instance;
        }
    }

    public boolean salvarCatalogo(List<String> catalogo) {
        File catalagoFile = new File(nomeArquivo);
        try {
            PrintStream printStream = new PrintStream(catalagoFile);
            
            for (String string : catalogo) {
                printStream.append(string);
                printStream.println();
            }
            
            /*catalogo.forEach((string) -> {
                printStream.append(string);
                printStream.println();
            });*/
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public List<String> lerCatalogo() {
        try {
            File catalagoFile = new File(nomeArquivo);
            List<String> list = new ArrayList<>();
            if (!catalagoFile.exists()) {
                catalagoFile.createNewFile();
                return list;
            }

            Scanner scanner = new Scanner(catalagoFile);
            if (catalagoFile.length() == 0)
                return list;
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }

            return list;
        } catch (IOException ex) {
            Logger.getLogger(CatalogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
