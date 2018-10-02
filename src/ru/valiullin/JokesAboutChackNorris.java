package ru.valiullin;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JokesAboutChackNorris {
    public static void chuckNorrisJoke() throws MalformedURLException {
        URL url = new URL("http://api.icndb.com/jokes/random");

        try(InputStream urlStream = url.openStream();
            Reader reader = new InputStreamReader(urlStream);
            BufferedReader bufferedReader = new BufferedReader(reader))
        {
            ChuckNorrisValue chuckValue = new ChuckNorrisValue();
            ObjectMapper om = new ObjectMapper();
            ChuckNorrisType chuck = om.readValue(bufferedReader, ChuckNorrisType.class);
            System.out.println("Хотите " + chuck.getType() + " шутку о Чаке Норисе № " + chuckValue.getId() + "? " +
                    chuckValue.getJoke());
            System.out.println(chuck.toString());

            /*while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
