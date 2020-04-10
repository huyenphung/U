package Config;


import java.io.IOException;
import java.util.Properties;

import Util.PathHelper;





public class PropertyFileReader implements ConfigurationReader{
	
	Properties properties=null;
	
	public PropertyFileReader() {
		properties=new Properties();
		try {
			properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getUrl() {
		return properties.getProperty("url");
	}

	@Override
	public String getBrowser() {
		return properties.getProperty("browser");
	}

	@Override
	public int getPageLoadTimeOut() {
		return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
	}

	
	}
