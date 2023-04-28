package com.saidworks.jsontojavaclasses.io;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.Objects;

@Configuration
public class PackageDeleteBeforeStart implements BeanPostProcessor {
    private static final String PACKAGE_TO_DELETE = "com.saidworks.jsontojavaclasses.io.models";


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // Delete the package before Spring context initialization
        deletePackage(PACKAGE_TO_DELETE);
        return bean;
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File child : Objects.requireNonNull(file.listFiles())) {
                System.out.println(child);
                deleteRecursive(child);
            }
        }
        file.delete();
    }
    private void deletePackage(String packagePath) {
        String packageBasePath = "src/main/java/";
        String packageDirectory = packageBasePath + packagePath.replace('.', File.separatorChar);
        File packageFile = new File(packageDirectory);

        if (packageFile.exists()) {
            deleteRecursive(packageFile);
        }
    }

}
