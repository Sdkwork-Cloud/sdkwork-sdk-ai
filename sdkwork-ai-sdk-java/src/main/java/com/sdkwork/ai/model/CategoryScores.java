package com.sdkwork.ai.model;

public class CategoryScores {
    private Double hate;
    private Double sexual;
    private Double violence;
    private Double hateThreatening;
    private Double selfHarm;
    private Double sexualMinors;
    private Double violenceGraphic;
    private Double illegalAct;
    private Double illegalActInstruction;

    public Double getHate() {
        return this.hate;
    }
    
    public void setHate(Double hate) {
        this.hate = hate;
    }

    public Double getSexual() {
        return this.sexual;
    }
    
    public void setSexual(Double sexual) {
        this.sexual = sexual;
    }

    public Double getViolence() {
        return this.violence;
    }
    
    public void setViolence(Double violence) {
        this.violence = violence;
    }

    public Double getHateThreatening() {
        return this.hateThreatening;
    }
    
    public void setHateThreatening(Double hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public Double getSelfHarm() {
        return this.selfHarm;
    }
    
    public void setSelfHarm(Double selfHarm) {
        this.selfHarm = selfHarm;
    }

    public Double getSexualMinors() {
        return this.sexualMinors;
    }
    
    public void setSexualMinors(Double sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public Double getViolenceGraphic() {
        return this.violenceGraphic;
    }
    
    public void setViolenceGraphic(Double violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    public Double getIllegalAct() {
        return this.illegalAct;
    }
    
    public void setIllegalAct(Double illegalAct) {
        this.illegalAct = illegalAct;
    }

    public Double getIllegalActInstruction() {
        return this.illegalActInstruction;
    }
    
    public void setIllegalActInstruction(Double illegalActInstruction) {
        this.illegalActInstruction = illegalActInstruction;
    }
}
