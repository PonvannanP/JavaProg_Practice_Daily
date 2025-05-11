package ex_21_Abstraction;

public class Inv_Questions {

}

interface I11{} // This is possible to create
interface I12{} // This is possible to create

class A1{}// This is a Concrete class
class B1{}// This is a Concrete class
abstract class Pramod{} // abstract class
class T1 extends A1{} // This is possible
//class T2 extends A1,B1 // This is not possible Multiple Inheritance in classes is not allowed
//class T3 implements interface I11{}// This is possible
//class T4 implements interface I11,I12{}// This is possible
class Test5 extends A1 implements I11,I12{} // This is possible
