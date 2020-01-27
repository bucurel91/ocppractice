package OCA.polimorfism;

public interface MyInterface extends YourInterface,Ainterface {


  public default String getAddress(){      return "101 Smart Str";   }

}
