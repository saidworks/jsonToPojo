package com.saidworks.jsontojavaclasses.io;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsonToJavaClassConversion{

    public void applyForDirectory(String pathToDirectory){
        String packageName = "com.saidworks.jsontojavaclasses.io.models";
        
        File directory = new File(pathToDirectory);
        File[] jsonModels = directory.listFiles();
        if(jsonModels != null){
            for(File file:jsonModels){
                String packageBasePath = "src/main/java/";
                File outputPojoDirectory = new File(packageBasePath);
                outputPojoDirectory.mkdirs();
                try {
                    convertJsonToJavaClass(file.toURI().toURL(), outputPojoDirectory, packageName, file.getName().replace(".json", ""));
                } catch (IOException e) {
                    System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }

}