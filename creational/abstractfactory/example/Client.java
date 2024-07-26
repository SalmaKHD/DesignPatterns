package creational.abstractfactory.example;

public class Client {
    public static void main(String[] args) {
        MovieProducerFactory movieProducerFactory = new PopularMovieProducerFactory();
        MovieFactory movieProducer =  movieProducerFactory.getMovieFactory("Bollywood");
        Movie movie = movieProducer.getMovies("comedy");
        movie.getMovies();
        /*
        bollywood comedy movies
        */
    }
}
