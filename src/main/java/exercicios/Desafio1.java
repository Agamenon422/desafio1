package exercicios.dominio;

import exercicios.service.Animal;

import java.util.ArrayList;
import java.util.List;


public class Desafio1 {
    public static void main(String[] args) {
        // Criação de alguns animais
        Animal elefante = new Animal("Elefante", "Herbívoro", "Sexuada", "Terrestre", 6000);
        Animal girafa = new Animal(   "Girafa",  "Herbívoro", "Sexuada", "Terrestre", 2700);

        Animal baleiaAzul = new Animal("Baleia Azul",           "Carnívoro", "Sexuada", "Aquático", 150000);
        Animal golfinho = new Animal(   "Golfinho-cor-de-rosa", "Carnívoro", "Sexuada", "Aquático", 185);

        Animal crocodilo = new Animal(        "Crocodilo",       "Carnívoro", "Ovíparo", "Aquático", 230);
        Animal tartaturaMacinha = new Animal("Tartarua Marinha", "Carnívoro", "Ovíparo", "Aquático", 750);

        Animal cobra = new Animal("Cobra Piton", "Carnívoro", "Ovíparo", "Terrestre", 160);
        Animal harpia = new Animal("Harpia",     "Carnívoro", "Ovíparo", "Voador", 9);

        List<Animal> animais = new ArrayList<>();

        animais.add(elefante);
        animais.add(girafa);
        animais.add(baleiaAzul);
        animais.add(golfinho);
        animais.add(crocodilo);
        animais.add(tartaturaMacinha);
        animais.add(cobra);
        animais.add(harpia);


        //Selecionarar todos os animais com peso maior que 2 toneladas e de repodução sexuada;
        List<Animal> animalPesoReproducao = animais

                .stream()
                .filter(a -> a.getPeso() > 2000)
                .filter(a -> a.getReproducao().equalsIgnoreCase("Sexuada"))

                .filter(a -> a.getNome().equalsIgnoreCase("Elefante") ||
                        a.getNome().equalsIgnoreCase("Girafa") ||
                        a.getNome().equalsIgnoreCase("Baleia Azul") ||
                        a.getNome().equalsIgnoreCase("Golfinho-cor-de-rosa") ||
                        a.getNome().equalsIgnoreCase("Crocodilo") ||
                        a.getNome().equalsIgnoreCase("Tartarua Marinha") ||
                        a.getNome().equalsIgnoreCase("Cobra Piton") ||
                        a.getNome().equalsIgnoreCase("Harpia"))
                .toList();


        System.out.println("Animais com peso acima de 2 tonelada e reprodução sexuada: \n");
        animalPesoReproducao.forEach(System.out::println);
        System.out.println("\n");


        //Selecionarar todos os animais com repodução sexuada;
        List<Animal> animalReproducaoSexuada = animais

                .stream()
                .filter(a -> a.getReproducao().equalsIgnoreCase("Sexuada"))

                .filter(a -> a.getNome().equalsIgnoreCase("Elefante") ||
                        a.getNome().equalsIgnoreCase("Girafa") ||
                        a.getNome().equalsIgnoreCase("Baleia Azul") ||
                        a.getNome().equalsIgnoreCase("Golfinho-cor-de-rosa") ||
                        a.getNome().equalsIgnoreCase("Crocodilo") ||
                        a.getNome().equalsIgnoreCase("Tartarua Marinha") ||
                        a.getNome().equalsIgnoreCase("Cobra Piton") ||
                        a.getNome().equalsIgnoreCase("Harpia"))
                .toList();


        System.out.println("Animais com reprodução sexuada: \n");
        animalReproducaoSexuada.forEach(System.out::println);
        System.out.println("\n");

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Selecionarar todos os animais Oviparo e Aquático;
        List<Animal> aguaticoOviparo = animais

                .stream()
                .filter(a -> a.getLocomocao().equalsIgnoreCase("Aquático"))
                .filter(a -> a.getReproducao().equalsIgnoreCase("Ovíparo"))

                .filter(a -> a.getNome().equalsIgnoreCase("Elefante") ||
                        a.getNome().equalsIgnoreCase("Girafa") ||
                        a.getNome().equalsIgnoreCase("Baleia Azul") ||
                        a.getNome().equalsIgnoreCase("Golfinho-cor-de-rosa") ||
                        a.getNome().equalsIgnoreCase("Crocodilo") ||
                        a.getNome().equalsIgnoreCase("Tartarua Marinha") ||
                        a.getNome().equalsIgnoreCase("Cobra Piton") ||
                        a.getNome().equalsIgnoreCase("Harpia"))
                .toList();

        System.out.println("Animais Aquático e Ovipáros: \n");
        aguaticoOviparo.forEach(System.out::println);
        System.out.println("\n");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //Selecionarar todos os animais voadores;
        List<Animal> animalVoador = animais

                .stream()
                .filter(a -> a.getLocomocao().equalsIgnoreCase("Voador"))

                .filter(a -> a.getNome().equalsIgnoreCase("Elefante") ||
                        a.getNome().equalsIgnoreCase("Girafa") ||
                        a.getNome().equalsIgnoreCase("Baleia Azul") ||
                        a.getNome().equalsIgnoreCase("Golfinho-cor-de-rosa") ||
                        a.getNome().equalsIgnoreCase("Crocodilo") ||
                        a.getNome().equalsIgnoreCase("Tartarua Marinha") ||
                        a.getNome().equalsIgnoreCase("Cobra Piton") ||
                        a.getNome().equalsIgnoreCase("Harpia"))
                .toList();

        System.out.println("Animais Voadores: \n");
        animalVoador.forEach(System.out::println);
        System.out.println("\n");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}

