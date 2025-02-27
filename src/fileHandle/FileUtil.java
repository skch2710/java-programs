package fileHandle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;

public class FileUtil {
	
	private final static Path queuedFolder = Paths.get("C:/Users/HP/Desktop/UsersData/Queued");
    private final static Path successFolder = Paths.get("C:/Users/HP/Desktop/UsersData/Success");
    
	public static void moveFiles(String fileName) {
		try {
			Files.list(queuedFolder).forEach(file -> {
				try {
					System.out.println(">>File Name :: "+file.getFileName());
					System.out.println(">>File Name :: "+file.getFileName().toString().replace(".csv", ""));
					if (file.getFileName().toString().equals(fileName)) {
						// Move the file to the success folder
						Files.move(file, successFolder.resolve(file.getFileName()));
						System.out.println("Moved: " + file.getFileName());
					}
				} catch (IOException e) {
					System.err.println("Failed to move: " + file.getFileName() + " - " + e.getMessage());
				}
			});
		} catch (IOException e) {
			System.err.println("Error listing files in queued folder: " + e.getMessage());
		}
	}
	
	public static void deleteOldFiles() {
        try {
            Files.list(successFolder)
                 .forEach(file -> {
                     try {
                         BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
                         Instant fileCreationTime = attrs.creationTime().toInstant();
                         
                         // Check if the file is older than one month
                         if (fileCreationTime.isBefore(Instant.now().minus(1, ChronoUnit.MINUTES))) {
                             Files.delete(file);
                             System.out.println("Deleted: " + file.getFileName());
                         }
                     } catch (IOException e) {
                         System.err.println("Failed to delete: " + file.getFileName() + " - " + e.getMessage());
                     }
                 });
        } catch (IOException e) {
            System.err.println("Error listing files in success folder: " + e.getMessage());
        }
    }
	
	public static String fileToString(String filePath) {
		String result = "";
		try {
			Path path = Paths.get(filePath);
			byte[] allBytes = Files.readAllBytes(path);
			result = Base64.getEncoder().encodeToString(allBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public static void dataToTextFile(String filePath, String data) {
		try (FileWriter fw = new FileWriter(filePath, true)) {
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void readTextFile(String inFilePath,String outFilePath) {
		Path path = Paths.get(inFilePath);
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	dataToFile(outFilePath,line);
		    	break;
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void dataToFile(String filePath, String data) {
		byte[] byteData = Base64.getDecoder().decode(data);
		try(FileOutputStream fos = new FileOutputStream(filePath)){
			fos.write(byteData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	public static void main(String[] args) {
		
		String inFilePath = "C://Users//HP//Downloads//LPDS.txt";
		String outFilePath = "C://Users//HP//Downloads//LPDS.zip";
		
		readTextFile(inFilePath,outFilePath);
		
	}

}
