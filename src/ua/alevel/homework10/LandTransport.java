package ua.alevel.homework10;

public class LandTransport extends Transport {
    int wheelsQuantity;


    public static Builder newBuilder(){
        return new LandTransport().new Builder();
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

    public class Builder {
        private int power;
        private int weight;
        private int width;
        private int length;
        private int height;
        private int wheelsQuantity;

        private Builder(){

        }

        public Builder wheelsQuantity(int wheelsQuantity) {
            LandTransport.this.wheelsQuantity = wheelsQuantity;
            return this;
        }

        public Builder power(int power){
            LandTransport.this.power = power;
            return this;
        }

        public Builder weight(int weight){
            LandTransport.this.weight = weight;
            return this;
        }

        public Builder width(int width){
            LandTransport.this.width = width;
            return this;
        }

        public Builder length(int length){
            LandTransport.this.length = length;
            return this;
        }

        public Builder height(int height){
            LandTransport.this.height = height;
            return this;
        }

        public LandTransport build(){
            return LandTransport.this;
        }
    }
}

