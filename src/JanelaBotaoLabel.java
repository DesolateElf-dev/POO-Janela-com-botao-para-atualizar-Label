import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JanelaBotaoLabel extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        StackPane panPrincipal = new StackPane();
        Scene scn = new Scene(panPrincipal, 400, 200);

        Text texto = new Text("Aperte o botão abaixo");
        texto.setFont(Font.font(18));
        texto.setTextAlignment(TextAlignment.CENTER);
        StackPane.setAlignment(texto, Pos.TOP_CENTER);

        Button btn = new Button("Me Aperte");
        btn.setPrefWidth(100);
        btn.setPrefHeight(40);
        StackPane.setAlignment(btn, Pos.CENTER);
/*poc1        btn.addEventFilter(ActionEvent.ANY,
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent e) {
                        System.out.println("Implementação dentro do botão");
                        texto.setText("Hello World");
                    }
                });*/
/*opc2        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                texto.setText("Hello World2");
            }
        });*/
/*opc3        btn.setOnAction((e) ->{
            texto.setText("Hello World com lambda function");
        });*/
        btn.setOnAction(e-> texto.setText("Hello World com lambda function minimalista"));


        panPrincipal.getChildren().addAll(btn, texto);

        stage.setScene(scn);
        stage.setTitle("Aperte o Botão");
        stage.show();
    }

    public static void main(String[] args){
        Application.launch(JanelaBotaoLabel.class, args);
    }
}