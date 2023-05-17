package dev.aman;

public class Main {

    public static void main(String[] args) {

        Park noseHill=new Park("Nose Hill park","51.121130954927224, -114.110214979823");
        Park edworthyPark=new Park("Edworthy Park","51.0710130837091, -114.15811633062448");

        var cityParks=new Park[]{noseHill,edworthyPark};

        Layer<Park> parkLayer=new Layer<>(cityParks);
        parkLayer.renderLayer();

        River bowRiver=new River("Bow river ","51.05177853407481, -114.05783242246815","51.04423870374283, -114.01625588591376","51.05572590145797, -114.07569707369218");

        var cityRiver=new River[]{bowRiver};
        Layer<River> riverLayer=new Layer<>(cityRiver);

        riverLayer.renderLayer();


    }

}
