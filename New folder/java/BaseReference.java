public class BaseReference {
    private String EntityOID;
    private String WMEntityVersionID;
    private String WMpartition;
    private String RootID;
    private String parentEntityID;
    private String EntityType;
    private String EntityStatus;
    private String WMEntitySchemaName;
    private String WMEntitySchemaVersion;
    private String WMEntitySchemaCode;

    public BaseReference() {
    }

    public String getEntityOID() {
        return EntityOID;
    }

    public void setEntityOID(String entityOID) {
        EntityOID = entityOID;
    }

    public String getWMEntityVersionID() {
        return WMEntityVersionID;
    }

    public void setWMEntityVersionID(String WMEntityVersionID) {
        this.WMEntityVersionID = WMEntityVersionID;
    }

    public String getWMpartition() {
        return WMpartition;
    }

    public void setWMpartition(String WMpartition) {
        this.WMpartition = WMpartition;
    }

    public String getRootID() {
        return RootID;
    }

    public void setRootID(String rootID) {
        RootID = rootID;
    }

    public String getParentEntityID() {
        return parentEntityID;
    }

    public void setParentEntityID(String parentEntityID) {
        this.parentEntityID = parentEntityID;
    }

    public String getEntityType() {
        return EntityType;
    }

    public void setEntityType(String entityType) {
        EntityType = entityType;
    }

    public String getEntityStatus() {
        return EntityStatus;
    }

    public void setEntityStatus(String entityStatus) {
        EntityStatus = entityStatus;
    }

    public String getWMEntitySchemaName() {
        return WMEntitySchemaName;
    }

    public void setWMEntitySchemaName(String WMEntitySchemaName) {
        this.WMEntitySchemaName = WMEntitySchemaName;
    }

    public String getWMEntitySchemaVersion() {
        return WMEntitySchemaVersion;
    }

    public void setWMEntitySchemaVersion(String WMEntitySchemaVersion) {
        this.WMEntitySchemaVersion = WMEntitySchemaVersion;
    }

    public String getWMEntitySchemaCode() {
        return WMEntitySchemaCode;
    }

    public void setWMEntitySchemaCode(String WMEntitySchemaCode) {
        this.WMEntitySchemaCode = WMEntitySchemaCode;
    }
}
