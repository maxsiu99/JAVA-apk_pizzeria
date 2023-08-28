package com.example.pizzeria;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria extends Application {


    @Override
    public void start(Stage primaryStage) {

        List<String> lista = new ArrayList<String>();


        Font font = Font.font("Arial" , FontWeight.BOLD , 25);

        Label napis = new Label("UKULAJ SE PITCE ");
        napis.setFont(Font.font("arial", 20));
        napis.setTextAlignment(TextAlignment.CENTER);


 /////////////////       FOTKI  WILEKIE  /////////////
        ImageView spod = new ImageView(new Image("Spod.png"));

        ImageView sos = new ImageView(new Image("Sos.png"));
        sos.setVisible(false);

        ImageView ser = new ImageView(new Image("ser.png"));
        ser.setVisible(false);

        ImageView salami = new ImageView(new Image("salami.png"));
        salami.setVisible(false);

        ImageView pomidor = new ImageView(new Image("pomidor.png"));
        pomidor.setVisible(false);

        ImageView pieczarka = new ImageView(new Image("pieczarka.png"));
        pieczarka.setVisible(false);

        ImageView papryka = new ImageView(new Image("papryka.png"));
        papryka.setVisible(false);

        ImageView oliwka = new ImageView(new Image("oliwka.png"));
        oliwka.setVisible(false);

        ImageView krewetka = new ImageView(new Image("krewetka.png"));
        krewetka.setVisible(false);

        ImageView cebula = new ImageView(new Image("cebula.png"));
        cebula.setVisible(false);

        ImageView bekon = new ImageView(new Image("bekon.png"));
        bekon.setVisible(false);

        ImageView ananas = new ImageView(new Image("ananas.png"));
        ananas.setVisible(false);

        ImageView szpinak = new ImageView(new Image("szpinak.png"));
        szpinak.setVisible(false);


        ////////////        FOTKI MAŁE   Z OPISEM       /////////////

        ImageView sosmin = new ImageView(new Image("Sos.png"));
        sosmin.setFitWidth(80);
        sosmin.setFitHeight(80);
        Label sosPomidorowy = new Label("Baza " , sosmin);
        sosPomidorowy.setFont(font);




        ImageView sermin = new ImageView(new Image("ser.png"));
        sermin.setFitWidth(80);
        sermin.setFitHeight(80);
        Label serminn = new Label("Ser żółty" , sermin);
        serminn.setFont(font);

        ImageView szpinakmin = new ImageView(new Image("szpinak.png"));
        szpinakmin.setFitWidth(80);
        szpinakmin.setFitHeight(80);
        Label szpinakA = new Label("Szpinak" , szpinakmin);
        szpinakA.setFont(font);


        ImageView salamimin = new ImageView(new Image("salami.png"));
        salamimin.setFitWidth(80);
        salamimin.setFitHeight(80);
        Label samamiA = new Label("Salami" , salamimin);
        samamiA.setFont(font);


        ImageView pomidormin = new ImageView(new Image("pomidor.png"));
        pomidormin.setFitWidth(80);
        pomidormin.setFitHeight(80);
        Label pomidorminA = new Label("Pomidor" , pomidormin);
        pomidorminA.setFont(font);


        ImageView pieczarkamin = new ImageView(new Image("pieczarka.png"));
        pieczarkamin.setFitWidth(80);
        pieczarkamin.setFitHeight(80);
        Label pieczarkaA = new Label("Pieczarki" , pieczarkamin);
        pieczarkaA.setFont(font);


        ImageView paprykamin = new ImageView(new Image("papryka.png"));
        paprykamin.setFitWidth(80);
        paprykamin.setFitHeight(80);
        Label paprykaA = new Label("Papryka" , paprykamin);
        paprykaA.setFont(font);


        ImageView oliwkamin = new ImageView(new Image("oliwka.png"));
        oliwkamin.setFitWidth(80);
        oliwkamin.setFitHeight(80);
        Label oliwkaA = new Label("Oliwki" , oliwkamin);
        oliwkaA.setFont(font);


        ImageView krewetkamin= new ImageView(new Image("krewetka.png"));
        krewetkamin.setFitWidth(80);
        krewetkamin.setFitHeight(80);
        Label krewetkaA = new Label("Krewetki" , krewetkamin);
        krewetkaA.setFont(font);


        ImageView cebulamin = new ImageView(new Image("cebula.png"));
        cebulamin.setFitWidth(80);
        cebulamin.setFitHeight(80);
        Label cebulaA = new Label("Cebula" , cebulamin);
        cebulaA.setFont(font);


        ImageView bekonmin = new ImageView(new Image("bekon.png"));
        bekonmin.setFitWidth(80);
        bekonmin.setFitHeight(80);
        Label bekonA = new Label("Bekon" , bekonmin);
        bekonA.setFont(font);


        ImageView ananasmin = new ImageView(new Image("ananas.png"));
        ananasmin.setFitWidth(80);
        ananasmin.setFitHeight(80);
        Label ananasA = new Label("Ananas " , ananasmin);
        ananasA.setFont(font);






        HBox hbox = new HBox();
        hbox.getChildren().add(napis);
        hbox.setAlignment(Pos.CENTER);
        hbox.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        hbox.setMinHeight(150);



 ////          MENU LEWE             ////////



        VBox vBox = new VBox();
        vBox.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        vBox.setMinWidth(300);
        vBox.setMaxHeight(650);
        vBox.getChildren().addAll(sosPomidorowy,serminn,ananasA,bekonA,cebulaA,krewetkaA,oliwkaA,paprykaA,pieczarkaA,pomidorminA,samamiA,szpinakA);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox);
        scrollPane.setMinWidth(300);
        scrollPane.setMaxHeight(650);


        sosPomidorowy.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (sos.isVisible() == false){
                    sos.setVisible(true);
                    lista.add("sos ");
                }else {
                    sos.setVisible(false);
                    lista.remove("sos ");
                }

                System.out.println(lista);

            }
        });

        szpinakA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (szpinak.isVisible() == false){
                    szpinak.setVisible(true);
                    lista.add("szpinak");
                }else {
                    szpinak.setVisible(false);
                    lista.remove("szpinak");
                }

                System.out.println(lista);
            }
        });

        serminn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (ser.isVisible() == false){
                    ser.setVisible(true);
                }else {
                    ser.setVisible(false);
                }

            }
        });

        samamiA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (salami.isVisible() == false){
                    salami.setVisible(true);
                }else {
                    salami.setVisible(false);
                }


            }
        });

        pomidorminA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (pomidor.isVisible() == false){
                    pomidor.setVisible(true);
                }else {
                    pomidor.setVisible(false);
                }


            }
        });

        pieczarkaA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (pieczarka.isVisible() == false){
                    pieczarka.setVisible(true);
                }else {
                    pieczarka.setVisible(false);
                }


            }
        });

        paprykaA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (papryka.isVisible() == false){
                    papryka.setVisible(true);
                }else {
                    papryka.setVisible(false);
                }


            }
        });

        oliwkaA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (oliwka.isVisible() == false){
                    oliwka.setVisible(true);
                }else {
                    oliwka.setVisible(false);
                }


            }
        });

        krewetkaA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (krewetka.isVisible() == false){
                    krewetka.setVisible(true);
                }else {
                    krewetka.setVisible(false);
                }


            }
        });

        cebulaA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (cebula.isVisible() == false){
                    cebula.setVisible(true);
                }else {
                    cebula.setVisible(false);
                }


            }
        });

        bekonA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (bekon.isVisible() == false){
                    bekon.setVisible(true);
                }else {
                    bekon.setVisible(false);
                }


            }
        });

        ananasA.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (ananas.isVisible() == false){
                    ananas.setVisible(true);
                }else {
                    ananas.setVisible(false);
                }


            }
        });







  ///     PIZZA     ///


        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(spod, sos, ser,ananas,salami,pomidor,pieczarka,papryka,oliwka,krewetka,cebula,bekon,szpinak);
        stackPane.setMaxHeight(650);









////////////////////////////////////////////////////////
       // Group group = new Group();

        BorderPane borderPane = new BorderPane();

        borderPane.setTop(hbox);
        borderPane.setRight(scrollPane);
        borderPane.setLeft(stackPane);


        Scene scene = new Scene(borderPane, 1000 , 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizzeria");
        primaryStage.show();


        //todo tworzyć pizze poprzez konstruktor


    }
}
