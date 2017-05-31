package servicostecnicos.persistencia;

import java.io.File;
import java.io.IOException;
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
public class PersistenciaCatalogoArquivo implements PersistenciaCatalogo{

    private final String nomeArquivo = "catalogo.txt";

    private static PersistenciaCatalogoArquivo instance;

    public static PersistenciaCatalogoArquivo getInstance() {

        if (instance == null) {
            return new PersistenciaCatalogoArquivo();
        } else {
            return instance;
        }
    }

    @Override
    public boolean salvarCatalogo(List<String> catalogo) {
        File catalagoFile = new File(nomeArquivo);
        try {
            PrintStream printStream = new PrintStream(catalagoFile);

            for (String string : catalogo) {
                printStream.append(string);
                printStream.println();
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public List<String> lerCatalogo() {
        try {
            File catalagoFile = new File(nomeArquivo);
            List<String> list = new ArrayList<>();
            if (!catalagoFile.exists()) {
                catalagoFile.createNewFile();
                return list;
            }

            Scanner scanner = new Scanner(catalagoFile);
            if (catalagoFile.length() == 0) {
                return list;
            }
            while (scanner.hasNext()) {
                list.add(scanner.nextLine());
            }

            return list;
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaCatalogoArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
