

public class RAM extends Component {

    private String type;
    private String multiChannel;
    private int gigaBytes;

    public RAM(int componentId, String componentName, int stock, int gigaBytes, String multiChannel) {
        super(componentId, componentName ,stock);
        this.gigaBytes = gigaBytes;
        this.multiChannel = multiChannel;
    }

    public int getGigaBytes() {
        return gigaBytes;
    }

    public void setGigaBytes(String type) {
        this.type = type;
    }

    public String getMultiChannel() {
        return multiChannel;
    }

    public void setMultiChannel(String multiChannel) {
        this.multiChannel = multiChannel;
    }
    
    public String getSpecs() {
    	return "gigaBytes: : " + gigaBytes + " Multi Channel: " + multiChannel;
    }
    
    public String toString() {
    	 return super.toString() + "," + this.gigaBytes + "," + this.multiChannel;
    }
}