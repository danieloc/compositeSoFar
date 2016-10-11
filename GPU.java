

public class GPU extends Component {

    private String memory;
    private int displayPorts;

    public GPU(int componentId, String componentName, int stock, String memory, int displayPorts) {
        super(componentId, componentName, stock);
        this.memory = memory;
        this.displayPorts = displayPorts;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getDisplayPorts() {
        return displayPorts;
    }

    public void setDisplayPorts(int displayPorts) {
        this.displayPorts = displayPorts;
    }

    public String toString(){
    	 return super.toString() + "," + this.memory +","  + this.displayPorts;
    }
    
    public String getSpecs() {
    	return "Memory: " + memory + " Display Ports: "  + displayPorts;
    }
}