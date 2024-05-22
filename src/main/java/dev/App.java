package dev;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        try {
            String titre = ResourceBundle.getBundle("application", Locale.ROOT).getString("titre");
            String titleAsciiArt = FigletFont.convertOneLine(titre);
            System.out.println(titleAsciiArt);

            String environment = ResourceBundle.getBundle("application", Locale.ROOT).getString("environnement");
            String environmentAsciiArt = FigletFont.convertOneLine(environment);
            System.out.println(environmentAsciiArt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
