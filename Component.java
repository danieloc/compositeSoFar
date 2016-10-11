
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Component {

    private int componentId;
    private String componentName;
    private int stock;

    /**
     * Construct a new component using the provided item
     * and price.
     *
     * @param componentId the componentId of the component.
     * @param stock the amount left to sell for the component
     * @param componentName the componentName of the component.
     */
    public Component(int componentId, String componentName, int stock) {
        this.componentId = componentId; //Generate new Id function should be used here
        this.componentName = componentName;
        this.stock = stock;
    }
    
    /**
     * Get the ID of this Component.
     *
     * @return the ID of this Component.
     */
    public int getComponentId() {
        return componentId;
    }
    public void setComponentId(int newComponentId) {
        componentId =  newComponentId;
    }

    /**
     * Get the componentName of this Component.
     *
     * @return the componentName of this Component.
     */
    public String getComponentName() {
        return componentName;
    }
    public void setComponentName(String newComponentName) {
        componentName =  newComponentName;
    }
    
    /**
     * Get the stock of this Component.
     *
     * @return the stock of this Component.
     */
    public int getStock() {
        return stock;
    }
    public void setStock(int newStock) {
        stock =  newStock;
    }

    /**
     * Get a String that describes this Component. Note that
     * this method overrides the toString method inherited
     * from Object.
     *
     * @return a String describing this Component.
     */
    public String getComponentDetails() {
        return "\nComponent ID: " + this.componentId + "\nComponent Name: " + this.componentName + "\nStock: " + this.stock + "\n";
    }
}