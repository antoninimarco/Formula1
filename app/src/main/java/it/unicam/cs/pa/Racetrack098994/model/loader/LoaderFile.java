package it.unicam.cs.pa.Racetrack098994.model.loader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import it.unicam.cs.pa.Racetrack098994.model.Game;

import java.io.*;

/**
 * classe utilizzata per creare e scrivere (salvare) il gioco da un file json
 */
public class LoaderFile {
    /**
     * Metodo utilizzato per creare una gara da un file json
     *
     * @param path path
     * @return
     */
    public static Game createGameFromPath(String path) throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(path));
        return gson.fromJson(reader, Game.class);
    }

    /**
     * Metodo utilizzato per salvare una gara da un file json
     *
     * @param path path
     * @param game gara
     */
    public static void saveGameToPath(String path, Game game) throws IOException {
        Writer writer = new FileWriter(path);
        Gson gson = new GsonBuilder().create();
        gson.toJson(game, writer);
        writer.close();
    }


}
