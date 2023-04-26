package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Movie {
    private String name;
    private String format;
    private int yearOfRelease;
    private double rating;

    public Movie(String name, String format, int yearOfRelease, double rating) {
        this.name = name;
        this.format = format;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", format=" + format + ", yearOfRelease=" + yearOfRelease + ", rating=" + rating
                + "]";
    }
}

public class MovieStore {
    private static List<Movie> movies = new ArrayList<>();

    public void addMovie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name: ");
        String name = sc.nextLine();
        System.out.println("Enter the movie format (Blue Ray/DVD): ");
        String format = sc.nextLine();
        System.out.println("Enter the year of release: ");
        int yearOfRelease = sc.nextInt();
        System.out.println("Enter the movie rating: ");
        double rating = sc.nextDouble();

        Movie movie = new Movie(name, format, yearOfRelease, rating);
        movies.add(movie);
        System.out.println("Movie added successfully!");
    }

    public static void listAllMovies() {
        System.out.println("List of all available movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void listMoviesByFormat(Scanner scanner, List<Movie> movies2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie format (Blue Ray/DVD): ");
        String format = sc.nextLine();

        System.out.println("List of movies available in " + format + ":");
        for (Movie movie : movies) {
            if (movie.getFormat().equalsIgnoreCase(format)) {
                System.out.println(movie);
            }
        }
    }

    public void listMoviesByYearOfRelease() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of release: ");
        int yearOfRelease = sc.nextInt();

        System.out.println("List of movies released in the year " + yearOfRelease + ":");
        for (Movie movie : movies) {
            if (movie.getYearOfRelease() == yearOfRelease) {
                System.out.println(movie);
            }
        }
    }

    public void getTopRatedMovies() {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Double.compare(o2.getRating(), o1.getRating());
            }
        });

        System.out.println("Top 3 rated movies:");
        for (int i = 0; i < 3 && i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }

   
    		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n------- Movie Store Menu -------\n");
            System.out.println("1. Add New Movie");
            System.out.println("2. List all available movies");
            System.out.println("3. List movies by format");
            System.out.println("4. List movies by year of release");
            System.out.println("5. Get top 3 rated movies");
            System.out.println("6. Quit");

            System.out.print("\nEnter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewMovie(scanner, movies);
                    break;
                case 2:
                    listAllMovies();
                    break;
                case 3:
                    listMoviesByFormat(scanner, movies);
                    break;
                case 4:
                    listMoviesByYear(scanner, movies);
                    break;
                case 5:
                    listTop3RatedMovies(movies);
                    break;
                case 6:
                    System.out.println("Exiting program... Thank you for using the Movie Store!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

			private static void listTop3RatedMovies(List<Movie> movies2) {
				// TODO Auto-generated method stub
				
			}

			private static void listMoviesByYear(Scanner scanner, List<Movie> movies2) {
				// TODO Auto-generated method stub
				
			}

			private static void addNewMovie(Scanner scanner, List<Movie> movies2) {
				// TODO Auto-generated method stub
				
			}
}


                   

