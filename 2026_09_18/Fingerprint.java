public class Fingerprint {
    private String path;

    public Fingerprint(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Fingerprint [path=" + path + "]";
    }

    

    
}
