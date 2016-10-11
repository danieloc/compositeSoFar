import java.util.ArrayList;

public class mainProgram {
	public static void main(String args []) {
		ComputerSystem alienwareGamingPC = new ComputerSystem(13141252, "AlienWare Laptop", 6, 1200.66, "Windows");
		CPU leafCPU = new CPU(13141253, "Intel i7 4670K", 6, "Series 12", "12PinSocketType");
		GPU leafGPU = new GPU(13141254, "Radeon R280x",6, "3333Mhrz", 4);
		Keyboard leafKeyBoard = new Keyboard(13141255, "Logitech 1770m", 6, "NormalKeySwitchType", true);
		MemoryDrive leafMemoryDrive = new MemoryDrive(13141256, "Crucial SSD", 6, 1000, false);
		Motherboard leafMotherboard = new Motherboard(13141257, "ROF266", 6, "12PinSocketType", "Series 12", "3333Mhrz");
		RAM leafRam = new RAM(13141258, "RipTide" , 7, 16, "Dual");
		Mouse leafMouse = new Mouse(13141259, "Razor Deathador", 8, 900, true, true);
		alienwareGamingPC.addComponent(leafCPU);
		alienwareGamingPC.addComponent(leafGPU);
		alienwareGamingPC.addComponent(leafKeyBoard);
		alienwareGamingPC.addComponent(leafMemoryDrive);
		alienwareGamingPC.addComponent(leafMotherboard);
		alienwareGamingPC.addComponent(leafMouse);
		alienwareGamingPC.removeComponent(alienwareGamingPC.getChildAtIndex(3));

		int amountOfComps =  alienwareGamingPC.getComponents().size();
		for(int i =0; i< amountOfComps; i++) {
			String compName = alienwareGamingPC.getChildAtIndex(i).getComponentName();
			System.out.println(compName);
		}


		String series = alienwareGamingPC.getChildAtIndex(0).getSeries();
		System.out.println(series);


	}
}