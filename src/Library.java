

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Library extends Application{
	private TextField authorText = new TextField();
	private TextField titleText = new TextField();
	private TextField pagesText = new TextField();
	private TextField display = new TextField();
	private Button addBook = new Button("Make New Book");
	
	private TextField vidTitle = new TextField();
	private TextField vidDir = new TextField();
	private TextField vidMin = new TextField();
	private TextField vidActor = new TextField();
	private TextField vidActress = new TextField();
	private Button addVideo = new Button("Make New Video");
	DataSetBook library = new DataSetBook();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		GridPane grid = new GridPane();
		grid.setHgap(5);
		grid.setVgap(5);
		grid.add(new Label ("Author"), 0, 0);
		grid.add(authorText, 0, 1);
		grid.add(new Label ("Title"), 1, 0);
		grid.add(titleText, 1, 1);
		grid.add(new Label ("Pages"), 2, 0);
		grid.add(pagesText, 2, 1);
		grid.add(addBook, 3, 1);
		grid.add(new Label ("Video Title"), 0, 2);
		grid.add(vidTitle, 0, 3);
		grid.add(new Label ("Director"), 1, 2);
		grid.add(vidDir, 1, 3);
		grid.add(new Label ("Minutes"), 2, 2);
		grid.add(vidMin, 2, 3);
		grid.add(new Label ("Actor"), 0, 4);
		grid.add(vidActor, 0, 5);
		grid.add(new Label ("Actress"), 1, 4);
		grid.add(vidActress, 1, 5);
		grid.add(addVideo, 3, 3);
		
		display.setMinHeight(200);
		grid.add(display, 0, 6, 5, 3);
		
		grid.setAlignment(Pos.TOP_LEFT);

		addBook.setOnAction(e -> addBookEvent());
		addVideo.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent e) {
			Video v = new Video(vidTitle.getText(), vidDir.getText(), vidActor.getText(), vidActress.getText(), Integer.parseInt(vidMin.getText()));
				library.add(v);
				display.setText(library.toString());
				vidTitle.clear();
				vidDir.clear();
				vidActor.clear();
				vidActress.clear();
				vidMin.clear();
			}
		});
			
		Scene scene = new Scene(grid, 700, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void addBookEvent() {
			Book b = new Book(authorText.getText(), titleText.getText(), Integer.parseInt(pagesText.getText()));
			library.add(b);
			display.setText(library.toString());
			authorText.clear();
			titleText.clear();
			pagesText.clear();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		}
		
	}




