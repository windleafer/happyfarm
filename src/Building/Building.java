package Building;

public class Building {
    private double Length;
    private double Width;
    private double Height;

    private Building(Builder builder){
        this.Length=builder.Length;
        this.Width=builder.Width;
        this.Height=builder.Height;
    }
    public double getLength() {
        return Length;
    }
    public void setLength(double Length) {
        this.Length = Length;
    }
    public double getWidth() {
        return Width;
    }
    public void setWidth(double Width) {
        this.Width = Width;
    }
    public double getHeight() {
        return Height;
    }
    public void setHeight(double Height) {
        this.Height = Height;
    }

    public static class Builder{
        private double Length;
        private double Width;
        private double Height;

        public Builder setLength(double Length) {
            this.Length=Length;
            return this;
        }
        public Builder setWidth(double Width) {
            this.Width=Width;
            return this;
        }
        public Builder setHeight(double Height) {
            this.Height=Height;
            return this;
        }

        public Building construct(){
            return new Building(this);
        }
    }
}



