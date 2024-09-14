import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ElectronicStoreView extends Application {
    private ElectronicStore store;
    private Button   resetButton;
    private Button   addToCartButton;
    private Button   removeFromCartButton;
    private Button   completeSaleButton;
    private TextField textField4;
    private TextField textField5;
    private TextField textField6;
    private TextField textField7;
    private BorderPane root;
    private ListView<Product> storeStockListView;

    public ElectronicStoreView() {
        this.store = store;
    }

    public void start(Stage primaryStage) {
        Pane aPane = new Pane();

        //Creating Buttons
        Button resetButton = new Button("Reset Store");
        resetButton.relocate(50, 330);
        resetButton.setPrefSize(120, 50);

        Button addToCartButton = new Button("Add To Cart");
        addToCartButton.relocate(310, 330);
        addToCartButton.setPrefSize(120, 50);
        addToCartButton.setDisable(true);

        Button removeFromCartButton = new Button("Remove from Cart");
        removeFromCartButton.relocate(510, 330);
        removeFromCartButton.setPrefSize(120, 50);
        removeFromCartButton.setDisable(true);

        Button completeSaleButton = new Button("Complete Sale");
        completeSaleButton.relocate(640, 330);
        completeSaleButton.setPrefSize(120, 50);
        completeSaleButton.setDisable(true);

        //Creating Labels
        Label label1 = new Label("Store Summary :");
        label1.relocate(60, 20);
        label1.setPrefSize(100, 5);

        Label label2 = new Label("Store Stock :");
        label2.relocate(350, 20);
        label2.setPrefSize(100, 5);

        Label label3 = new Label("Current Cart :");
        label3.relocate(600, 20);
        label3.setPrefSize(100, 5);

        Label label4 = new Label("# Sales :");
        label4.relocate(30, 50);
        label4.setPrefSize(100, 5);

        Label label5 = new Label("Revenue :");
        label5.relocate(20,80);
        label5.setPrefSize(100,5);

        Label label6 = new Label("$ / Sale :");
        label6.relocate(25,110);
        label6.setPrefSize(100,5);

        Label label7 = new Label("Most Popular Items :");
        label7.relocate(30,140);
        label7.setPrefSize(130,5);

        //Creating TextFields
        TextField textField2 = new TextField();
        textField2.relocate(260,50);
        textField2.setPrefSize(240,260);

        TextField textField3 = new TextField();
        textField3.relocate(510,50);
        textField3.setPrefSize(240,260);

        TextField textField4 = new TextField();
        textField4.relocate(80, 50);
        textField4.setPrefSize(100, 5);

        TextField textField5 = new TextField();
        textField5.relocate(80,80);
        textField5.setPrefSize(100,5);

        TextField textField6 = new TextField();
        textField6.relocate(80,110);
        textField6.setPrefSize(100,5);

        TextField textField7 = new TextField();
        textField7.relocate(20,170);
        textField7.setPrefSize(200,140);
/**
        public void displayStock(){
            System.out.println("Products in stock : ");
            ArrayList<Product> products = getProductsInStock();
            for(Product p : products){
                System.out.println(p.toString());
            }
            System.out.println();
        }
        public ArrayList<Product> getProductsInStock(){
            ArrayList<Product> products = new ArrayList<Product>();
            for (int i = 0; i<store.getCurProducts();i++){
                products.add(store.getStock()[i]);
            }
            return products;
        }
*/

        // Add all the components to the window
        aPane.getChildren().addAll(resetButton, addToCartButton, removeFromCartButton, completeSaleButton,
                label1, label2, label3, label4, label5, label6, label7,
                textField2, textField3, textField4, textField5, textField6, textField7);
        root = new BorderPane(aPane);
        primaryStage.setTitle("Electronic Store Application");
        primaryStage.setScene(new Scene(aPane, 800, 400));
        primaryStage.show();
    }

    public static void main (String[]args){
        launch(args);
    }

}
