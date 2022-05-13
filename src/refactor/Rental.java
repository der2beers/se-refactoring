package refactor;

class Rental {
    private Movie movie;
    private int daysRented;


    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}