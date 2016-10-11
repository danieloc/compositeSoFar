
public class Keyboard extends Component {
    private String keySwitchType;
    private boolean backlit;

    public Keyboard(int componentId, String componentName, int stock, String keySwitchType, boolean backlit) {
        super(componentId, componentName ,stock);
        this.keySwitchType = keySwitchType;
        this.backlit = backlit;
    }

    public String toString() {
    	return super.toString() + "," + this.keySwitchType + "," + this.backlit;
    }

    public String getKeySwitchType() {
        return keySwitchType;
    }

    public void setKeySwitchType(String keySwitchType) {
        this.keySwitchType = keySwitchType;
    }

    public boolean isBacklit() {
        return backlit;
    }

    public void setBacklit(boolean backlit) {
        this.backlit = backlit;
    }
    
    public String getSpecs() {
    	return "Key Switch Type: " + keySwitchType + " Backlit: " + backlit;
    }
}