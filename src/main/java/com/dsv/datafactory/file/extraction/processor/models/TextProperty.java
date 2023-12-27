package com.dsv.datafactory.file.extraction.processor.models;

import java.util.ArrayList;

@Data //we can use lombok builders to avoid setters and getters
public class TextProperty {
    private ArrayList<DetectedLanguage> detectedLanguages;
    private DetectedBreak detectedBreak;

    public TextProperty(){}

    public TextProperty(ArrayList<DetectedLanguage> detectedLanguages, DetectedBreak detectedBreak){
        this.detectedBreak = detectedBreak;
        this.detectedLanguages = detectedLanguages;
    }

    public void setDetectedBreak(DetectedBreak detectedBreak) {
        this.detectedBreak = detectedBreak;
    }

    public void setDetectedLanguages(ArrayList<DetectedLanguage> detectedLanguages) {
        this.detectedLanguages = detectedLanguages;
    }

    public DetectedBreak getDetectedBreak() {
        return detectedBreak;
    }

    public ArrayList<DetectedLanguage> getDetectedLanguages() {
        return detectedLanguages;
    }
}
