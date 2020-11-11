package javacore.level4.lectore_8.moviefactory;

/*
MovieFactory
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while ((key = reader.readLine()) != null) {
            boolean vvod = key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller");
            Movie movie = MovieFactory.getMovie(key);
            if (vvod) {
                System.out.println(movie.getClass().getSimpleName());
            } else {
                break;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }


    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}