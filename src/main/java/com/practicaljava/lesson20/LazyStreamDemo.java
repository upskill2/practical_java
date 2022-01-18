package com.practicaljava.lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class LazyStreamDemo {

    // Populate beer collection
    static List<Beer> loadCellar(){
        List <Beer> beerStock = new ArrayList<>();

        beerStock.add(new Beer("Stella", "Belgium", 7.75f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Obolon", "Ukraine", 4.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Yuengling", "USA", 5.50f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Chimay Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));

        return beerStock;
    }

    public static void main(String[] args) {
        List <Beer> beers = loadCellar();

        //First itermidiate operation
        Stream <Beer> amerricanBeers = beers.stream().filter(beer -> {
            System.out.println("Inside filter: " + beer.country);
            return "USA".equals(beer.getCountry());
        });

        //Second itermediate operation

        DoubleStream americanBeerPrices = amerricanBeers.mapToDouble(beerss -> {
            System.out.println("Inside mapToDouble: " + beerss.name + " : " + beerss.price);
            return  beerss.price;
                    });

        // Commented out terminal operation
        System.out.println("The average American beer price is $" + americanBeerPrices.average().getAsDouble());
    }
}
