import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
public class Template extends Application{  //zorg dat de class overerft van Application
  public void start(Stage stage){   //geef de stage mee als argument

    //creeer de "root node" Group
    Group rootNode = new Group();
    //Maak een nieuwe Scene met daarin de "root node"
    Scene scene = new Scene(rootNode, 800, 600);
    //plaats de Scene op de Stage
    stage.setScene(scene);

    //Inladen van een Image in een ImageView
    Image image = new Image("http://www.zombieplace.com/zombiecats/your-child-watched-too-many-zombie-movies.jpg", true);
    ImageView iv = new ImageView();
    iv.setImage(image);
    //De ImageView toevoegen aan de rootNode Group
    rootNode.getChildren().add(iv);

    //een extra group is optioneel als je meer groepen wilt hebben
    Group group1 = new Group();
    //plaats de extra groep in de root node
    rootNode.getChildren().add(group1);

    //maak een button aan en plaats deze in de extra group
    Button button = new Button("ik ben een Button");
    group1.getChildren().add(button);

    //laat de stage en inhoud renderen met de show() method
    stage.show();
  }
}
