
import java.util.ArrayList;

public class ComputerSystem extends Component{

    private String OS;
    private ArrayList<Component> components;
    private double unitCost;

    public ComputerSystem(int componentId, String componentName, int stock, double unitCost, String OS) {
        super(componentId, componentName,stock);
        this.OS = OS;
        this.components = new ArrayList<Component>();
    }

    public void addComponent(Component component) {
    	components.add(component);
    }
    
    public ArrayList<Component> getComponents() {
        return components;

    }

    public void removeComponent(Component component) {
    	components.remove(component);
    }
    
    public Component getChildAtIndex(int i) {
        return components.get(i);
    }
    
    public String toString(){
    	 return super.toString() + "," + OS;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setUnitCost (double unitCost) {
        this.unitCost = unitCost;
    }

    public double getUnitCost() {
        return unitCost;
    }
 }