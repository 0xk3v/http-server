package com.http_server.config;

public class ConfigurationManager {
    private static ConfigurationManager myConfigurationManager;
    private static Configuration myCurrentConfiguration;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (myConfigurationManager == null) {
            myConfigurationManager = new ConfigurationManager();

        }
        return myConfigurationManager;
    }

    /**
     * Used to load config file by the file provider
     * 
     * @param filePath
     */
    public void loadConfigurationFile(String filePath) {
    }

    /**
     * Returns the current loaded configurations
     */
    public void getCurrentConfiguration() {

    }

}
