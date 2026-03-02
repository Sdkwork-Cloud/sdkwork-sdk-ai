package com.sdkwork.ai.model;

public class Categories {
    private Boolean hate;
    private Boolean sexual;
    private Boolean violence;
    private Boolean hateThreatening;
    private Boolean selfHarm;
    private Boolean sexualMinors;
    private Boolean violenceGraphic;
    private Boolean illegalAct;
    private Boolean illegalActInstruction;

    public Boolean getHate() {
        return this.hate;
    }
    
    public void setHate(Boolean hate) {
        this.hate = hate;
    }

    public Boolean getSexual() {
        return this.sexual;
    }
    
    public void setSexual(Boolean sexual) {
        this.sexual = sexual;
    }

    public Boolean getViolence() {
        return this.violence;
    }
    
    public void setViolence(Boolean violence) {
        this.violence = violence;
    }

    public Boolean getHateThreatening() {
        return this.hateThreatening;
    }
    
    public void setHateThreatening(Boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public Boolean getSelfHarm() {
        return this.selfHarm;
    }
    
    public void setSelfHarm(Boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public Boolean getSexualMinors() {
        return this.sexualMinors;
    }
    
    public void setSexualMinors(Boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public Boolean getViolenceGraphic() {
        return this.violenceGraphic;
    }
    
    public void setViolenceGraphic(Boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    public Boolean getIllegalAct() {
        return this.illegalAct;
    }
    
    public void setIllegalAct(Boolean illegalAct) {
        this.illegalAct = illegalAct;
    }

    public Boolean getIllegalActInstruction() {
        return this.illegalActInstruction;
    }
    
    public void setIllegalActInstruction(Boolean illegalActInstruction) {
        this.illegalActInstruction = illegalActInstruction;
    }
}
