package ex_27_Generics;

public class GenericsclassExample {

        public static void main(String[] args) {
            GenericClass<Integer> intObjRef = new GenericClass(5);
            GenericClass<String> stringObjRef = new GenericClass("Pramod");

            // T -> it is placeholder only -> it can be any data type.
            // when we are passing Integer value T will replaced by Integer value
            // when we are passing String value T will replaced by String value
            // when we are passing Double value T will replaced by Double value

        }
    }

    class GenericClass<T>{
        private T data;

        public GenericClass(T data){
            this.data = data;
        }

        public T getData(){
            return this.data;
        }

    }

