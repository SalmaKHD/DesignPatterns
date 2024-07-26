package creational.abstractfactory.example;

interface MovieFactory {
   public Movie getMovies(String movie);
}

class HollywoodMovies implements MovieFactory {

    @Override
    public Movie getMovies(String type) {
        if(type.equalsIgnoreCase("comedy")) {
            return new HollywoodComedyMovie();
        }
        else return null;
    }
    
}

class BollywoodMovies implements MovieFactory {

    @Override
    public Movie getMovies(String movie) {
        if(movie.equalsIgnoreCase("comedy")){
            return new BollywoodComedyMovies();
        }
        return null;
    }
    
}