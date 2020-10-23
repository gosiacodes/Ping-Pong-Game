package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application{
	
	//variable
	private static final double width = 800;
	private static final double height = 600;
	private static final double PLAYER_HEIGHT = 100;
	private static final double PLAYER_WIDTH = 15;
	private static final double BALL_R = 15;
	private double playerOneYPos = height / 2;
	private double playerTwoYPos = height / 2;
	private double playerOneXPos = 0;
	private double playerTwoXPos = width - PLAYER_WIDTH;
	private double ballXPos = width / 2;
	private double ballYPos = height / 2;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Primary stage settings
		primaryStage.setTitle("Ping-Pong Game");
		primaryStage.setResizable(false);
		
		// Layout for scene 1
		Canvas canvas = new Canvas(width, height);		
		Scene scene1 = new Scene((new StackPane(canvas)));
		
		// Set graphics
		GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
		// Set background color
		graphicsContext.setFill(Color.FORESTGREEN);
		graphicsContext.fillRect(0, 0, width, height);
				
		// Set text
		graphicsContext.setFill(Color.WHITE);
		graphicsContext.setFont(Font.font(25));

		// Draw player 1 & 2
		graphicsContext.fillRect(playerTwoXPos, playerTwoYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
		graphicsContext.fillRect(playerOneXPos, playerOneYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
		
		// Draw the ball
		graphicsContext.fillOval(ballXPos, ballYPos, BALL_R, BALL_R);
		
		// Draw line
		graphicsContext.setStroke(Color.WHITE);
		graphicsContext.setLineDashes(5);
		graphicsContext.setLineWidth(1);
		graphicsContext.strokeLine(400, 600, 400, 0);
		
		primaryStage.setScene(scene1);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
