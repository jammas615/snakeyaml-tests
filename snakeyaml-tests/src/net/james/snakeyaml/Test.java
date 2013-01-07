package net.james.snakeyaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Test {

	public static void main(String [] args) {
		Yaml yaml = new Yaml();
		
		try {
			InputStream input = new FileInputStream(new File("modpacks.yml"));
			HashMap<String, String[]> data = (HashMap<String, String[]>) yaml.load(input);
			String[] modpacks = data.get("modpacks");
			System.out.println(data.get("modpacks"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
