package creational.abstractfactory.example;

interface Movie {
    public void getMovies();
}

class HollywoodComedyMovie implements Movie {
    @Override
    public void getMovies() {
       System.out.println("hollywood comedy movies");
    }
    
}

class BollywoodComedyMovies implements Movie {
    @Override
    public void getMovies() {
       System.out.println("bollywood comedy movies");
    }
    
}