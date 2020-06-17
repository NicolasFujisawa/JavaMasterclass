
public class MegaBytesConverter {
	public static void printMegaByteAndKiloByte(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		
		int megaByte = kiloBytes / 1024;
		int restKiloBytes = kiloBytes % 1024;
		// "XX KB = YY MB and ZZZ KB"
		System.out.println(kiloBytes +  " KB = " + megaByte + " MB and " + restKiloBytes + " KB");
	}
}
