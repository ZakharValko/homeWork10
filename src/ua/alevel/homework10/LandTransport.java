package ua.alevel.homework10;

public class LandTransport extends Transport {
    int wheelsQuantity;


    public static Builder newBuilder(){
        return new Builder();
    }

    public Builder toBuilder(){
        Builder newBuilder = new Builder();
        newBuilder.power = this.power;
        newBuilder.weight = this.weight;
        newBuilder.width = this.width;
        newBuilder.length = this.length;
        newBuilder.height = this.height;
        newBuilder.wheelsQuantity = this.wheelsQuantity;
        return newBuilder;
    }

    public static class Builder {
        private int power;
        private int weight;
        private int width;
        private int length;
        private int height;
        private int wheelsQuantity;

        private Builder builder(){
            return this;
        }

        public Builder wheelsQuantity(int wheelsQuantity) {
            this.wheelsQuantity = wheelsQuantity;
            return this;
        }

        public Builder power(int power){
            this.power = power;
            return this;
        }

        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder width(int width){
            this.width = width;
            return this;
        }

        public Builder length(int length){
            this.length = length;
            return this;
        }

        public Builder height(int height){
            this.height = height;
            return this;
        }

        public LandTransport build(){
            LandTransport landTransport = new LandTransport();
            landTransport.power = this.power;
            landTransport.weight = this.weight;
            landTransport.width = this.width;
            landTransport.length = this.length;
            landTransport.height = this.height;
            landTransport.wheelsQuantity = this.wheelsQuantity;
            return landTransport;
        }
    }
}

