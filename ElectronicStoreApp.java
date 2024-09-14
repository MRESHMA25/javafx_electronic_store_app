import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class ElectronicStoreApp {
    private ElectronicStore store;
    private ElectronicStoreView view;

    public ElectronicStoreApp(){
        this.store = ElectronicStore.createStore();
    }

    public void start(Stage primaryStage){
        Pane aPane = new Pane();

        view = new ElectronicStoreView();

        /**storeStockListView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
            if (newValue != null) {
                addToCartButton.setDisable(false);
            });

        storeStockListView.setOnMouseClicked(event -> {
            Product selectedProduct = storeStockListView.getSelectionModel().getSelectedItem();
            if (selectedProduct != null) {
                if (store.getStock(selectedProduct) > 0) {
                    store.addToCart(selectedProduct);
                    store.removeStock(selectedProduct, 1);
                    if (store.getStock(selectedProduct) == 0) {
                        view.updateStoreStock();
                    }
                    view.updateCart();
                }
            }
        });

         currentCartListView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
         if (newValue != null) {
         removeFromCartButton.setDisable(false);
         });

         removeFromCartButton.setOnAction(event -> {
         Product selectedProduct = currentCartListView.getSelectionModel().getSelectedItem().getProduct();
         if (selectedProduct != null) {
         store.removeFromCart(selectedProduct);
         store.addStock(selectedProduct, 1);
         view.updateCart();
         view.updateStoreStock();
         }
         });

         store.getCart().addListener((ListChangeListener<CartItem>) change -> {
         if (store.getCart().isEmpty()) {
         completeSaleButton.setDisable(true);
         } else {
         completeSaleButton.setDisable(false);
         }
         view.updateCartTotal();

         // Set an event listener on the 'Complete Sale' button to display a dialog with the total cost and clear the cart
         completeSaleButton.setOnAction(event -> {
         double totalCost = store.checkout();
         view.showCheckoutDialog(totalCost);
         });

         completeSaleButton.setOnAction(event -> {
         ObservableList<Product> cartProducts = cartListView.getItems();
         if (!cartProducts.isEmpty()) {
         double totalSaleValue = 0.0;
         for (Product p : cartProducts) {
         totalSaleValue += p.getPrice();
         store.removeCartItem(p);
         }
         store.incrementSales();
         store.incrementRevenue(totalSaleValue);
         double avgSaleValue = store.getRevenue() / store.getSales();
         view.updateStatistics(store.getSales(), store.getRevenue(), avgSaleValue);
         view.updateCart();
         }
         });
         // Get the Most Popular Items ListView from the view
         ListView<Product> mostPopularItemsListView = view.getMostPopularItemsListView();

         // Create a listener for the Complete Sale button to update the Most Popular Items ListView
         completeSaleButton.setOnAction(event -> {
         // Get the top 3 products that have been sold
         List<Product> mostPopularProducts = store.getMostPopularProducts(3);

         // Update the Most Popular Items ListView with the most popular products
         mostPopularItemsListView.getItems().clear();
         mostPopularItemsListView.getItems().addAll(mostPopularProducts);
         });

         resetStoreButton.setOnAction(event -> {
         store = ElectronicStore.createStore();
         view.updateStore();
         });*/


    }

}