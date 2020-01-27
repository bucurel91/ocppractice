package patterns.BuilderPattern;

import OCPPractice.bdesignPatternsAndPrinciples.functionalProgramming.Animal;

public class Animala {

    private String name;
    private int id;

    private Animala(){

    }


    public static Builder builder(){
        return new Animala().new Builder();
    }

    public class Builder{
        private Builder(){

        }

        public Builder setName(String name){
            Animala.this.name = name;
            return this;
        }

        public Builder setId(int id){
            Animala.this.id = id;
            return this;
        }

        public Animala build(){

            return Animala.this;
        }
    }

    @Override
    public String toString() {
        return "Animala{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
}
