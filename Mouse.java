

public class Mouse extends Component {
    private int dpi;
    private boolean programmableButtons;
    private boolean dpiSwitching;
    public Mouse(int componentId, String componentName, int stock, int dpi, boolean programmableButtons, boolean dpiSwitching) {
        super(componentId, componentName ,stock);
        this.dpi = dpi;
        this.programmableButtons = programmableButtons;
        this.dpiSwitching = dpiSwitching;
    }

    public String toString() {
    	return super.toString() + "," + this.dpi + "," + this.programmableButtons + "," + this.dpiSwitching;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public boolean isProgrammableButtons() {
        return programmableButtons;
    }

    public void setProgrammableButtons(boolean programmableButtons) {
        this.programmableButtons = programmableButtons;
    }

    public boolean isDpiSwitching() {
        return dpiSwitching;
    }

    public void setDpiSwitching(boolean dpiSwitching) {
        this.dpiSwitching = dpiSwitching;
    }
    
    public String getSpecs() {
    	return "DPI: " + dpi + " Programmable: " + programmableButtons + " DPI Switching: "  + dpiSwitching;
    }
}