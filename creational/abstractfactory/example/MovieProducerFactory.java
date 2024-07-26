package creational.abstractfactory.example;

interface MovieProducerFactory {
    public MovieFactory getMovieFactory(String movieProducer);
}

class PopularMovieProducerFactory implements MovieProducerFactory {
    @Override
    public MovieFactory getMovieFactory(String movieProducer) {
        if(movieProducer.equalsIgnoreCase("HollyWood")) {
            return new HollywoodMovies();
        } else if (movieProducer.equalsIgnoreCase("Bollywood")) {
            return new BollywoodMovies();
        }
        return null;
    }
}